package com.hospital.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.hospital.demo.model.Procedimento;
import com.hospital.demo.repository.ProcedimentoRepository;

@Controller
@RequestMapping("/procedimento")
public class ProcedimentoController {
	
	@Autowired
	private ProcedimentoRepository procedimentoRepository;
	
	/*@GetMapping("/manterProcedimentos")
	public String formulario() {
		return "procedimento/manterProcedimentos";
	}*/

	@GetMapping("/manterProcedimentos")
	public String manterProcedimento(Model model) {
		List<Procedimento> procedimentos = procedimentoRepository.findAll();			
		model.addAttribute("procedimentos", procedimentos);
		return "procedimento/manterProcedimentos";
	}

}
