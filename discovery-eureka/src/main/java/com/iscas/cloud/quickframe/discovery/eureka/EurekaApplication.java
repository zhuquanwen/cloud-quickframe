/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.iscas.cloud.quickframe.discovery.eureka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

/**
 * @author lengleng
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApplication {
	private static Logger LOGGER = LoggerFactory.getLogger(EurekaApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
		LOGGER.info("eureka启动");
	}
	@EnableWebSecurity
	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		public void configure(AuthenticationManagerBuilder auth) throws Exception {
			auth.inMemoryAuthentication()
					.passwordEncoder(NoOpPasswordEncoder.getInstance())
					.withUser("iscas").password("iscas")
					.authorities("ADMIN");
		}
		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf()
					.disable()
					.authorizeRequests()
					.anyRequest().authenticated()
					.and()
					.httpBasic();
		}
	}
}
