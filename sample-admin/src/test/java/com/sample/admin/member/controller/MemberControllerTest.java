package com.sample.admin.member.controller;

import com.sample.admin.member.acceptance.AcceptanceTest;
import com.sample.admin.member.dto.MemberRequest;
import com.sample.core.domain.rdb.member.MemberRole;
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
    void 맴버확인불가_존재하지_않음() {
        // given

        // when
        ExtractableResponse<Response> result = RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .when().get("/v1/member/{memberId}", 1L)
                .then().log().all()
                .extract();

        // verify

        assertThat(result.statusCode()).isEqualTo(HttpStatus.OK.value());
    }

    @Test
    void 맴버리스트() {
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

    @Test
    void 맴버저장() {
        // given
        MemberRequest memberRequest = new MemberRequest("tester1", MemberRole.ADMIN);

        // when
        ExtractableResponse<Response> result = RestAssured
                .given().log().all()
                .contentType(ContentType.JSON)
                .body(memberRequest)
                .when().post("/v1/member")
                .then().log().all()
                .extract();

        // verify
        assertThat(result.statusCode()).isEqualTo(HttpStatus.OK.value());
    }
}