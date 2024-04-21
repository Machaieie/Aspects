package aspectos;

import modelo.User;
import servico.LoginService;

public aspect LoginAspect {
	 pointcut successfulLogin(User user) :
	        execution(boolean LoginService.authenticate(User)) && args(user)
	        && if(user.getUsername().equals("admin")); // Apenas para o usuário 'admin'

	    after(User user) returning(boolean success) : successfulLogin(user) {
	        System.out.println("Login bem-sucedido para o usuário: " + user.getUsername());
	    }
}
