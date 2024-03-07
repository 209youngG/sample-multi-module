package com.sample.api.external.member.service;

import com.sample.api.external.member.dto.MemberRequest;
import com.sample.core.domain.rdb.member.Member;
import com.sample.core.domain.rdb.member.MemberRepository;
import com.sample.core.domain.rdb.member.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member getMember(long memberId) {
        return memberRepository.findById(memberId).orElseThrow(() -> new IllegalArgumentException("맴버가 없습니다."));
    }

    public void saveMember(MemberRequest memberRequest) {
        memberRepository.save(memberRequest.toEntity());
    }
}
