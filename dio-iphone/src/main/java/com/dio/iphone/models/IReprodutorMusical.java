package com.dio.iphone.models;

import java.util.Set;

public interface IReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
    void adicionarMusica(String musica);
    void removerMusica(String musica);
    Set<String> playlist();
}