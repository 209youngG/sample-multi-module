package com.sample.api.external.member.controller;

import com.common.dto.SuccessResponse;
import com.sample.api.external.member.dto.MemberRequest;
import com.sample.api.external.member.dto.MemberResponse;
import com.sample.api.external.member.service.MemberServiceImpl;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberServiceImpl memberService;

    @GetMapping("/{memberId}")
    public ResponseEntity<SuccessResponse<MemberResponse>> getMember(@PathVariable long memberId) {
        MemberResponse responses = MemberResponse.to(memberService.getMember(memberId));

        return ResponseEntity.ok(new SuccessResponse<>(1, "", responses));
    }

    @PostMapping("")
    public ResponseEntity<SuccessResponse<List<MemberResponse>>> saveMember(
            @Parameter(name = "memberRequest", description = "맴버 저장") @RequestBody MemberRequest memberRequest
            ) {
        memberService.saveMember(memberRequest);

        return ResponseEntity.ok(new SuccessResponse<>(1, "", null));
    }
}
