package com.hospital.demo.controller;

import org.springframework.stereotype.Controller;


@Controller
public class ManterPacientesController {
	
	
	/*@Autowired
	private PacienteRepository pacienteRepository;
	
	@GetMapping("/manterPacientes")
	public String manterPacientes(Model model) {		
		List<Paciente> pacientes = pacienteRepository.findAll();			
		model.addAttribute("pacientes", pacientes);
		
		return "/paciente/manterPacientes";
	}*/
	
	public String manterPacientes() {
		return "/paciente/manterPacientes";
	}
}
