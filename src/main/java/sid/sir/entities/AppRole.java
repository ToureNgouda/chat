package sid.sir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Table(name="role") @Data @AllArgsConstructor @NoArgsConstructor
public class AppRole {
    
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idRole;
	@Column
	private String rolename;
    
	public AppRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppRole(Long idRole, String rolename) {
		super();
		this.idRole = idRole;
		this.rolename = rolename;
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
}
