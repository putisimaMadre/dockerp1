package com.formatoweb.cliente1.service;

import com.formatoweb.cliente1.entity.Clientes;

import java.util.List;

public interface ClienteService {
    List<Clientes> clientes();
    Clientes saveCliente(Clientes cliente);
    Clientes clientesById(Long id);
}
