package jpabook.jpashop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    @Transactional
    @Rollback(false)
    public void testMember() throws Exception{
        Member member = new Member();
        member.setUsername("memberA");

        Long save = memberRepository.save(member);
        Member member1 = memberRepository.find(save);

        Assertions.assertThat(member1.getId()).isEqualTo(member.getId());
        Assertions.assertThat(member1.getUsername()).isEqualTo(member.getUsername());
        Assertions.assertThat(member1).isEqualTo(member);
    }

    @Test
    void save() {

    }

    @Test
    void find() {

    }
}