
public class Aeroporto {
    private int[] vagas = new int[5];

    public void setVagas(int[] vagas) {
        this.vagas = vagas;
    }

    public int[] getVagas() {
        return vagas;
    }

    public void preencherVaga(int[] vagas) {
        vagas[0] = 0;
        vagas[1] = 0;
        vagas[2] = 1;
        vagas[3] = 1;
        vagas[4] = 0;
    }

    public String checarLivre(int[] vagas) {
        for (int i = 0; i > vagas.length; i++) {
            if (vagas[i] == 0) {
                return "ocupado";
            }
            if (vagas[i] == 1) {
                return "livre";
            }
            if(i > 1){
                i = 0;
            }
        }
        return null;
    }
}
