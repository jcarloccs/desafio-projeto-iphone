public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();

        iphone.abrirReprodutorMusical();
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().adicionarMusicaLista("Tá chorando por quê?");
        iphone.getReprodutorMusical().adicionarMusicaLista("Flores em vida");
        iphone.getReprodutorMusical().adicionarMusicaLista("Deus sabe, Deus ouve, Deus vê");
        iphone.getReprodutorMusical().selecionarMusica("Flores em vida");
        iphone.getReprodutorMusical().tocar();
        iphone.getReprodutorMusical().pausar();

        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");

        iphone.abrirNavegador();
        iphone.getNavegador().adicionarNovaAba();
        iphone.getNavegador().adicionarNovaAba();
        iphone.getNavegador().adicionarNovaAba();
        iphone.getNavegador().trocarAba(1);
        iphone.getNavegador().exibirPagina("web.dio.me");
        iphone.getNavegador().trocarAba(0);
        iphone.getNavegador().exibirPagina("www.google.com.br");
        iphone.getNavegador().atualizarPagina();
        iphone.fecharNavegador();

        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");

        iphone.abrirTelefone();
        iphone.getTelefone().ligar(93211234);
        iphone.getTelefone().encerrarChamada();
        iphone.getTelefone().atender();
        iphone.getTelefone().encerrarChamada();
        iphone.getTelefone().iniciarCorreioVoz();
        iphone.getTelefone().encerrarChamada();
        iphone.fecharTelefone();
        
        System.out.println("");
        System.out.println("----------------------------");
        System.out.println("");

    }
}
