package org.generation.italy.webtv.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
//aggiunta annotazione table per specificare il nome della tabella gia presente nel db
//diversamente spring procede con l'assegnazione di un nome da lui scelto
@Table(name ="utente")
public class Utente {
	
	//rimosso l'ID autoincrementante e settato lo username come primary key come da specifica
	@Id
	@Column(name = "username", nullable = false, length = 20)
	private String username;

	@Column(name = "password", nullable = false, length = 8)
	private String password;

	@OneToMany(mappedBy = "utente")
	private List<Visualizzazione> visualizzazioniUtente = new ArrayList<>();



	//aggiunto il metodo super per poter ereditare dalla superclasse
	public Utente() {
		super();
	}
	
	public Utente(int id, String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}


	
	@Override
	public String toString() {
		return "Utente [username=" + username + ", password=" + password + "]";
	}
}