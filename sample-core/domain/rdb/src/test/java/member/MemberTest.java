package member;

import com.sample.core.domain.rdb.member.Member;
import com.sample.core.domain.rdb.member.MemberRole;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import static org.assertj.core.api.Assertions.assertThat;

class MemberTest {

    @EnumSource(value = MemberRole.class, mode = EnumSource.Mode.INCLUDE, names = "USER")
    @ParameterizedTest
    void member조회_true(MemberRole memberRole) {
        Member member = Member.builder()
                .memberRole(memberRole)
                .build();

        assertThat(member.isUser()).isTrue();
    }

    @EnumSource(value = MemberRole.class, mode = EnumSource.Mode.EXCLUDE, names = "USER")
    @ParameterizedTest
    void member조회_false(MemberRole memberRole) {
        Member member = Member.builder()
                .memberRole(memberRole)
                .build();

        assertThat(member.isUser()).isFalse();
    }
}