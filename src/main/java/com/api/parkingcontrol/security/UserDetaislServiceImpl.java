package com.api.parkingcontrol.security;

import com.api.parkingcontrol.models.login.UserModel;
import com.api.parkingcontrol.services.login.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@AllArgsConstructor
public class UserDetaislServiceImpl implements UserDetailsService {

    final UserService userService;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userService.findByUsername(username).orElseThrow(() ->
                new UsernameNotFoundException("Usuário " + username + " não encontrado!"));
        return new User(userModel.getUsername(), userModel.getPassword(),
                true, true, true,
                true, userModel.getAuthorities());
    }

}
