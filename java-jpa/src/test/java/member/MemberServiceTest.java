package member;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import java.time.LocalDateTime;
import jpa.JpaTemplate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    private final MemberService memberService = new MemberService();

    @Test
    void findById(){
        memberService.findById("test");
    }

    @Test
    void add(){
        Member member = new Member();
        member.setUserId("grepp");
        member.setPassword("1234");
        member.setTel("010-3232-4545");
        member.setEmail("grepp@dmail.com");
        memberService.add(member);
    }

    @Test
    void modify(){
        memberService.modify("grepp", "9999");
    }

    @Test
    void merge(){
        Member member = new Member();
        member.setUserId("grepp");
        memberService.merge(member);
    }

    @Test
    void detach(){
        memberService.detach("grepp", "******");
    }

    @Test
    void remove(){
        Member member = new Member();
        member.setUserId("grepp");
        memberService.remove(member);
    }

    @Test
    void findAll(){
        memberService.findAll().forEach(System.out::println);
    }

    @Test
    void findWithCreatedAt(){
        LocalDateTime start = LocalDateTime.of(2023, 1,1,1,1,1);
        LocalDateTime end = LocalDateTime.of(2024, 1,1,1,1,1);
        memberService.findWithCreatedAt(start, end)
                     .forEach(System.out::println);
    }


}