public class Carro {
    String nome;
    String marca;
    int ano;
    int vel;

    void acelerar(int aceleracao){
        vel += aceleracao;
    }
    void freiar(int freio){
        vel -= freio;
    }
    void buzinar(){
        System.out.println("bibi");
    }
}
