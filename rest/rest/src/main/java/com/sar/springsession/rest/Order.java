package com.sar.springsession.rest;

public class Order {
	private long id;
	private String name;
	private float quantity;
	public Order(Long id, String name, float quantity) {
		this.id = id;
		this.name = name;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
