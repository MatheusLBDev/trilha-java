package com.dio.iphone.models;

import java.util.Map;

public interface IAparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
    void adicionarContato(String nome, String numero);
    void removerContato(String nome);
    Map<String, String> contatos();
}