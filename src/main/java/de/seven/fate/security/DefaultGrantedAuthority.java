package de.seven.fate.security;

import org.springframework.security.core.GrantedAuthority;

public class DefaultGrantedAuthority implements GrantedAuthority {

    private final String authority;

    public DefaultGrantedAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
