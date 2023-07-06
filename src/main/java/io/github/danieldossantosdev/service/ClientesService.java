package io.github.danieldossantosdev.service;

import io.github.danieldossantosdev.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    public void salvarCliente(Cliente cliente){
        validarCliente(cliente);

    }
    public void validarCliente(Cliente cliente) {
        //aplica validacoes

    }
}
