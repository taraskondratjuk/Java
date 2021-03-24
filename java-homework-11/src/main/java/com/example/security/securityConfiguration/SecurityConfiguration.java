package com.example.security.securityConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;


@Configuration
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("Taras").password("{noop}taras").roles("CEO");
        auth.inMemoryAuthentication().withUser("Ivan").password("{noop}ivan").roles("USER");
        auth.inMemoryAuthentication().withUser("Diana").password("{noop}diana").roles("HR");
        auth.inMemoryAuthentication().withUser("Nazar").password("{noop}nazar").roles("ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasAnyRole("CEO", "USER", "HR", "ADMIN")
                .antMatchers("/ceo").hasRole("CEO")
                .antMatchers("/user").hasRole("ADMIN")
                .antMatchers("/hr").hasRole("HR")
                .antMatchers("/admin").hasRole("ADMIN")
                .and()
                .httpBasic()
                .and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }
}
