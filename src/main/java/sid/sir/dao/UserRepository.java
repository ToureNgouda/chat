package sid.sir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sid.sir.entities.AppUser;

public interface UserRepository extends JpaRepository<AppUser,Long >{
  
	public AppUser findByUsername(String username);
}
