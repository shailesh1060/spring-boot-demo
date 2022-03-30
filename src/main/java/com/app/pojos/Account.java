package com.app.pojos;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "new_accts")
@NoArgsConstructor
@Data
public class Account {
	public Account(String name, String type, double bal) {
		super();
		this.name = name;
		this.type = type;
		this.bal = bal;
	}

	// @Id : will work in the SAME Manner
	@EmbeddedId
	private AccountPK id;

	private String name;

	private String type;

	private double bal;
	
	

}
