package com.vladimirpandurov.invoice_manager6_02.service.implementation;

import com.vladimirpandurov.invoice_manager6_02.domain.Role;
import com.vladimirpandurov.invoice_manager6_02.repository.RoleRepository;
import com.vladimirpandurov.invoice_manager6_02.repository.implementation.RoleRepositoryImpl;
import com.vladimirpandurov.invoice_manager6_02.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;

    @Override
    public Role getRoleByUserId(Long id) {
        return this.roleRepository.getRoleByUserId(id);
    }
}
