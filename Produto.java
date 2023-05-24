public class Produto {
    String nome;
    String marca;
    double valor;


    //Construtor
    Produto(){
    }

    Produto(String nome, String marca){
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, double valor){
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
