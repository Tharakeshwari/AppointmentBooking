package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Appointment;
import com.example.demo.repository.AppointmentRepository;

@Service
public class AppointmentService {
	@Autowired
	AppointmentRepository repository;
	public String addAppointment(Appointment appointment) {
		repository.save(appointment);
		return "Booked";
	}
	public String deleteAppointmentById(int id) {
		repository.deleteById(id);
		return "Deleted";
	}
	public Appointment updateAppointmentById(Appointment appointment) {
		return repository.save(appointment);
	}
	public List<Appointment> getAppointment(){
		return repository.findAll();
	}
	
}
