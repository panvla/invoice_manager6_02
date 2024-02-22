package com.vladimirpandurov.invoice_manager6_02.dtomapper;

import com.vladimirpandurov.invoice_manager6_02.domain.Role;
import com.vladimirpandurov.invoice_manager6_02.domain.User;
import com.vladimirpandurov.invoice_manager6_02.dto.UserDTO;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class UserDTOMapper {

    public static UserDTO fromUser(User user){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        return userDTO;
    }

    public static UserDTO fromUser(User user, Role role){
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(user, userDTO);
        userDTO.setRoleName(role.getName());
        userDTO.setPermission(role.getPermission());
        return userDTO;
    }

    public static User toUser(UserDTO userDTO){
        User user = new User();
        BeanUtils.copyProperties(userDTO, user);
        return user;
    }

}
