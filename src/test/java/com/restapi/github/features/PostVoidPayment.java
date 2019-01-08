package com.restapi.github.features;

import com.restapi.github.model.PaymentRequestModel;
import com.restapi.github.steps.RestAPISteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

/**
 * @Author : Okta  Liem
 * How to run the test via command line
 * mvn clean verify -Dit.test=com.restapi.github.features.* -Dtags=API:PaymentAPI -Dskip-test=true
 */

@RunWith(SerenityRunner.class)
@WithTags(
        {
                @WithTag(type = "API", name = "PaymentAPI"), @WithTag(type = "API", name = "Post_Void_Payment")
        }
)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PostVoidPayment {
    @Steps
    RestAPISteps user;

    @Rule
    public TestName testName = new TestName();
    public PaymentRequestModel requestBody = new PaymentRequestModel();

    @Before
    public void prepareTestData() throws Exception {
        requestBody.setTransaction_id("12k33456")
                .setOriginal_currency_code("IDR")
                .setOriginal_amount("20")
                .setExchange_rate("1")
                .setFinal_currency_code("IDR")
                .setFinal_amount("20");
    }

    @Test
    public void ableToPostVoidPaymentListSuccessfully() throws Exception {
        user.ableToPostVoidPaymentSuccessfully(requestBody);
    }
}
