package br.com.candidataempregos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Empresas")
public class EmpresasModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(length = 1000, name = "id")
	protected Integer id;

	@Column(length = 25, name = "NomeEmpresa")
	protected String NomeEmpresa;

	@Column(length = 25, name = "NomeVaga")
	protected String NomeVaga;
	
	@Column(length = 100, name = "LocalizacaoEmpresa")
	protected String LocalizacaoEmpresa;
	
	@Column(length = 100, name = "Descricao")
	protected String Descricao;

	public Integer getId() {
		return id;
	}

	public String getNomeEmpresa() {
		return NomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		NomeEmpresa = nomeEmpresa;
	}

	public String getNomeVaga() {
		return NomeVaga;
	}

	public void setNomeVaga(String nomeVaga) {
		NomeVaga = nomeVaga;
	}

	public String getLocalizacaoEmpresa() {
		return LocalizacaoEmpresa;
	}

	public void setLocalizacaoEmpresa(String localizacaoEmpresa) {
		LocalizacaoEmpresa = localizacaoEmpresa;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
}
