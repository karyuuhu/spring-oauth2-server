package com.hjl.infrastructure.jdbc;

import com.hjl.domain.user.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {


    public UserRowMapper() {
    }

    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
        User user = new User();

        user.id(rs.getInt("id"));
        user.guid(rs.getString("guid"));

        user.archived(rs.getBoolean("archived"));
        user.createTime(rs.getTimestamp("create_time").toLocalDateTime());

        user.email(rs.getString("email"));
        user.phone(rs.getString("phone"));

        user.password(rs.getString("password"));
        user.username(rs.getString("username"));

        user.lastLoginTime(rs.getTimestamp("last_login_time"));

        return user;
    }
}
