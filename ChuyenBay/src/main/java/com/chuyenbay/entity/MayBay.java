package com.chuyenbay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maybay")
public class MayBay {

	@Id
	private int mamb;
	@Column(name = "loai")
	private String loai;
	@Column(name = "tambay")
	private int tambay;
	
	
	public int getMamb() {
		return mamb;
	}
	public void setMamb(int mamb) {
		this.mamb = mamb;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
	public int getTambay() {
		return tambay;
	}
	public void setTambay(int tambay) {
		this.tambay = tambay;
	}
	
	
}
