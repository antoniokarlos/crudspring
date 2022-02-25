package br.com.crud.crud.spring.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@With
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Document(collection = "usuario")
public class Usuario {

    @Id
    private String id;
    private String nome;
    private Endereco endereco;
}
