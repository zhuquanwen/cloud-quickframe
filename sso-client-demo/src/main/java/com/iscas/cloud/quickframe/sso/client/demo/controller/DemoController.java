

package com.iscas.cloud.quickframe.sso.client.demo.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * demo controller
 */
@RestController
public class DemoController {
    @GetMapping("/")
    public Authentication user(Authentication authentication) {
        return authentication;
    }
}
