package com.org.thewitchking.nhxstore.model;

import javax.persistence.*;

@Entity
@Table(name="details")
public class NhxUser {
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int user_id;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	
}
