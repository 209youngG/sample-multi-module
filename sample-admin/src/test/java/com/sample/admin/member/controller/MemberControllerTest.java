package com.sample.admin.member.controller;

import com.sample.admin.member.acceptance.AcceptanceTest;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@AcceptanceTest
class MemberControllerTest {

    @Test
    void 맴버확인() {
        // given

        // when
        ExtractableResponse<Response> result = RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .when().get("/v1/member")
                .then().log().all()
                .extract();

        // verify
        assertThat(result.statusCode()).isEqualTo(HttpStatus.OK.value());
    }
}