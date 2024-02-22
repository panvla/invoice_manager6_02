package com.vladimirpandurov.invoice_manager6_02.service;

import com.vladimirpandurov.invoice_manager6_02.domain.Role;

public interface RoleService {
    Role getRoleByUserId(Long id);
}
