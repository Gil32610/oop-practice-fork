public class CarroTestar {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.nome = "Sandero";
        c1.marca = "Renault";
        c1.ano = 2012;
        c1.vel = 60;
        c1.acelerar(10);
        System.out.println("Acelerou para " + c1.vel + "Km/h");
        c1.freiar(50);
        System.out.println("Freiou para " + c1.vel + "Km/h");
    }
}
