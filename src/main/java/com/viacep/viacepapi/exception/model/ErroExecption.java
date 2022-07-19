package com.viacep.viacepapi.exception.model;

import lombok.*;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Data
@Builder
public class ErroExecption {

    public int status;
    public String error;
    public String message;
    public String path;
    public LocalDateTime timestamp;
}
