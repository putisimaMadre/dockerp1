package com.formatoweb.cliente1.controller;

import com.formatoweb.cliente1.entity.Clientes;
import com.formatoweb.cliente1.service.ClienteService;
import com.formatoweb.cliente1.service.impl.ClientesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {
    @Autowired
    private ClientesServiceImpl clienteService;
    @GetMapping("/clientes")
    public List<Clientes> clientes(){
        return clienteService.clientes();
    }

    @PostMapping("/clientes")
    public Clientes saveCliente(@RequestBody Clientes cliente){
        return clienteService.saveCliente(cliente);
    }

    @GetMapping("/clientes/{id}")
    public Clientes clientesById(@PathVariable Long id){
        return clienteService.clientesById(id);
    }
}
