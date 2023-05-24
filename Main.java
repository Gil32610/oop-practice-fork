public class Main {
    public static void main(String[] args) {
        Data cal = new Data();
        Data cal2 = new Data();
        Data cal3 = new Data();

        cal.setDia("01");
        cal.setMes("01");
        cal.setAno("0001");

        cal2.setDia("01");
        cal2.setMes("01");
        cal2.setAno("0001");

        cal3.setDia("10");
        cal3.setMes("10");
        cal3.setAno("1000");


        System.out.println (cal.setData(cal.getDia(), cal.getMes(), cal.getAno()));
        System.out.println (cal.comparaDataAtual(cal));
        Aeroporto teste = new Aeroporto();
        System.out.println(teste.checarLivre(2));
    }
    }