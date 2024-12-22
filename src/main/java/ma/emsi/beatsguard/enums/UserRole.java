package ma.emsi.beatsguard.enums;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    DOCTOR,
    PATIENT;

    @Override
    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}