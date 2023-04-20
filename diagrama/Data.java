public class Data {
    private byte dia;
    private String mes;
    private short ano;
    private String diaDaSemana;

    public Data(byte dia, String mes, short ano, String diaDaSemana) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.diaDaSemana = diaDaSemana;
    }
    
    public boolean eAnoBisexto() {
        return ano % 4 == 0;
    }

    public String toString() {
        return dia + "/" + mes + "/" + ano + " (" + diaDaSemana + ")";
    }
}
