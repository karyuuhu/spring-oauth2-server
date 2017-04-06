package com.hjl.domain.user;

import com.hjl.domain.shared.Repository;

import java.util.List;

public interface UserRepository extends Repository {

    User findByGuid(String guid);

    void saveUser(User user);

    void updateUser(User user);

    User findByUsername(String username);

    List<User> findUsersByUsername(String username);
}
