package com.chuyenbay.service;

import java.util.List;

import com.chuyenbay.entity.MayBay;

public interface MaybayService {

	public List<MayBay> findByTamBay(int tamBay);
	public List<MayBay> findAll();
}
