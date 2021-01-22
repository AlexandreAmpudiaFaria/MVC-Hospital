package com.hospital.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.demo.model.Paciente;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

	
}
