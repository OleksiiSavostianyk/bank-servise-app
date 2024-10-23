package com.alex.bankingservicesapp.service.authorizationService;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Component;

@Component
public class BCryptPasswordEncoder {
    public static String encode(String rawPassword) {
        return BCrypt.hashpw(rawPassword, BCrypt.gensalt());
    }

    // Метод для проверки пароля
    public static boolean matches(String rawPassword, String encodedPassword) {
        return BCrypt.checkpw(rawPassword, encodedPassword);
    }
}
