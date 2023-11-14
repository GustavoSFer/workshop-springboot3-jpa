package com.fernandes.courseSpring.entities;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long Id;
	private Instant moment;
	
	private User user;
	
	public Order() {};

	public Order(Long id, Instant moment, User user) {
		super();
		Id = id;
		this.moment = moment;
		this.user = user;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Id, other.Id);
	}

	
}
