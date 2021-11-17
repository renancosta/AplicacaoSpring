package com.ceub.aplicacaoteste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ceub.aplicacaoteste.dto.ClienteDto;
import com.ceub.aplicacaoteste.model.Cliente;
import com.ceub.aplicacaoteste.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	@RequestMapping("/clientes")
	public List<ClienteDto> listarClientes(){
		List<Cliente> clientes = clienteRepository.findAll();
		return ClienteDto.converterCliente(clientes);
	}
	
	@RequestMapping("/clientes_completo")
	public List<Cliente> listarClientesCompleto(){
		List<Cliente> clientes = clienteRepository.findAll();
		return clientes;
	}
}
