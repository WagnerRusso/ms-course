package com.br.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.hrworker.entities.Worker;

public interface WorkeRepository extends JpaRepository<Worker, Long> {

}
