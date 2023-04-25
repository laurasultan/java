public class Funcionario {
    private short chapa;
    private String nome;
    private float valorHora;

    public Funcionario(short chapa, String nome, float valorHora) {
        this.chapa = chapa;
        this.nome = nome;
        this.valorHora = valorHora;
    }

    private float calcularDescontoINSS(float salario) {
        return salario * 0.11f;
    }

    private float calcularDescontoIR(float salario) {
        return salario * 0.075f;
    }

    public float calcularSalarioLiquido(short numeroDeHorasTrabalhadas) {
        float salarioBruto = numeroDeHorasTrabalhadas * valorHora;
        float descontoINSS = calcularDescontoINSS(salarioBruto);
        float descontoIR = calcularDescontoIR(salarioBruto);
        float salarioLiquido = salarioBruto - descontoINSS - descontoIR;
        return salarioLiquido;
    }
}
