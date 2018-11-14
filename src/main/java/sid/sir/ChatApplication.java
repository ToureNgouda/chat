package sid.sir;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import sid.sir.entities.AppRole;
import sid.sir.entities.AppUser;
import sid.sir.service.AccountMetier;

@SpringBootApplication
public class ChatApplication implements CommandLineRunner{
	
	@Autowired
	private AccountMetier accountMetier;

	public static void main(String[] args) {
		SpringApplication.run(ChatApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBcpe() {
		return new BCryptPasswordEncoder(); //instanciation de la classe Bcrip.. pour pouvoir l'injecter partout dans l'application
	}
	@Override
	public void run(String... args) throws Exception {
		accountMetier.saveUser(new AppUser(null,"arona", "1234", null));
		accountMetier.saveUser(new AppUser(null,"balde", "1234", null));
		accountMetier.saveRole(new AppRole(null,"ADMIN"));
		accountMetier.saveRole(new AppRole(null,"USER"));
        accountMetier.AddRoleToUse("arona", "ADMIN");
        accountMetier.AddRoleToUse("balde", "USER");
        accountMetier.AddRoleToUse("arona", "USER");
		
	}

}
