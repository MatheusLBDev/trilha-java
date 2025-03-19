package com.dio.iphone.models;

import java.util.*;

public class Iphone implements ISmartPhone {
    private String iphoneNome = "Iphone do Matheus";
    private String modelo = "13";
    private Map<String, String> listaDeContatos = new HashMap<>();
    private Set<String> paginas = new HashSet<>();
    private Set<String> musicas = new HashSet<>();
    private int volume = 0;

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Chamada atendida.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void adicionarContato(String nome, String numero) {
        listaDeContatos.put(nome, numero);
        System.out.println("Contato adicionado: " + nome + " - " + numero);
    }

    @Override
    public void removerContato(String nome) {
        if (listaDeContatos.containsKey(nome)) {
            listaDeContatos.remove(nome);
            System.out.println("Contato removido: " + nome);
        } else {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    @Override
    public Map<String, String> contatos() {
        return listaDeContatos;
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página web: " + url);
    }

    @Override
    public void adicionarNovaAba(String pagina) {
        paginas.add(pagina);
        System.out.println("Nova aba adicionada: " + pagina);
    }

    @Override
    public void removerAba(String pagina) {
        if (paginas.remove(pagina)) {
            System.out.println("Aba removida: " + pagina);
        } else {
            System.out.println("Aba não encontrada: " + pagina);
        }
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public Set<String> paginas() {
        return paginas;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música selecionada");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada");
    }

    @Override
    public void adicionarMusica(String musica) {
        if (musicas.add(musica)) {
            System.out.println(musica + " adicionada na playlist.");
        } else {
            System.out.println("Música já pertence à playlist.");
        }
    }

    @Override
    public void removerMusica(String musica) {
        if (musicas.remove(musica)) {
            System.out.println(musica + " foi removida da playlist.");
        } else {
            System.out.println("Música não encontrada na playlist.");
        }
    }

    @Override
    public Set<String> playlist() {
        return musicas;
    }

    @Override
    public void menuInicial() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            exibirMenuPrincipal();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> menuTelefone(scanner);
                case 2 -> menuReprodutorMusical(scanner);
                case 3 -> menuNavegador(scanner);
                case 4 -> aumentarVolume();
                case 5 -> diminuirVolume();
                case 6 -> System.out.println("Volume atual: " + volume());
                case 7 -> desligar();
                case 8 -> ligarTela();
                case 9 -> desligarTela();
                case 10 -> ajustes();
                case 11 -> {
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirMenuPrincipal() {
        System.out.println("\nMenu:");
        System.out.println("1. Telefone");
        System.out.println("2. Reprodutor de música");
        System.out.println("3. Navegador");
        System.out.println("4. Aumentar volume");
        System.out.println("5. Diminuir volume");
        System.out.println("6. Exibir volume");
        System.out.println("7. Desligar Iphone");
        System.out.println("8. Ligar tela");
        System.out.println("9. Desligar tela");
        System.out.println("10. Ajustes");
        System.out.println("11. Sair");
        System.out.print("Escolha uma opção: ");
    }

    // Submenu de Telefone
    private void menuTelefone(Scanner scanner) {
        while (true) {
            exibirMenuTelefone();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o número para ligar: ");
                    ligar(scanner.nextLine());
                }
                case 2 -> atender();
                case 3 -> iniciarCorreioVoz();
                case 4 -> {
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o número do contato: ");
                    adicionarContato(nome, scanner.nextLine());
                }
                case 5 -> {
                    System.out.print("Digite o nome do contato a ser removido: ");
                    removerContato(scanner.nextLine());
                }
                case 6 -> {
                    System.out.println("Contatos: ");
                    contatos().forEach((nome, numero) -> System.out.println(nome + ": " + numero));
                }
                case 7 -> { return; }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirMenuTelefone() {
        System.out.println("\nMenu Telefone:");
        System.out.println("1. Ligar");
        System.out.println("2. Atender");
        System.out.println("3. Iniciar correio de voz");
        System.out.println("4. Adicionar contato");
        System.out.println("5. Remover contato");
        System.out.println("6. Exibir contatos");
        System.out.println("7. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    // Submenu de Reprodutor de Música
    private void menuReprodutorMusical(Scanner scanner) {
        while (true) {
            exibirMenuReprodutorMusical();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> tocar();
                case 2 -> pausar();
                case 3 -> {
                    System.out.print("Digite o nome da música: ");
                    selecionarMusica(scanner.nextLine());
                }
                case 4 -> {
                    System.out.print("Digite o nome da música: ");
                    adicionarMusica(scanner.nextLine());
                }
                case 5 -> {
                    System.out.print("Digite o nome da música a ser removida: ");
                    removerMusica(scanner.nextLine());
                }
                case 6 -> {
                    System.out.println("Playlist:");
                    playlist().forEach(System.out::println);
                }
                case 7 -> { return; }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirMenuReprodutorMusical() {
        System.out.println("\nMenu Reprodutor de Música:");
        System.out.println("1. Tocar");
        System.out.println("2. Pausar");
        System.out.println("3. Selecionar música");
        System.out.println("4. Adicionar música");
        System.out.println("5. Remover música");
        System.out.println("6. Playlist");
        System.out.println("7. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    // Submenu de Navegador
    private void menuNavegador(Scanner scanner) {
        while (true) {
            exibirMenuNavegador();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite a URL da página web: ");
                    exibirPagina(scanner.nextLine());
                }
                case 2 -> {
                    System.out.print("Digite o nome da página a ser adicionada: ");
                    adicionarNovaAba(scanner.nextLine());
                }
                case 3 -> {
                    System.out.print("Digite o nome da aba a ser removida: ");
                    removerAba(scanner.nextLine());
                }
                case 4 -> atualizarPagina();
                case 5 -> {
                    System.out.println("Páginas abertas:");
                    paginas().forEach(System.out::println);
                }
                case 6 -> { return; }
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    private void exibirMenuNavegador() {
        System.out.println("\nMenu Navegador:");
        System.out.println("1. Exibir página");
        System.out.println("2. Adicionar nova aba");
        System.out.println("3. Remover aba");
        System.out.println("4. Atualizar página");
        System.out.println("5. Páginas abertas");
        System.out.println("6. Voltar");
        System.out.print("Escolha uma opção: ");
    }

    @Override
    public int volume() {
        return this.volume;
    }

    @Override
    public void aumentarVolume() {
        this.volume++;
        System.out.println("Volume aumentado para: " + this.volume);
    }

    @Override
    public void diminuirVolume() {
        this.volume--;
        System.out.println("Volume diminuído para: " + this.volume);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando iPhone");
    }

    @Override
    public void desligarTela() {
        System.out.println("Tela desligada");
    }

    @Override
    public void ligarTela() {
        System.out.println("Tela ligada");
    }

    @Override
    public void ajustes(){
        System.out.println(iphoneNome);
        System.out.println("Modelo do Iphone: " + modelo);
    }
}