package com.sample.core.domain.rdb.member;

import com.sample.core.domain.rdb.date.BaseDateTime;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "member")
public class Member extends BaseDateTime {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false)
	private long id;
	private String name;

	@Enumerated(EnumType.STRING)
	private MemberRole memberRole;

	public boolean isUser() {
		return memberRole == MemberRole.USER;
	}

	public boolean isAdmin() {
		return memberRole == MemberRole.ADMIN;
	}
}
