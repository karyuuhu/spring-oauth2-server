package com.hjl.domain.dto;

import com.hjl.domain.user.Privilege;
import com.hjl.domain.user.User;
import com.hjl.infrastructure.PasswordHandler;

public class UserFormDto extends UserDto {
    private static final long serialVersionUID = 7959857016962260738L;


    private String password;

    public UserFormDto() {
    }


    public Privilege[] getAllPrivileges() {
        return new Privilege[]{Privilege.MOBILE, Privilege.UNITY};
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User newUser() {
        final User user = new User()
                .username(getUsername())
                .phone(getPhone())
                .email(getEmail())
                .password(PasswordHandler.md5(getPassword()));
        user.privileges().addAll(getPrivileges());
        return user;
    }
}
