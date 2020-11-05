package com.cg.mts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Cab;
import com.cg.mts.service.ICabService;

@RestController
public class CabController {

	@Autowired
	private ICabService cabService;

	@PostMapping("/add/cab")
	public Cab add() {
		Cab cab = new Cab();
		cab = cabService.insertCab(cab);
		return cab;
	}

	@PutMapping("/update/cab")
	public Cab update() {
		Cab cab = new Cab("abc", 4.5f);
		cab = cabService.updateCab(cab);
		return cab;
	}

	@DeleteMapping("/delete/cab")
	public void delete(Cab cab) {
		cab = cabService.deleteCab(cab);
	}
}
