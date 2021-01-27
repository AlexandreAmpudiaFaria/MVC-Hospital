package com.hospital.demo.dto;

import com.hospital.demo.model.Medico;

public class RequesicaoNovoMedico {

	private String txtNome;
	private String txtCpf;
	private String txtTelefone;
	private String txtCRM;
	
	public String getTxtNome() {
		return txtNome;
	}
	public void setTxtNome(String txtNome) {
		this.txtNome = txtNome;
	}
	public String getTxtCpf() {
		return txtCpf;
	}
	public void setTxtCpf(String txtCpf) {
		this.txtCpf = txtCpf;
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
	
	public Medico toMedico() {
		Medico medico = new Medico();
		medico.setNomeMedico(txtNome);
		medico.setCpf(txtCpf);
		medico.setTelefone(txtTelefone);
		medico.setCrm(txtCRM);
		
		return medico;
	}
	
	
}
