package Apps;

public class Telefone {

    private final Integer NUM_CORREIO_VOZ = 555;

    public Telefone() {
        System.out.println("Telefone iniciado");
    }

    public void ligar(int numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Em chamada");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Ligando para o número: " + NUM_CORREIO_VOZ + "(Correio de voz)");
    }

}
