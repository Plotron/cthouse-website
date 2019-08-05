package pl.cthouse.www.demo.model.users;

import javax.management.relation.Role;
import java.util.Collection;

public interface BusinessUserDetails {
    Collection<Role> getRoles();

    String getPassword();

    String getUsername();

    boolean isAccountNonExpired();

    boolean isAccountNonLocked();

    boolean isCredentialsNonExpired();

    boolean isEnabled();
}
