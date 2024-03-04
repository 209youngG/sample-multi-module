package com.sample.admin.member.controller;

import com.common.dto.SuccessResponse;
import com.sample.admin.member.dto.MemberResponse;
import com.sample.core.domain.rdb.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/member")
@RequiredArgsConstructor
public class MemberController {

    private final MemberService memberService;

    @GetMapping("")
    public ResponseEntity<SuccessResponse<List<MemberResponse>>> getMembers() {
        List<MemberResponse> responses = memberService.getMembers()
                .stream()
                .map(MemberResponse::to)
                .toList();

        return ResponseEntity.ok(new SuccessResponse<>(1, "", responses));
    }
}
