package study.bom.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.bom.hello.repository.MemberRepository;
import study.bom.hello.repository.MemoryMemberRepository;
import study.bom.hello.service.MemberService;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }
}
