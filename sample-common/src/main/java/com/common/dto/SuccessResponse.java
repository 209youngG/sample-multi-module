package com.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Schema(description = "성공 Response")
@Getter
public class SuccessResponse<T> {

    // 성공 : 200 -> HttpStatus.OK.value()
    // 실패 : 400 -> HttpStatus.BAD_REQUEST.value()
    @Schema(description = "성공 코드", defaultValue = "1")
    private int code;
    @Schema(description = "성공 메세지", defaultValue = "성공")
    private String message;
    @Schema(description = "결과 body 값")
    private T result;

    public SuccessResponse(int code, String message, T result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }

    public SuccessResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public SuccessResponse(T result) {
        this.code = 1;
        this.message = "성공";
        this.result = result;
    }

    public SuccessResponse() {

    }
}
