package kz.sagadat.e_school.configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;


@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        User.UserBuilder userBuilder = User.withDefaultPasswordEncoder();
        auth.inMemoryAuthentication()
                .withUser(userBuilder.username("admin")
                        .password("admin")
                        .roles("TEACHERS"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.
                cors().disable()
                .csrf().disable().
                authorizeRequests()
                .antMatchers("/home/**").hasAnyRole("TEACHERS")
                .antMatchers("/api/save").hasAnyRole("TEACHERS")
                .and().formLogin().permitAll();
    }
}
