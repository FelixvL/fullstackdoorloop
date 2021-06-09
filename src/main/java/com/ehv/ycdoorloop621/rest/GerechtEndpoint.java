package com.ehv.ycdoorloop621.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ehv.ycdoorloop621.controller.GerechtService;
import com.ehv.ycdoorloop621.domein.Gerecht;

@RestController
public class GerechtEndpoint {
	@Autowired
	GerechtService gs;
	
	@GetMapping("start")
	public void herewego() {
		System.out.println("hij doet het");
		gs.slaGerechtOp();
	}
	@GetMapping("beginnen")
	public String herewego2() {
		System.out.println("Hij doet het goed");
		return "de tekst<input> die ik terugggeef";
	}
	@GetMapping("geefeengerecht")
	public Gerecht herewego3() {
		System.out.println("Hij doet het goed");
		return new Gerecht();
	}
	@GetMapping("allegerechten")
	public List<Gerecht> herewego4() {
		Gerecht g6 = new Gerecht();
		Gerecht g2 = new Gerecht();
		ArrayList<Gerecht> gerechten = new ArrayList();
		gerechten.add(g6);
		gerechten.add(g2);
		gerechten.get(0).setNaam("pizza");
		System.out.println("Hij doet het goed");
		return gerechten;
	}
	@GetMapping("geefeengerecht/{eennaam}")
	public Gerecht herewego7(@PathVariable String eennaam) {
		System.out.println("Hij doet het goed----"+eennaam);
		return new Gerecht();
	}
	
}
