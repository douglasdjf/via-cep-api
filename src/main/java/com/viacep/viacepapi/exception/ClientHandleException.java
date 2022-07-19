package com.viacep.viacepapi.exception;

import com.viacep.viacepapi.exception.model.ErroExecption;
import feign.FeignException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class ClientHandleException  extends  ResponseEntityExceptionHandler {

    @ExceptionHandler({FeignException.class})
    public ResponseEntity<Object> handleException(FeignException ex, WebRequest request) {

        return ResponseEntity
                .badRequest()
                .body(ErroExecption.builder()
                        .status(ex.status())
                        .error("Bad Request")
                        .timestamp(LocalDateTime.now())
                        .message("Cep inválido")
                        .path(((ServletWebRequest)request).getRequest().getServletPath())
                      .build()
                );
    }


}
