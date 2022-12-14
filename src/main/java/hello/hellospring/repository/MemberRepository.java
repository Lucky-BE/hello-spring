package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member); //회원을 저장하면 저장된 회원 반환.
    Optional<Member> findById(Long id); //id로 회원 찾는 기능.
    Optional<Member> findByName(String name); //이름으로 회원 찾는 기능.
    List<Member> findAll(); //지금까지 저장된 모든 회원 리스트 반환.

}