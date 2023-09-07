package Apps;
import java.util.ArrayList;
import java.util.List;

public class Navegador {

    private List<String> abas = new ArrayList<>();
    private Integer paginaAtual;

    public void exibirPagina(String url) {
        abas.set(paginaAtual, url);
        System.out.println("Carregando página");
        System.out.println("Página carregada");
    }

    public void adicionarNovaAba() {
        abas.add("");
        System.out.println("Página adicionada");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
        System.out.println("Página atualizada");
    }

    public void trocarAba(int aba) {
        paginaAtual = aba;
    }

}
