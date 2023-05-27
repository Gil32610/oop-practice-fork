public class RegistroDePessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        //Precisa chamar o metodo no main para poder imprimir
            p1.setNome();
            //p2.setNome();
            p1.setSexo();
            p1.setIdade();
        //System.out.println("TESTE DE PRINT: " + p1.getNome() + " e " + p2.getNome()); //Apenas p1 vai ter o nome, pois p2 nao está puxando o set.Nome;
        System.out.println(p1.getNome()+ ", do sexo " + p1.getSexo() + ", possui " + p1.getIdade() + " anos.");
    }
}
