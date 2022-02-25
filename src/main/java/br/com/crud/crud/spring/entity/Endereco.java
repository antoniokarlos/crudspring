package br.com.crud.crud.spring.entity;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@With
@Data
@Builder
@Document
public class Endereco {

    private String endereco;
    private Integer numero;
    private String bairro;
    private String cep;
}

