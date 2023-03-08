package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Appointment;
import com.example.demo.service.AppointmentService;

@RestController
@RequestMapping("/appointment")
@CrossOrigin(origins="http://localhost:3000/")
public class AppointmentController {
	@Autowired
	AppointmentService service;
	@PostMapping("")
	public String add(@RequestBody Appointment appointment) {
		return service.addAppointment(appointment);
	}
	@PutMapping("/put")
	public Appointment updateById(@RequestBody Appointment appointment) {
		return service.updateAppointmentById(appointment);
	}
	@DeleteMapping("/{id}")
	public String deleteById(@RequestParam int id) {
		return service.deleteAppointmentById(id);
	}
	@GetMapping("")
	public List<Appointment> get(){
		return service.getAppointment();
	}

}
