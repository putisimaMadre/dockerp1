package com.formatoweb.cliente1.service.impl;

import com.formatoweb.cliente1.entity.Clientes;
import com.formatoweb.cliente1.repository.ClienteRepository;
import com.formatoweb.cliente1.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServiceImpl implements ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;
    @Override
    public List<Clientes> clientes() {
        return clienteRepository.findAll();
    }

    @Override
    public Clientes saveCliente(Clientes cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Clientes clientesById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }
}
