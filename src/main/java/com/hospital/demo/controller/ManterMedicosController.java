package com.hospital.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.hospital.demo.model.Medico;
import com.hospital.demo.repository.MedicoRepository;

@Controller
public class ManterMedicosController {

	@Autowired
	private MedicoRepository medicoRepository;
	
	public String manterMedicos() {
		return "/medicos/manterMedicos";
	}
	
	@GetMapping("/manterMedicos")
	public String manterMedicos(Model model) {		
		List<Medico> medicos = medicoRepository.findAll();			
		model.addAttribute("medicos", medicos);
		
		return "/medico/manterMedicos";
	}
}
