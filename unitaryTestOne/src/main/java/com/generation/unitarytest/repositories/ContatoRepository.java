package com.generation.unitarytest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.unitarytest.entities.ContatoEntity;

public interface ContatoRepository extends JpaRepository<ContatoEntity, Long> {

}
