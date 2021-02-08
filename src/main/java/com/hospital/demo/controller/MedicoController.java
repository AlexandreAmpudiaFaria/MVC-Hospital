package com.hospital.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hospital.demo.dto.RequesicaoNovoMedico;
import com.hospital.demo.model.Medico;
import com.hospital.demo.repository.MedicoRepository;

@Controller
@RequestMapping("/medico")
public class MedicoController {

	@Autowired
	private MedicoRepository medicoRepository;
	
	@GetMapping("/manterMedicos")
	public String manterMedico(Model model) {
		List<Medico> medicos = medicoRepository.findAll();			
		model.addAttribute("medicos", medicos);
		return "/medico/manterMedicos";
	}
	
	@GetMapping("/cadastrarMedico")
	public String cadastrarMedico() {
		return "medico/cadastrarMedico";
	}
	
	@GetMapping("/editarMedico")
	public String editarMedico(Long id, Model model) {
		Optional<Medico> medicos = medicoRepository.findById(id);
		model.addAttribute("medicos", medicos);
		return "medico/editarMedico";
	}
	
	@PostMapping("/novoMedico")
	public String novoMedico(RequesicaoNovoMedico requisicao) {
		Medico medico = requisicao.toMedico();
		medicoRepository.save(medico);
		return ("redirect:/medico/manterMedicos");
	}
}
