public class Contato {
    private String name;
    private String numero;

    public Contato(String name, String numero){
        this.name = name;
        this.numero = numero;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getName() {
        return name;
    }

    public String getNumero() {
        return numero;
    }

    public String fenda() {
        return "Contato - " + name + ", numero = " + numero;
    }
}
