package com.restapi.github.junitlistener;

import com.restapi.github.database.SQLHelperFacade;
import com.restapi.github.database.SQLType;
import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.RunListener;


public class TestListener extends RunListener {
    @Override
    public void testRunStarted(Description description) throws Exception {
    }

    @Override
    public void testRunFinished(Result result) throws Exception {
        System.out.println("Close SQL Connection if exist");
        SQLHelperFacade.closeConnection(SQLType.ORACLE);
    }
}
