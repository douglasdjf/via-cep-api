package com.viacep.viacepapi.client;


import com.viacep.viacepapi.client.config.AutoConfiguration;
import com.viacep.viacepapi.dto.EnderecoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "via-cep-api",
            url = "${via-cep-api.url}",
            configuration = AutoConfiguration.class)
public interface ViaCepClient {

    @GetMapping("/{cep}/json")
    EnderecoDTO buscarPeloCep(@PathVariable("cep") Long cep);
}
