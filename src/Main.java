public class Main {
    public static void main(String[] args) {
        iPhone meuIPhone = new iPhone();

        // Teste do Reprodutor Musical
        meuIPhone.selecionarMusica("Imagine - John Lennon");
        meuIPhone.tocar();
        meuIPhone.pausar();

        // Teste do Aparelho Telefônico
        meuIPhone.ligar("11999999999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        // Teste do Navegador
        meuIPhone.exibirPagina("https://www.apple.com");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}