package com.hospital.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hospital.demo.model.Paciente;
import com.hospital.demo.repository.PacienteRepository;

@Controller
public class ManterPacientesController {
	
	
	@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping("/manterPacientes")
	public String manterPacientes(Model model) {		
		List<Paciente> pacientes = pacienteRepository.findAll();			
		model.addAttribute("pacientes", pacientes);
		
		return "/paciente/manterPacientes";
	}
}
