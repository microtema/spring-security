package de.seven.fate.service;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class MethodSecurityServiceImpl implements MethodSecurityService {

    private final PersonService personService;

    public MethodSecurityServiceImpl(PersonService personService) {
        this.personService = personService;
    }

    @Override
    public String requiresUserRole() {

        personService.printTime();

        SecurityContext securityContext = SecurityContextHolder.getContext();

        Authentication authentication = securityContext.getAuthentication();

        Object details = authentication.getDetails();

        System.out.println("###############################################################");
        System.out.println(authentication);
        System.out.println("###############################################################");

        return authentication.getName() + " have Authorities: " + authentication.getAuthorities().stream().map
                (GrantedAuthority::getAuthority).collect(Collectors.toList());
    }
}
