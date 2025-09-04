package etec.sp.gov.br.api.controller;

import etec.sp.gov.br.api.model.Usuario;
import etec.sp.gov.br.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController

public class UsuarioController {
    @Autowired
    private UsuarioRepository UsuarioRepository;

    @GetMapping ("usuarios")
    public List<Usuario> Usuarios() {
        return UsuarioRepository.findAll();
    }
}
