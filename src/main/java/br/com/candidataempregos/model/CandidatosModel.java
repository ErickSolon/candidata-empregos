package br.com.candidataempregos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Candidatos")
public class CandidatosModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(length = 1000, name = "Id")
	protected Long Id;

	@Column(length = 25, name = "NomeCompleto")
	protected String NomeCompleto;

	@Column(length = 25, name = "Email")
	protected String Email;
	
	@Column(length = 25, name = "Telefone")
	protected String Telefone;
	
	@Column(length = 25, name = "EmpresaSelecionada")
	protected String EmpresaSelecionada;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNomeCompleto() {
		return NomeCompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		NomeCompleto = nomeCompleto;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getEmpresaSelecionada() {
		return EmpresaSelecionada;
	}

	public void setEmpresaSelecionada(String empresaSelecionada) {
		EmpresaSelecionada = empresaSelecionada;
	}
}
