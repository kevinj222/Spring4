package com.ust.EmployeeSecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
@SuppressWarnings("deprecation")
@Configuration

public class SpringSecurityConfig extends WebSecurityConfigurerAdapter

{	
	protected void configure(AuthenticationManagerBuilder auth)throws Exception 
	{
		auth.inMemoryAuthentication().withUser("kevin").password("Kevin@2000").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("kevin1").password("Kevin@20").roles("USER");

	}
/*	protected void configure(HttpSecurity http)throws Exception
	{
		http.csrf().disable();
		http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic();
	}*/
	protected void configure(HttpSecurity http)throws Exception
	{
		http.csrf().disable();
		http.authorizeRequests().antMatchers("/rest/**").hasAnyRole("ADMIN").anyRequest().fullyAuthenticated().and().httpBasic();
	}
	@Bean
	public static NoOpPasswordEncoder PasswordEncoder()
	{
		return(NoOpPasswordEncoder)NoOpPasswordEncoder.getInstance();
	}
}
