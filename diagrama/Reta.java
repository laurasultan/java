public class Reta {
    private byte xDoPontoA;
    private byte yDoPontoA;
    private byte xDoPontoB;
    private byte yDoPontoB;

    public Reta(byte xDoPontoA, byte yDoPontoA, byte xDoPontoB, byte yDoPontoB) {
        this.xDoPontoA = xDoPontoA;
        this.yDoPontoA = yDoPontoA;
        this.xDoPontoB = xDoPontoB;
        this.yDoPontoB = yDoPontoB;
    }

    public float calcularCoeficienteAngular() {
        float coeficienteAngular = (yDoPontoB - yDoPontoA) / (xDoPontoB - xDoPontoA);
        return coeficienteAngular;
    }

    public float calcularCoeficienteLinear() {
        float coeficienteLinear = yDoPontoA - (calcularCoeficienteAngular() * xDoPontoA);
        return coeficienteLinear;
    }
}