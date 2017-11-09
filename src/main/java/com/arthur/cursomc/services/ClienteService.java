package com.arthur.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arthur.cursomc.domain.Cliente;
import com.arthur.cursomc.repositories.ClienteRepository;
import com.arthur.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id: " + id + ", Tipo: "
					+ Cliente.class.getName());
		}
		return obj;
	}
}
