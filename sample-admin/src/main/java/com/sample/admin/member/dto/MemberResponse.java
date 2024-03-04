package com.sample.admin.member.dto;

import com.sample.core.domain.rdb.member.Member;
import lombok.Builder;
import lombok.Getter;

@Getter
public class MemberResponse {
    private final long id;
    private final String name;

    @Builder
    public MemberResponse(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static MemberResponse to(Member member) {
        return new MemberResponse(member.getId(), member.getName());
    }
}
