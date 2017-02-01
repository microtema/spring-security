package de.seven.fate.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.seven.fate.service.MethodSecurityService;

@RestController
public class AdminController {

    private final MethodSecurityService methodSecurityService;

    public AdminController(MethodSecurityService methodSecurityService) {
        this.methodSecurityService = methodSecurityService;
    }

    @RequestMapping("/")
    public String greeting() {
        return methodSecurityService.requiresUserRole();
    }
}
