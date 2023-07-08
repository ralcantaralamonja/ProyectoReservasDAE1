package com.reservas.reservas.services;


import com.reservas.reservas.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import model.dto.ClienteDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClienteServiceImplementation implements IClienteService{

    private final ClienteRepository clienteRepository;
    public List<ClienteDTO> get() {

        return clienteRepository.findAll()
                .stream()
                .map(item->{
                    ClienteDTO clienteDTO = new ClienteDTO();
                    clienteDTO.setFullName(item.getNombresCliente()+ " " + item.getApellidosCliente());
                    clienteDTO.setCorreoCliente(item.getCorreoCliente());
                    return clienteDTO;
                })
                .toList();
}

}