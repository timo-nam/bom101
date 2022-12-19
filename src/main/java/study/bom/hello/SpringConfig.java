package study.bom.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.bom.hello.repository.JdbcMemberRepository;
import study.bom.hello.repository.MemberRepository;
import study.bom.hello.service.MemberService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private DataSource dataSource;

    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new JdbcMemberRepository(dataSource);
    }
}
