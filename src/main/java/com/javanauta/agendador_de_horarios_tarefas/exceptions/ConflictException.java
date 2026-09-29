package com.javanauta.agendador_de_horarios_tarefas.exceptions;

public class ConflictException extends RuntimeException{
    public ConflictException (String mensagem) {
        super(mensagem);
    }

    public ConflictException(String mensagem, Throwable throwable) {
        super(mensagem);
    }
}
