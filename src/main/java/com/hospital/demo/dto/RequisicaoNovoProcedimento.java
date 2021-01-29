package com.hospital.demo.dto;

import com.hospital.demo.model.Procedimento;

public class RequisicaoNovoProcedimento {

	private String txtDescricao;

	public String getTxtDescricao() {
		return txtDescricao;
	}

	public void setTxtDescricao(String txtDescricao) {
		this.txtDescricao = txtDescricao;
	}

	public Procedimento toProcedimento() {
		Procedimento procedimento = new Procedimento();
		procedimento.setDescricaoProcedimento(txtDescricao);
		return procedimento;
	}
	
	
}
