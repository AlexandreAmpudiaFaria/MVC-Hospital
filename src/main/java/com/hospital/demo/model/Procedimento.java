package com.hospital.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Procedimento {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idProcedimento;
	
	private String descricaoProcedimento;

	public Long getIdProcedimento() {
		return idProcedimento;
	}

	public void setIdProcedimento(Long idProcedimento) {
		this.idProcedimento = idProcedimento;
	}

	public String getDescricaoProcedimento() {
		return descricaoProcedimento;
	}

	public void setDescricaoProcedimento(String descricaoProcedimento) {
		this.descricaoProcedimento = descricaoProcedimento;
	}
	
	
	
	
	
	
	
}
