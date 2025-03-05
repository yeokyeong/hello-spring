package helloSpring.hello_spring;

import helloSpring.hello_spring.repository.MemberRepository;
import helloSpring.hello_spring.repository.MemoryMemberRepository;
import helloSpring.hello_spring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    public MemberService memberService(){
        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){
        return new MemoryMemberRepository();
    }

}
