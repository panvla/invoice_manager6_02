package com.vladimirpandurov.invoice_manager6_02.repository;

import com.vladimirpandurov.invoice_manager6_02.domain.User;
import com.vladimirpandurov.invoice_manager6_02.dto.UserDTO;

import java.util.Collection;

public interface UserRepository<T extends User> {

    T create(T data);
    Collection<T> list(int page, int pageSize);
    T get(Long id);
    T update(T data);
    Boolean delete(Long id);

    T getUserByEmail(String email);

    void sendVerificationCode(UserDTO userDTO);

    T verifyCode(String email, String code);

    void resetPassword(String email);

    T verifyPasswordKey(String key);

    void renewPassword(String key, String password, String confirmPassword);

    T verifyAccountKey(String key);
}
