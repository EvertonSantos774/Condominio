package br.uniso.condominio.model.repository;

import br.uniso.condominio.model.entity.Morador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface MoradorRepository extends JpaRepository<Morador, Long>, JpaSpecificationExecutor<Morador> {

}