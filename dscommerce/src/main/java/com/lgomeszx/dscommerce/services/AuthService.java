package com.lgomeszx.dscommerce.services;

import com.lgomeszx.dscommerce.entities.User;
import com.lgomeszx.dscommerce.services.exeptions.ForbiddenException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserService userService;

    public void validadeSelfOrAdmin(long userId) {
        User me = userService.authenticated();
        if (!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)) {
            throw new ForbiddenException("Access denid");
        }
    }

}
