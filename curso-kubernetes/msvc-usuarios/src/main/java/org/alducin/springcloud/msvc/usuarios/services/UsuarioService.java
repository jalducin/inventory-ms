package org.alducin.springcloud.msvc.usuarios.services;

import org.alducin.springcloud.msvc.usuarios.models.entity.Usuario;
import java.util.List;
import java.util.Optional;


public interface UsuarioService {
    List<Usuario> listar();
    Optional<Usuario> portId(Long id);
    Usuario guardar(Usuario usuario);
    void eliminar(Long id);
}
