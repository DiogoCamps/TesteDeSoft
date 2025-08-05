package com.exemplo.usuarios;

import com.exemplo.usuarios.controller.UserController;
import com.exemplo.usuarios.model.User;
import com.exemplo.usuarios.repository.UserRepository;
import com.exemplo.usuarios.service.UserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserIntegrationTest {

    @Test
    void testFullUserFlow() {
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);

        UserController userController = new UserController(service);
        userController.createUser("2","Diogo");
        User user = userController.findUser("2");
        assertNotNull(user);
        userController
    }
}