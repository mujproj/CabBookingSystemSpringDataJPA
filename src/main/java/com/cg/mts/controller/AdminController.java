package com.cg.mts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.mts.entities.Admin;
import com.cg.mts.service.IAdminService;

@Validated
@RequestMapping("/admin")
@RestController
public class AdminController {

	@Autowired
	private IAdminService adminService;

	@PostMapping("/add")
	public Admin add(@RequestBody Admin admin) {
//		admin = new Admin("Acd", "Acd", "Acd", "Acd");
		Admin newAdmin = new Admin(admin.getUsername(), admin.getPassword(), admin.getMobileNumber(), admin.getEmail());
		admin = adminService.insertAdmin(newAdmin);
		return admin;
	}
	
	@PutMapping("/update/{id}")
	public Admin update(@PathVariable("id") int adminId, @RequestBody Admin newAdmin) {
		newAdmin.setAdminId(adminId);
		newAdmin = adminService.updateAdmin(newAdmin);
		return newAdmin;
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") int adminId) {
		Admin admin = adminService.deleteAdmin(adminId);
	}

}
