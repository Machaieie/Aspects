package principal;

import modelo.User;
import servico.LoginService;

public class Principal {

	public static void main(String[] args) {
		LoginService loginService = new LoginService();
        User user1 = new User("admin", "123");
        User user2 = new User("john", "password");

        // Tentar fazer login com usuário 1
        boolean loginResult1 = loginService.authenticate(user1);
        System.out.println("Resultado do Login 1: " + loginResult1);

        // Tentar fazer login com usuário 2
        boolean loginResult2 = loginService.authenticate(user2);
        System.out.println("Resultado do Login 2: " + loginResult2);

	}

}
