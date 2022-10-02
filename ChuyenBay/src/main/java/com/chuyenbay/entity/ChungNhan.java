package com.chuyenbay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chungnhan")
public class ChungNhan {

	@Id
	private String manv;
	@Column(name = "mamb")
	private int mamb;
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public int getMamb() {
		return mamb;
	}
	public void setMamb(int mamb) {
		this.mamb = mamb;
	}
	
	
}
