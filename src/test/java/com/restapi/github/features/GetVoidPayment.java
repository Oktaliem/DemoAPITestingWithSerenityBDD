package com.restapi.github.features;


import com.restapi.github.steps.RestAPISteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.WithTag;
import net.thucydides.core.annotations.WithTags;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
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
                @WithTag(type = "API", name = "PaymentAPI"), @WithTag(type = "API", name = "Get_Void_Payment")
        }
)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GetVoidPayment {

    @Steps
    RestAPISteps user;

    @Before
    public void prepareTestData() {

    }

    @Test
    public void ableToGetVoidPaymentListSuccessfully() throws Exception {
        user.ableToGetVoidPaymentListSuccessfully();
    }

}
