package com.hospital.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.demo.dto.RequisicaoNovoPaciente;
import com.hospital.demo.model.Paciente;
import com.hospital.demo.repository.PacienteRepository;

@Controller
@RequestMapping("/paciente")
public class PacienteController {
	
	@Autowired
	private PacienteRepository pacienteRepository;

	@GetMapping("/manterPacientes")
	public String manterPaciente(Model model) {
		List<Paciente> pacientes = pacienteRepository.findAll();			
		model.addAttribute("pacientes", pacientes);
		return "paciente/manterPacientes";
	}
	
	@GetMapping("/cadastrarPaciente")
	public String cadastrarPaciente() {
		return "paciente/cadastrarPaciente";
	}
	
	@PostMapping("/novoPaciente")
	public String novoPaciente(RequisicaoNovoPaciente requisicao) {
		Paciente paciente = requisicao.toPaciente();
		pacienteRepository.save(paciente);
		return "redirect:/paciente/manterPacientes";
	}
}
