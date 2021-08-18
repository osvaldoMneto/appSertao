package com.digitalolk.appOsvaldo.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.digitalolk.appOsvaldo.model.domain.Artista;

@Repository
public interface ArtistaRepository extends CrudRepository<Artista, Integer>{
	
}