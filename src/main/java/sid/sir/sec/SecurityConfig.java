package sid.sir.sec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebFluxSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
  
	@Autowired
	protected UserDetailsService userDetailsService; //cette service permet de gerer l'authentification
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder; //gere le cryptage de mots de passe 

	//permet de decrire une methode de recherche des users et des roles(gere l'authentification) 	
protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	super.configure(auth);
	auth.userDetailsService(userDetailsService)
	.passwordEncoder(bCryptPasswordEncoder);
}
  @Override
	protected void configure(HttpSecurity http) throws Exception {
			super.configure(http);
		
	}
}
