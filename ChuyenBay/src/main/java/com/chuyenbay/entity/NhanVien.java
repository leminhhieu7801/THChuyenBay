package com.chuyenbay.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVien {

	@Id
	private String manv;
	@Column(name = "ten")
	private String ten;
	@Column(name = "luong")
	private Long luong;
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public Long getLuong() {
		return luong;
	}
	public void setLuong(Long luong) {
		this.luong = luong;
	}
	
}
