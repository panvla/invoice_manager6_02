package com.vladimirpandurov.invoice_manager6_02.rowmapper;

import com.vladimirpandurov.invoice_manager6_02.domain.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return User.builder()
                .id(rs.getLong("id"))
                .firstName(rs.getString("first_name"))
                .lastName(rs.getString("last_name"))
                .email(rs.getString("email"))
                .password(rs.getString("password"))
                .bio(rs.getString("bio"))
                .title(rs.getString("title"))
                .address(rs.getString("address"))
                .phone(rs.getString("phone"))
                .imageUrl(rs.getString("image_url"))
                .enabled(rs.getBoolean("enabled"))
                .isNotLocked(rs.getBoolean("non_locked"))
                .isUsingMfa(rs.getBoolean("using_mfa"))
                .createdAt(rs.getTimestamp("created_at").toLocalDateTime())
                .build();
    }
}
