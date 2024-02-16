package com.vladimirpandurov.invoice_manager6_02.service.implementation;

import com.vladimirpandurov.invoice_manager6_02.domain.Role;
import com.vladimirpandurov.invoice_manager6_02.domain.User;
import com.vladimirpandurov.invoice_manager6_02.dto.UserDTO;
import com.vladimirpandurov.invoice_manager6_02.dtomapper.UserDTOMapper;
import com.vladimirpandurov.invoice_manager6_02.repository.RoleRepository;
import com.vladimirpandurov.invoice_manager6_02.repository.UserRepository;
import com.vladimirpandurov.invoice_manager6_02.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UserServiceImpl implements UserService {

    private final UserRepository<User> userRepository;
    private final RoleRepository<Role> roleRepository;

    @Override
    public UserDTO createUser(User user) {
        return mapToUserDTO(userRepository.create(user));
    }

    private UserDTO mapToUserDTO(User user){
        return UserDTOMapper.fromUser(user, this.roleRepository.getRoleByUserEmail(user.getEmail()));
    }
}
