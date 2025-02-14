package com.sample.api.external.member.service;

import com.sample.api.external.member.dto.MemberRequest;
import com.sample.core.domain.rdb.member.Member;
import com.sample.core.domain.rdb.member.MemberRepository;
import com.sample.core.domain.rdb.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.ErrorResponseException;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member getMember(long memberId) {
        return memberRepository.findById(memberId).orElseThrow(() -> new ErrorResponseException(HttpStatus.NOT_FOUND));
    }

    public void saveMember(MemberRequest memberRequest) {
        memberRepository.save(memberRequest.toEntity());
    }
}
