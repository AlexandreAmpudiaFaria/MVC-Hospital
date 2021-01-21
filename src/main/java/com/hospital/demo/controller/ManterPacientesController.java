package com.hospital.demo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hospital.demo.model.Paciente;

@Controller
public class ManterPacientesController {

	@PersistenceContext
	private EntityManager entityManager;
	
	@GetMapping("/manterPacientes")
	public String manterPacientes(Model model) {
		
		Query query = entityManager.createQuery("select p from Paciente p", Paciente.class);
		List <Paciente> pacientes = query.getResultList();
		
		model.addAttribute("pacientes", pacientes);
		
		return "manterPacientes";
	}
}
