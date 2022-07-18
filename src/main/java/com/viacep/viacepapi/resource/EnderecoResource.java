package com.viacep.viacepapi.resource;

import com.viacep.viacepapi.dto.EnderecoDTO;
import com.viacep.viacepapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class EnderecoResource {

    @Autowired
    private EnderecoService enderecoService;

    public ResponseEntity<EnderecoDTO> buscarPeloCep(@PathVariable("cep") Long cep){
        EnderecoDTO enderecoDTO = enderecoService.buscaPeloCep(cep);
        return enderecoDTO != null ?
                ResponseEntity.ok(enderecoDTO) :
                ResponseEntity.noContent().build();
    }
}
