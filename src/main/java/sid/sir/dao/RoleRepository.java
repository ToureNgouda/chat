package sid.sir.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import sid.sir.entities.AppRole;

public interface RoleRepository extends JpaRepository<AppRole,Long>{

	public AppRole findByRolename(String rolename);
}
