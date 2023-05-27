package com.reservas.reservas;

import com.reservas.reservas.entidades.Cliente;
import com.reservas.reservas.repositories.ClienteRepository;
import jakarta.persistence.GeneratedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class Controller {
    private final ClienteRepository clienteRepository;

    @Autowired
    public Controller(ClienteRepository clienteRepository){
        this.clienteRepository= clienteRepository;
    }

    @GetMapping("/get")
    public List<Cliente> getAll(){
        return clienteRepository.findAll();
    }
}
