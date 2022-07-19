package com.viacep.viacepapi.service;

import com.viacep.viacepapi.client.ViaCepClient;
import com.viacep.viacepapi.dto.EnderecoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private ViaCepClient viaCepClient;

    public EnderecoDTO buscaPeloCep(Long cep){
        return viaCepClient.buscarPeloCep(cep);
    }
}
