package com.chuyenbay.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.chuyenbay.entity.MayBay;
import com.chuyenbay.responsitory.MayBayResponsitory;

public class MayBayserviceImpl implements MaybayService {

	@Autowired
	private MayBayResponsitory mayBayResponsitory;
	
	@Override
	public List<MayBay> findByTamBay(int tamBay) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MayBay> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
