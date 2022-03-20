package br.com.candidataempregos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.candidataempregos.model.CandidatosModel;

@Repository
public interface CandidatosRepository extends JpaRepository<CandidatosModel, Long>  {

}
