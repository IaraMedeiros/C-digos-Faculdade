package Exercicio2;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    private boolean isBissexto;

    String mesExtenso;

    public Data() {
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.isBissexto = anoBissexto();

        if(mes < 1 || mes > 12){
            this.mes = 1;
        }
        if (dia < 1 || dia > 31){
            this.dia = 1;
        }

        this.mesExtenso = extenso();
    }

    public boolean anoBissexto(){
        if(this.ano % 4 == 0){
            if(this.ano % 100 != 0){
                return true;
            }
            if(this.ano % 100 == 0 && this.ano % 400 ==0){
                return true;
            }
        }
        return false;
    }

    public String extenso() {
        String[] nomesDosMeses = {
                "janeiro", "fevereiro", "março", "abril", "maio", "junho",
                "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"
        };

        if (mes >= 1 && mes <= 12) {
            return nomesDosMeses[mes - 1];
        } else {
            return "Mês inválido";
        }
    }
    public Data( Data minhaData){
        this.dia = minhaData.getDia();
        this.mes = minhaData.getMes();
        this.ano = minhaData.getAno();
        this.mesExtenso = minhaData.getMesExtenso();
        this.isBissexto = minhaData.getIsBissexto();
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public boolean getIsBissexto() {
        return isBissexto;
    }

    public String getMesExtenso() {
        return mesExtenso;
    }

    public int compara( Data data2){
        if(this.getAno() == data2.getAno() && this.getMes() == data2.getMes() && this.getDia() == data2.getDia()){
            return 0;
        } else if(this.getAno() == data2.getAno() && this.getMes() > data2.getMes() && this.getDia() > data2.getDia()
                || this.getAno() == data2.getAno() && this.getMes() > data2.getMes()
                || this.getAno() > data2.getAno()){
            return 1;
        } else{
            return -1;
        }
    }

    public Data clonar(){
        return new Data(this);
    }

    @Override
    public String toString() {
        return "Data{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", ano=" + ano +
                ", isBissexto=" + isBissexto +
                ", mesExtenso='" + mesExtenso + '\'' +
                '}';
    }
}
