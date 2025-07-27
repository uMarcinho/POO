# POO

Interface ReprodutorMusical
+ tocar()
+ pausar()
+ selecionarMusica(musica: String)

Interface AparelhoTelefonico
+ ligar(numero: String)
+ atender()
+ iniciarCorreioVoz()

Interface NavegadorInternet
+ exibirPagina(url: String)
+ adicionarNovaAba()
+ atualizarPagina()

Classe iPhone
Implementa: ReprodutorMusical, AparelhoTelefonico, NavegadorInternet
