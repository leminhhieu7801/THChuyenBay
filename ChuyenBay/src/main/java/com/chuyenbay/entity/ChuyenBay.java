package com.chuyenbay.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "chuyenbay")
public class ChuyenBay {

	@Id
	private String macb;
	@Column(name = "gadi")
	private String gaDi;
	@Column(name = "gaDen")
	private String gaDen;
	@Column(name = "dodai")
	private int doDai;
	@Column(name = "giodi")
	private Time gioDi;
	@Column(name = "gioden")
	private Time gioDen;
	@Column(name = "chiphi")
	private int chiPhi;
	public String getMacb() {
		return macb;
	}
	public void setMacb(String macb) {
		this.macb = macb;
	}
	public String getGaDi() {
		return gaDi;
	}
	public void setGaDi(String gaDi) {
		this.gaDi = gaDi;
	}
	public String getGaDen() {
		return gaDen;
	}
	public void setGaDen(String gaDen) {
		this.gaDen = gaDen;
	}
	public int getDoDai() {
		return doDai;
	}
	public void setDoDai(int doDai) {
		this.doDai = doDai;
	}
	public Time getGioDi() {
		return gioDi;
	}
	public void setGioDi(Time gioDi) {
		this.gioDi = gioDi;
	}
	public Time getGioDen() {
		return gioDen;
	}
	public void setGioDen(Time gioDen) {
		this.gioDen = gioDen;
	}
	public int getChiPhi() {
		return chiPhi;
	}
	public void setChiPhi(int chiPhi) {
		this.chiPhi = chiPhi;
	}
	
	
	
}
