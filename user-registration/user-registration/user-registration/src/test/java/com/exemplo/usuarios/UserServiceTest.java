package com.exemplo.usuarios;

import com.exemplo.usuarios.model.User;
import com.exemplo.usuarios.repository.UserRepository;
import com.exemplo.usuarios.service.UserService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

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
/*
este Unitário: Verifica só o UserService isoladamente, usando mocks do UserRepository para garantir que a lógica está correta sem precisar de banco.

Teste de Integração: Testa o sistema junto — UserService, UserRepository, banco de dados — para garantir que tudo junto funciona, incluindo a persistência real.
 */