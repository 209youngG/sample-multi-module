package com.sample.admin.member.service;

import com.sample.core.domain.rdb.member.Member;
import com.sample.core.domain.rdb.member.MemberRepository;
import com.sample.core.domain.rdb.member.MemberRole;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
class MemberServiceImplTest {
    @InjectMocks
    private MemberServiceImpl memberService;

    @Mock
    private MemberRepository memberRepository;

    @Test
    void 맴버조회() {
        // given
        doReturn(List.of(member(MemberRole.USER), member(MemberRole.ADMIN), member(MemberRole.ADMIN)))
                .when(memberRepository)
                .findAll();

        // when
        List<Member> result = memberService.getMembers();

        // then
        assertThat(result).hasSize(2);
    }

    private Member member(MemberRole memberRole) {
        return Member.builder()
                .memberRole(memberRole)
                .build();
    }
}