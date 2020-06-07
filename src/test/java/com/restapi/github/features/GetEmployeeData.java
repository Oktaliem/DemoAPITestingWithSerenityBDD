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

@RunWith(SerenityRunner.class)
@WithTags(
        {
                @WithTag(type = "API", name = "Get All Employee"), @WithTag(type = "API", name = "Get_All_Employee")
        }
)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GetEmployeeData {
    @Steps
    RestAPISteps user;

    @Before
    public void prepareTestData() {

    }

    @Test
    public void retrieveEmployeeData() throws Exception {
        user.getAllEmployeeData();
    }


}
