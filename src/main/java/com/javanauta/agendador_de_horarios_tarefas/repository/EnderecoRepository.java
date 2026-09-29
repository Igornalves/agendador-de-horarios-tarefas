package com.javanauta.agendador_de_horarios_tarefas.repository;

import com.javanauta.agendador_de_horarios_tarefas.models.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
