public class Main {
    public static void main(String[] args) {
        Alunos aluno1 = new Alunos();
        aluno1.setNome("Joao");
        aluno1.setDisciplina("Programacao");
        aluno1.setNotas(10,8,7);
        aluno1.setMedia(aluno1.getNota1(), aluno1.getNota2(), aluno1.getTrabalho());
        System.out.println("O nome do aluno é: " + aluno1.getNome() + ", " + "da cadeira de " + aluno1.getDisciplina() + ", com as notas " + aluno1.getNota1()+ ", " + aluno1.getNota2() + " e " + aluno1.getTrabalho());
        System.out.println("A média do aluno é: " + aluno1.getMedia());
    }
}