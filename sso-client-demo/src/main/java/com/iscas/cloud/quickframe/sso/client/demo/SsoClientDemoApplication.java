

package com.iscas.cloud.quickframe.sso.client.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;

/**
 * 单点登录客户端
 */
@EnableOAuth2Sso
@SpringBootApplication
public class SsoClientDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SsoClientDemoApplication.class, args);
    }

}
