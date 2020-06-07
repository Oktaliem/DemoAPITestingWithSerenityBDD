package com.restapi.github.steps;

import com.restapi.github.constants.Endpoints;
import com.restapi.github.databuilder.PaymentDataBuilder;
import com.restapi.github.databuilder.SerenityUtil;
import com.restapi.github.databuilder.StepsUtil;
import com.restapi.github.model.PaymentRequestModel;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.path.json.JsonPath.from;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.isEmptyOrNullString;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

public class RestAPISteps {

    RequestSpecification requestSpecification = new RequestSpecBuilder()
            .addHeader("Api-Key", SerenityUtil.getEnv("api.key"))
            .addHeader("Content-Type", "application/json")
            .setBaseUri(StepsUtil.getAPIURL())
            .build();

    RequestSpecification employeeRequestSpec = new RequestSpecBuilder()
            .setBaseUri(StepsUtil.getEmployeeAPI())
            .build();

    @Step
    public void ableToGetVoidPaymentListSuccessfully() throws Exception {
        String response = getVoidPaymentList();
        assertThat(200, equalTo(SerenityRest.then().extract().statusCode()));
        assertThat(from(response).get("[0]._id"), equalTo("5ac3ad01409b7c5f1337e7db"));
        assertThat(from(response).get("[0].transaction_id"), equalTo("12k33456"));
        assertThat(from(response).get("[0].original_currency_code"), equalTo("SGD"));
        assertThat(from(response).get("[0].original_amount"), equalTo("20"));
        assertThat(from(response).get("[0].exchange_rate"), equalTo("1"));
        assertThat(from(response).get("[0].final_currency_code"), equalTo("SDG"));
        assertThat(from(response).get("[0].final_amount"), equalTo("20"));
        assertThat(from(response).get("[0].__v"), equalTo(0));
        String keys[] = {"[0]._id",
                "[0].transaction_id",
                "[0].original_currency_code",
                "[0].original_amount",
                "[0].exchange_rate",
                "[0]._id",
                "[0].final_currency_code",
                "[0].final_amount",
                "[0].__v"
        };
        for (String key : keys) {
            try {
                assertThat(from(response).get(key), not(isEmptyOrNullString()));
            } catch (AssertionError e) {
            } finally {
                try {
                    assertNotNull(from(response).get(key));
                } catch (AssertionError e) {
                    System.out.println("Error Message : " + key + " is Null, Check Your Json Key");
                    fail();
                }
            }
        }

    }

    private String getVoidPaymentList() throws Exception {
        return SerenityRest.rest().spec(requestSpecification)
                .given().relaxedHTTPSValidation()
                .log().all()
                .when()
                .get(Endpoints.GET_VOID_TRANSACTION)
                .then()
                .log().all()
                .extract().asString();
    }

    @Step
    public void ableToPostVoidPaymentSuccessfully(PaymentRequestModel requestBody) {
        String response = voidPayment(requestBody);
        assertThat(200, equalTo(SerenityRest.then().extract().statusCode()));
        assertThat(from(response).get("action_code"), equalTo("0"));
        assertThat(from(response).get("reason"), equalTo("Transaction voided successfully"));
    }

    private String voidPayment(PaymentRequestModel requestBody) {
        Map<String, Object> params = new HashMap<>();
        params.put("transaction_id", requestBody.getTransaction_id());
        params.put("original_currency_code", requestBody.getOriginal_currency_code());
        params.put("original_amount", requestBody.getOriginal_amount());
        params.put("exchange_rate", requestBody.getExchange_rate());
        params.put("final_currency_code", requestBody.getFinal_currency_code());
        params.put("final_amount", requestBody.getFinal_amount());
        String json = PaymentDataBuilder.buildJson(params);
        String response = SerenityRest.rest().spec(requestSpecification)
                .given().relaxedHTTPSValidation()
                .log().all()
                .when()
                .body(json)
                .post(Endpoints.POST_VOID_TRANSACTION)
                .then()
                .log().all()
                .extract().asString();
        return response;
    }

    @Step
    public void getAllEmployeeData() throws Exception {
        String response = getEmployee();
    }

    private String getEmployee() throws Exception {
        return SerenityRest.rest().spec(employeeRequestSpec)
                .given().relaxedHTTPSValidation()
                .log().all()
                .when()
                .get(Endpoints.GET_EMPLOYEE)
                .then()
                .log().all()
                .extract().asString();
    }
}
