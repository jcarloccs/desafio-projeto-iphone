package Interfaces;

import Enums.ReprodutorStatus;

public interface AppReprodutorMusical {

    ReprodutorStatus getReprodutorStatus();
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
    void adicionarMusicaLista(String musica);

}