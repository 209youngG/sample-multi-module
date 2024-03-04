package com.common.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Schema(description = "실패 Response")
@Getter
public class ErrorResponse {

    @Schema(description = "실패 코드", defaultValue = "-1")
    private final int code;
    @Schema(description = "실패 메세지", defaultValue = "1")
    private final String message;

    public ErrorResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
