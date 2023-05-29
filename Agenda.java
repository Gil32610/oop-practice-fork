import java.util.ArrayList;
public class Agenda {
    private ArrayList<Contato> listaDeContatos; //declaração

    public Agenda(){
        this.listaDeContatos = new ArrayList<Contato>(); //Instanciação
    }
    public void adicionar(Contato c){
        listaDeContatos.add(c);
    }
    public void mostrarContatos(){
        for(int i=0;i<this.listaDeContatos.size();i++){
            System.out.println(listaDeContatos.get(i));
        }
    }
    public void remover(Contato c){
        listaDeContatos.remove(c);
    }

}

// Adicionando elementos ao ArrayList
//        listaNomes.add("João");
//                listaNomes.add("Maria");
//                listaNomes.add("Pedro");
//
//                // Acessando elementos do ArrayList
//                System.out.println("Elemento na posição 1: " + listaNomes.get(1));
//
//                // Iterando sobre os elementos do ArrayList
//                System.out.println("Elementos do ArrayList:");
//                for (String nome : listaNomes) {
//                System.out.println(nome);
//                // Verificando se o ArrayList contém um elemento
//                System.out.println("Contém 'Maria'? " + listaNomes.contains("Maria"));
//                // Removendo um elemento do ArrayList
//                listaNomes.remove("Pedro");
//                // Verificando o tamanho do ArrayList
//                System.out.println("Tamanho do ArrayList: " + listaNomes.size());