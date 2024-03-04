package com.sample.admin.member.acceptance;

import io.restassured.RestAssured;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.support.AbstractTestExecutionListener;

class AcceptanceTestExecutionListener extends AbstractTestExecutionListener {


    @Override
    public void beforeTestMethod(final TestContext testContext) {
        final Integer serverPort = testContext.getApplicationContext().getEnvironment().getProperty("local.server.port", Integer.class);
        if (serverPort == null) {
            throw new IllegalStateException("localServerPort cannot be null");
        }

        RestAssured.port = serverPort;
    }

}