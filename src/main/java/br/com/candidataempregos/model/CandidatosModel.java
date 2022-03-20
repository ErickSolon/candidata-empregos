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
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, length = 1000, name = "Id")
	protected Long id;

	@Column(nullable = false, length = 1000, name = "IdEmpresas")
	protected Long IdEmpresas;

	@Column(nullable = true, length = 25, name = "NomeCompleto")
	protected String NomeCompleto;

	@Column(nullable = true, length = 25, name = "Email")
	protected String Email;
	
	@Column(nullable = true, length = 25, name = "Telefone")
	protected String Telefone;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdEmpresas() {
		return IdEmpresas;
	}

	public void setIdEmpresas(Long idEmpresas) {
		IdEmpresas = idEmpresas;
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
	
	
}
