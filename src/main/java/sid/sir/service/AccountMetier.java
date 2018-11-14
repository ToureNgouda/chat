package sid.sir.service;

import sid.sir.entities.AppRole;
import sid.sir.entities.AppUser;

public interface AccountMetier {
  
	 public AppUser saveUser(AppUser user);
	  public AppRole saveRole(AppRole role);
	  public void AddRoleToUse(String username, String roleName);
	  public AppUser getuser(String username);

}
