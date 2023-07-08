package com.reservas.reservas.api;

import com.reservas.reservas.services.ClienteService;
import com.reservas.reservas.services.IClienteService;
import lombok.AllArgsConstructor;
import model.dto.ClienteDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.List;
@RestController
@RequestMapping("/api/clientes")
@AllArgsConstructor
public class ClienteHandler {

    private final IClienteService clienteService;

    @GetMapping({"","/"})
    public ResponseEntity<List<ClienteDTO>> get(){
        return ResponseEntity.ok().body(clienteService.get());}
}
