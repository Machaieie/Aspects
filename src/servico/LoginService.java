package servico;

import modelo.User;

public class LoginService {
	 public boolean authenticate(User user) {
	        // Simulação de autenticação (login bem-sucedido se o usuário for 'admin' e a senha for '123')
	        return user.getUsername().equals("admin") && user.getPassword().equals("123");
	    }
}
