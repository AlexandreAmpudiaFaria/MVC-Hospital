package com.hospital.demo.dto;

import com.hospital.demo.model.Paciente;

public class RequisicaoNovoPaciente {

	private String txtNomePaciente;
	private String txtCpf;
	private String txtSus;
	private String txtTelefone;
	private String txtEndereco;
	private String txtObservacao;
	
	public String getTxtNomePaciente() {
		return txtNomePaciente;
	}
	public void setTxtNomePaciente(String txtNomePaciente) {
		this.txtNomePaciente = txtNomePaciente;
	}
	public String getTxtCpf() {
		return txtCpf;
	}
	public void setTxtCpf(String txtCpf) {
		this.txtCpf = txtCpf;
	}
	public String getTxtSus() {
		return txtSus;
	}
	public void setTxtSus(String txtSus) {
		this.txtSus = txtSus;
	}
	public String getTxtTelefone() {
		return txtTelefone;
	}
	public void setTxtTelefone(String txtTelefone) {
		this.txtTelefone = txtTelefone;
	}
	public String getTxtEndereco() {
		return txtEndereco;
	}
	public void setTxtEndereco(String txtEndereco) {
		this.txtEndereco = txtEndereco;
	}
	public String getTxtObservacao() {
		return txtObservacao;
	}
	public void setTxtObservacao(String txtObservacao) {
		this.txtObservacao = txtObservacao;
	}
	public Paciente toPaciente() {
		Paciente paciente = new Paciente();
		paciente.setNomePaciente(txtNomePaciente);
		paciente.setCpf(txtCpf);
		paciente.setSus(txtSus);
		paciente.setTelefone(txtTelefone);
		paciente.setObservacao(txtObservacao);
		
		return paciente;
	}
	
	
}
