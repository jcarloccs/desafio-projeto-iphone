package Apps;
public class Iphone {
    
    private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Navegador navegador;
    
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
    }

    public void abrirTelefone() {
        this.telefone = new Telefone();
    }

    public void abrirNavegador() {
        this.navegador = new Navegador();
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
