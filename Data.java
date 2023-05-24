public class Data {
    private String dia;
    private String mes;
    private String ano;
    private String data;

    public void setDia(String dia){
        this.dia = dia;
    }
    public void setMes(String mes){
        this.mes = mes;
    }
    public void setAno(String ano){
        this.ano = ano;
    }
    public String setData(String dia, String mes, String ano){
        this.data = dia + "/" + mes + "/" + ano;
        return data;
    }

    public String getDia(){
        return dia;
    }
    public String getMes(){
        return mes;
    }
    public String getAno() {
        return ano;
    }
    public String getData() {
        return data;
    }

    public boolean comparaDataAtual(Data data){
        Data hoje = new Data();
        hoje.setDia("24");
        hoje.setMes("05");
        hoje.setAno("2023");
        String hojeFormatada = setData(hoje.getDia(), hoje.getMes(), hoje.getAno()); //24/05/2023
        String dataFormatada = setData(data.getDia(), data.getMes(), data.getAno()); //01/01/0001
        if (hojeFormatada.equals(dataFormatada)){
            return true;
        }
        return false;
    }
}