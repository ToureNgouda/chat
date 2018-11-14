package sid.sir.entities;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@AllArgsConstructor @NoArgsConstructor @Data
public class AppUser {

	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUser;
	@Column(unique=true)
	private String username;
	@Column
	private String password;
	@Column
	private String status;
	@OneToMany(mappedBy="user_id")
	private Collection<Message> messages ;
    @ManyToMany(fetch=FetchType.EAGER)
    private Collection<AppRole> roles=new ArrayList<>();
	
	
    public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AppUser(Long idUser, String username, String password, String status) {
		super();
		this.idUser = idUser;
		this.username = username;
		this.password = password;
		this.status = status;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Collection<Message> getMessages() {
		return messages;
	}
	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}
	public Collection<AppRole> getRoles() {
		return roles;
	}
	public void setRoles(Collection<AppRole> roles) {
		this.roles = roles;
	}
	
	
}
