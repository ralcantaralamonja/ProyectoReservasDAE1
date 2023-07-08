package com.reservas.reservas.services;

import com.reservas.reservas.entidades.Cliente;
import com.reservas.reservas.exception.ClienteNotFundException;
import com.reservas.reservas.repositories.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public List<Cliente> obtenerTodos(){
        return clienteRepository.findAll();
    }

    public Cliente obtenerporId(Long id){
        Optional<Cliente> optionalCliente = clienteRepository.findById(id);
        if (optionalCliente.isPresent()){
            return optionalCliente.get();
        }else{
            throw new ClienteNotFundException(id);
        }
    }

    public Cliente registrar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente Actualizar(Cliente cliente) {
        Long clienteId = cliente.getCodigoCliente();
        Optional<Cliente> optionalCliente = clienteRepository.findById(clienteId);

        if (optionalCliente.isPresent()) {
            Cliente clienteExistente = optionalCliente.get();
            clienteExistente.setNombresCliente(cliente.getNombresCliente());
            clienteExistente.setApellidosCliente(cliente.getApellidosCliente());
            clienteExistente.setCorreoCliente(cliente.getCorreoCliente());
            clienteExistente.setCelularCliente(cliente.getCelularCliente());

            return clienteRepository.save(clienteExistente);
        } else {
            throw new ClienteNotFundException(clienteId);
        }
    }

    public void eliminar(Long id){

        Optional<Cliente> optionalCliente= clienteRepository.findById(id);

        if (optionalCliente.isPresent()){
            clienteRepository.delete(optionalCliente.get());
        }else{
            throw new ClienteNotFundException(id);
        }

    }
}
