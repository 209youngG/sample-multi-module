package com.sample.admin.member.service;

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
    public List<Member> getMembers() {
        return memberRepository.findAll()
                .stream()
                .filter(Member::isAdmin)
                .toList()
                ;
    }
}
