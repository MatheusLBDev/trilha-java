package com.dio.iphone.models;

public interface ISmartPhone extends IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {
    void menuInicial();
    int volume();
    void aumentarVolume();
    void diminuirVolume();
    void desligar();
    void desligarTela();
    void ligarTela();
    void ajustes();
}