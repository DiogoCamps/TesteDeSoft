package com.exemplo.usuarios;

import com.exemplo.usuarios.controller.UserController;
import com.exemplo.usuarios.model.User;
import com.exemplo.usuarios.repository.UserRepository;
import com.exemplo.usuarios.service.UserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserIntegrationTest {

    @Test
    void testRegistroUsuario() {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        service.registerUser("1", "Jessica");
        User user = service.getUser("1");

        assertNotNull(user);
        assertEquals("Jessica",user.getName());
    }

}