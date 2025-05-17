package com.auth.authentication.service;

import com.auth.authentication.dto.UserDto;
import com.auth.authentication.mapper.GenericMapper;
import com.auth.authentication.model.User;
import com.auth.authentication.repository.UserDetailsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@RequiredArgsConstructor
public class UserEntityService implements UserDetailsService {
    private final UserDetailsRepository userDetailsRepository;
    private final GenericMapper mapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDetailsRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException(username));
    }

    public void save(UserDto user) {
        userDetailsRepository.save(mapper.mapToEntity(user, User.class));
    }
}
