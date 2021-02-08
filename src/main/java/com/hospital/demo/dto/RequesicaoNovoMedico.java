package com.hospital.demo.dto;

import com.hospital.demo.model.Medico;

public class RequesicaoNovoMedico {

	private String txtNome;
	private String txtCPF;
	private String txtTelefone;
	private String txtCRM;
	
	public String getTxtNome() {
		return txtNome;
	}
	public void setTxtNome(String txtNome) {
		this.txtNome = txtNome;
	}
	
	public String getTxtTelefone() {
		return txtTelefone;
	}
	public void setTxtTelefone(String txtTelefone) {
		this.txtTelefone = txtTelefone;
	}
	public String getTxtCRM() {
		return txtCRM;
	}
	public void setTxtCRM(String txtCRM) {
		this.txtCRM = txtCRM;
	}	
	
	public String getTxtCPF() {
		return txtCPF;
	}
	public void setTxtCPF(String txtCPF) {
		this.txtCPF = txtCPF;
	}
	
	public Medico toMedico() {
		Medico medico = new Medico();
		medico.setNomeMedico(txtNome);
		medico.setCpf(txtCPF);
		medico.setTelefone(txtTelefone);
		medico.setCrm(txtCRM);
		
		return medico;
	}
	
	
}
