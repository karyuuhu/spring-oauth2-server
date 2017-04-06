package com.hjl.service;

import com.hjl.domain.dto.UserFormDto;
import com.hjl.domain.dto.UserJsonDto;
import com.hjl.domain.dto.UserOverviewDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    UserJsonDto loadCurrentUserJsonDto();

    UserOverviewDto loadUserOverviewDto(UserOverviewDto overviewDto);

    boolean isExistedUsername(String username);

    String saveUser(UserFormDto formDto);
}
