package com.chuyenbay.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.chuyenbay.entity.ChuyenBay;
import com.chuyenbay.responsitory.ChuyenBayReponsitory;

public class ChuyenBayserviceImpl implements ChuyenBayService {

	@Autowired
	private ChuyenBayReponsitory chuyenBayReponsitory;
	
	@Override
	public List<ChuyenBay> findAll() {
		// TODO Auto-generated method stub
		return ChuyenBayReponsitory.findAll();
	}

}
