package Apps;
import java.util.ArrayList;
import java.util.List;

public class ReprodutorMusical {
    
    private List<String> listaMusicas = new ArrayList<>();
    private ReprodutorStatus reprodutorStatus = ReprodutorStatus.SEM_MUSICA;
    private String musicaAtual;

    public List<String> getListaMusicas() {
        return listaMusicas;
    }

    public ReprodutorMusical() {
        System.out.println("Reprodutor Musical iniciado");
    }

    public ReprodutorStatus getReprodutorStatus() {
        return reprodutorStatus;
    }

    public void tocar() {
        if (ReprodutorStatus.PAUSADO == reprodutorStatus) {
            reprodutorStatus = ReprodutorStatus.REPRODUZINDO;
            System.out.println("Tocando: " + musicaAtual);
        }
        else if ((ReprodutorStatus.REPRODUZINDO == reprodutorStatus))
            System.out.println("Tocando: " + musicaAtual);
        else System.out.println("Sem música");
    }

    public void pausar() {
        if (ReprodutorStatus.SEM_MUSICA == reprodutorStatus) {
            System.out.println("Sem música");
            return;
        }
        reprodutorStatus = ReprodutorStatus.PAUSADO;
        System.out.println("Pausado");
    }

    public void selecionarMusica(String musica) {
        for (String musicaLista: listaMusicas) {
            if (musicaLista == musica) {
                musicaAtual = musica;
                break;
            }
        }
        System.out.println("Música selecionada: " + musicaAtual);
    }

    public void adicionarMusicaLista(String musica) {
        listaMusicas.add(musica);
    }

}
