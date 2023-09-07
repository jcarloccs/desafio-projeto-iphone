package Apps;
import java.util.ArrayList;
import java.util.List;

import Interfaces.AppNavegador;

public class Navegador implements AppNavegador{

    private List<String> abas = new ArrayList<>();
    private Integer paginaAtual;

    @Override
    public void exibirPagina(String url) {
        abas.set(paginaAtual, url);
        System.out.println("Carregando página");
        System.out.println("Página " + abas.get(paginaAtual) + " carregada");
    }

    @Override
    public void adicionarNovaAba() {
        abas.add("");
        System.out.println("Página adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página...");
        System.out.println("Página atualizada");
    }

    @Override
    public void trocarAba(int aba) {
        paginaAtual = aba;
        System.out.println("Aba atual: " + paginaAtual);
    }

}
