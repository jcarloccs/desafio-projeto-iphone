import Apps.Navegador;
import Apps.ReprodutorMusical;
import Apps.Telefone;

public class Iphone {
    
    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Navegador navegador;
    
    public Iphone() {
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }
    public Telefone getTelefone() {
        return telefone;
    }
    public Navegador getNavegador() {
        return navegador;
    }
    
    public void abrirReprodutorMusical() {
        this.reprodutorMusical = new ReprodutorMusical();
        System.out.println("Reprodutor Musical aberto");
    }

    public void abrirTelefone() {
        this.telefone = new Telefone();
        System.out.println("Telefone aberto");
    }

    public void abrirNavegador() {
        this.navegador = new Navegador();
        System.out.println("Navegador aberto");
    }

    public void fecharReprodutorMusical() {
        this.reprodutorMusical = null;
        System.out.println("ReprodutorMusical fechado");
    }

    public void fecharTelefone() {
        this.telefone = null;
        System.out.println("Telefone fechado");
    }

    public void fecharNavegador() {
        this.navegador = null;
        System.out.println("Navegador fechado");
    }

}
