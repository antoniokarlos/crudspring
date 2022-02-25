package br.com.crud.crud.spring;

import br.com.crud.crud.spring.entity.Usuario;
import br.com.crud.crud.spring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario salvar(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }



}
