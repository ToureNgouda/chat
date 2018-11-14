package sid.sir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @AllArgsConstructor @NoArgsConstructor @Data
public class Message {
   
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private Long idMessage;
	@Column
	private String  contenu;
	@Column
	private Date dateCreation;
	@ManyToOne
	@JoinColumn
	private AppUser user_id;

}
