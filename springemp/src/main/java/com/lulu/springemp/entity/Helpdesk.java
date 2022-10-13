package com.lulu.springemp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table
public class Helpdesk {
	@Id
	int id;
	String complaindesc;
	String name;
	LocalDate ordersdate;
	public Helpdesk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Helpdesk(int id, String complaindesc, String name, LocalDate ordersdate) {
		super();
		this.id = id;
		this.complaindesc = complaindesc;
		this.name = name;
		this.ordersdate = ordersdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getComplaindesc() {
		return complaindesc;
	}
	public void setComplaindesc(String complaindesc) {
		this.complaindesc = complaindesc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getOrdersdate() {
		return ordersdate;
	}
	public void setOrdersdate(LocalDate ordersdate) {
		this.ordersdate = ordersdate;
	}
	@Override
	public String toString() {
		return "helpdesk [id=" + id + ", complaindesc=" + complaindesc + ", name=" + name + ", ordersdate=" + ordersdate
				+ "]";
	}
	
	
}