import java.util.Scanner;

public class Pessoa {
    private String nome;
    private String sexo;
    private int idade;
    Scanner sc = new Scanner(System.in);

    public void setNome() {
        System.out.println("Digite o nome va painho: ");
        this.nome = sc.nextLine();
    }

    public void setSexo() {
        System.out.println("O sexo do caba ");
        this.sexo = sc.nextLine();
    }

    public boolean setIdade(){
        if(getSexo().equals("Feminino") || getSexo().equals("feminino")){
            System.out.println("Diga a idade da cuie va: ");
            this.idade = sc.nextInt();
            return true;
        }
        if(getSexo().equals("Masculino") || getSexo().equals("masculino")){
            System.out.println("Diga a idade do homi va: ");
            this.idade = sc.nextInt();
            return true;
        }
        System.out.println("Existe nn flw kkk");
        System.exit(0); // comando para terminar um programa;
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