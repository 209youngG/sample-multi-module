package com.sample.api.external.member.dto;

import com.sample.core.domain.rdb.member.Member;
import com.sample.core.domain.rdb.member.MemberRole;
import lombok.Getter;

@Getter
public class MemberRequest {

    private String name;
    private MemberRole memberRole;

    public MemberRequest() {
    }

    public MemberRequest(String name, MemberRole memberRole) {
        this.name = name;
        this.memberRole = memberRole;
    }

    public Member toEntity() {
        return Member.builder()
                .name(this.name)
                .memberRole(this.memberRole)
                .build();
    }
}
