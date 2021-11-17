package com.ceub.aplicacaoteste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ceub.aplicacaoteste.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{

}
