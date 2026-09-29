package com.javanauta.agendador_de_horarios_tarefas.services;

import com.javanauta.agendador_de_horarios_tarefas.exceptions.ConflictException;
import com.javanauta.agendador_de_horarios_tarefas.models.Usuario;
import com.javanauta.agendador_de_horarios_tarefas.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario salvaUsuario(Usuario usuario) {
        try{
            emailExists(usuario.getEmail());
            return usuarioRepository.save(usuario);
        } catch (ConflictException e) {
            throw new ConflictException("Email ja cadastrado", e.getCause());
        }
    }

    public void emailExists(String email) {
        try {
            boolean existe = verificaEmailExistente(email);
            if (existe) {
                throw new ConflictException("Email ja cadastrado" + email);
            }
        } catch (ConflictException e) {
            throw new ConflictException("Email ja cadastrado" + email);
        }
    }

    public boolean verificaEmailExistente(String email) {
        return usuarioRepository.existsByEmail(email);
    }
}
