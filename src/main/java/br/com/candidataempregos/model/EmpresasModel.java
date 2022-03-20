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
	@Column(nullable = false, length = 1000, name = "id")
	protected Long id;

	@Column(nullable = false, length = 1000, name = "IdCandidatos")
	protected Long IdCandidatos ;

	@Column(nullable = true, length = 25, name = "NomeEmpresa")
	protected String NomeEmpresa;

	@Column(nullable = true, length = 25, name = "NomeVaga")
	protected String NomeVaga;
	
	@Column(nullable = true, length = 100, name = "LocalizacaoEmpresa")
	protected String LocalizacaoEmpresa;
	
	@Column(nullable = true, length = 100, name = "Descricao")
	protected String Descricao;
	
	@Column(nullable = true, length = 1000, name = "QuantidadeCandidatos")
	protected int QuantidadeCandidatos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCandidatos() {
		return IdCandidatos;
	}

	public void setIdCandidatos(Long idCandidatos) {
		IdCandidatos = idCandidatos;
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

	public int getQuantidadeCandidatos() {
		return QuantidadeCandidatos;
	}

	public void setQuantidadeCandidatos(int quantidadeCandidatos) {
		QuantidadeCandidatos = quantidadeCandidatos;
	}

	
}
