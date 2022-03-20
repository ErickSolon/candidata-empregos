package br.com.candidataempregos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.candidataempregos.model.EmpresasModel;

@Repository
public interface EmpresasRepository extends JpaRepository<EmpresasModel, Long> {

}
