import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    Scanner sc = new Scanner(System.in);

    public void setNome() {
        System.out.println("Digite o nome: ");
        this.nome = sc.nextLine();
    }

    public void setSexo() {
        System.out.println("Digite o sexo: ");
        this.sexo = sc.nextLine();
    }

    public boolean setIdade(){
        if(getSexo().equals("Feminino") || getSexo().equals("feminino")){
            System.out.println("A idade dela: ");
            this.idade = sc.nextInt();
            return true;
        }
        if(getSexo().equals("Masculino") || getSexo().equals("masculino")){
            System.out.println("A idade dele: ");
            this.idade = sc.nextInt();
            return true;
        }
        System.out.println("Inválido");
        System.exit(0); // comando para terminar um programa. Propositalmente não há looping para reescrever o sexo.
        return false;
    }


    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
}