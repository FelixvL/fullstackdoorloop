package com.ehv.ycdoorloop621.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ehv.ycdoorloop621.domein.Gerecht;

@Service
public class GerechtService {
	@Autowired     // BeanArchitecture
	GerechtRepository gr;
	
	public void slaGerechtOp() {
		System.out.println("in gerechtservice");
		gr.save(new Gerecht());
	}

}
