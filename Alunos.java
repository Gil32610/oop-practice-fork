public class Alunos {
    private  String nome;
    private String disciplina;
    private double nota1;
    private double nota2;
    private double trabalho;
    private double media;


    public void setNome(String nome){
        this.nome = nome;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNotas(double nota1, double nota2, double trabalho){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.trabalho = trabalho;
    }
    public void setMedia(double nota1, double nota2, double trabalho){
        this.media = (((nota1*2.5) + (nota2*2.5) + (trabalho*2))/7);
    }
    public double getNota1() {
        return nota1;
    }
    public double getNota2() {
        return nota2;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getNome() {
        return nome;
    }
    public double getTrabalho(){
        return trabalho;
    }
    public double getMedia(){
        return media;
    }
}



