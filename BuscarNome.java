import java.util.Scanner;
public class BuscarNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa[] = new Pessoa[5];
        pessoa[0] = new Pessoa("Chandler", 23);
        pessoa[1] = new Pessoa("Monica", 20);
        pessoa[2] = new Pessoa("Joey", 37);
        pessoa[3] = new Pessoa("Ross", 15);
        pessoa[4] = new Pessoa("Rachel", 50);
         for(int i = 0; i < pessoa.length;i++){
             System.out.println(pessoa[i].galera());
         }
        System.out.println("Digite um nome: ");
        String nome = sc.next();
        for(int i = 0;i < pessoa.length;i++){
            if(nome.equals(pessoa[i].getNome())){
                System.out.println("Nome encontrado, " + pessoa[i].getNome() + " possui " + pessoa[i].getIdade() + " anos.");
            }
            else if (i == 4) {
                System.out.println("O nome \"" + nome +"\" não foi encontrado.");
            }
        }
    }
}