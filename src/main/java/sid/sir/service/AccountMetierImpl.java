package sid.sir.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import sid.sir.dao.RoleRepository;
import sid.sir.dao.UserRepository;
import sid.sir.entities.AppRole;
import sid.sir.entities.AppUser;

@Service
@Transactional
public class AccountMetierImpl implements AccountMetier {
    
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private BCryptPasswordEncoder  bCryptPasswordEncoder;
	
	@Override
	public AppUser saveUser(AppUser user) {
		  String hash=bCryptPasswordEncoder.encode(user.getPassword());
		  user.setPassword(hash);
		return userRepository.save(user);
	}

	@Override
	public AppRole saveRole(AppRole role) {
	  
		return roleRepository.save(role);
	}

	@Override
	public void AddRoleToUse(String username, String roleName) {
		AppUser user = userRepository.findByUsername(username);
		AppRole roles = roleRepository.findByRolename(roleName);
		user.getRoles().add(roles);
	}

	@Override
	public AppUser getuser(String username) {
		
		return userRepository.findByUsername(username);
	}

}
