package de.seven.fate.service;

import org.springframework.security.access.prepost.PreAuthorize;

public interface MethodSecurityService {

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    String requiresUserRole();
}