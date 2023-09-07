package Apps;

import Interfaces.AppTelefone;

public class Telefone implements AppTelefone {

    private final Integer NUM_CORREIO_VOZ = 555;

    public Telefone() {
        System.out.println("Telefone iniciado");
    }

    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o número: " + numero);
        System.out.println("Em chamada");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo liganção");
        System.out.println("Em chamada");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Ligando para o número: " + NUM_CORREIO_VOZ + "(Correio de voz)");
    }

}
