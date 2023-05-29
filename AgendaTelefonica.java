public class AgendaTelefonica {
    public static void main(String[] args){
        Contato contato[] = new Contato[5];
        contato[0] = new Contato("Bob Esponja", "(91) 95634-7146");
        contato[1] = new Contato("Patrick","(21) 96776-0712");
        contato[2] = new Contato("Lula Molusco", "(84) 90869-4915");
        contato[3] = new Contato("Seu Sirigueijo", "(41) 97033-3534");
        contato[4] = new Contato("Sandy Bochechas","(81) 98471-8835");
        for (int i = 0;i< contato.length;i++){
            System.out.println(contato[i].fenda());
        }
    }
}