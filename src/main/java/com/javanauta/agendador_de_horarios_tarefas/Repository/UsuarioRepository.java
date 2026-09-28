package com.javanauta.agendador_de_horarios_tarefas.Repository;

import com.javanauta.agendador_de_horarios_tarefas.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
