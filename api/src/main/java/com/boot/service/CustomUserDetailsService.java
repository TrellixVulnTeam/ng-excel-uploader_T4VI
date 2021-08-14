package com.boot.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Value;


import java.util.ArrayList;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Value("${app.login.user.name}")
    String appLoginUserName;

    @Value("${app.login.user.passwd}")
    String appLoginUserPasswd;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //once user is authenticated everybody is running right now with admin account but should be properly set here
        return new User(appLoginUserName, appLoginUserPasswd, new ArrayList<>());
    }
}
