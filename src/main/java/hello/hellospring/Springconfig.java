package hello.hellospring;

import hello.hellospring.aop.TimeTraceAop;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class Springconfig {
    /*private final DataSource dataSource;

    @Autowired
    public Springconfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }*/

    /*EntityManager em;

    @Autowired
    public Springconfig(EntityManager em) {
        this.em = em;
    }*/
    private final MemberRepository memberRepository;

    @Autowired
    public Springconfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository); //컨트롤 p 누르면 필요한 매개변수
    }

/*    @Bean
    public TimeTraceAop timeTraceAop() {
        return new TimeTraceAop();
    }*/

    //@Bean
    /*public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
        return new JdbcMemberRepository(dataSource);
        return new JdbcTemplateMemberRepository(dataSource);
        return new JpaMemberRepository(em);
    }*/
}
