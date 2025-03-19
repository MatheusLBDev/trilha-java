package com.dio.iphone.models;

import java.util.Set;

public interface INavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba(String pagina);
    void removerAba(String pagina);
    void atualizarPagina();
    Set<String> paginas();
}