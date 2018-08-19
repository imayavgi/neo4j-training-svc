package training;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import sun.java2d.pipe.SpanShapeRenderer;

import java.util.ArrayList;
import java.util.List;

public class CustomUserDetailsService implements
        UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        System.out.println(username);
        List<GrantedAuthority> authorities = new ArrayList<>();
        SimpleGrantedAuthority authority;
        if ("Imaya".equals(username))
            authority = new SimpleGrantedAuthority("RoleEmployee");
        else
            authority = new SimpleGrantedAuthority("RoleOutsider");

        authorities.add(authority);

        UserDetails user = new User(username, "password", authorities);
        return user;
    }
}
