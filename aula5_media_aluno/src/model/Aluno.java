package model;

public class Aluno {
    private float n1;
    private float n2;
    private float n3;
    private float n4;
    private float media;
    private float notaExame;

    public Aluno(float n1, float n2, float n3, float n4) {
        this.n1 = n1;           // propriedade = parametro
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.calcularMedia();
    }

    private void calcularMedia() {
        this.media = (n1 + n2 + n3 + n4) / 4f;
    }

    // model != print && scanner
    public String verificarStatusAluno() {
        StringBuilder builder = new StringBuilder("Nota exame: ");
        builder.append(this.notaExame);
        
        this.media = (this.media + this.notaExame) / 2;

        if (this.media >= 5) {
            builder.append("\nAluno aprovado");
        } else {
            builder.append("\nAluno reprovado");
        }
        builder.append("\nMédia final: ");
        builder.append(this.media);
        return builder.toString();
    }

    public String mostrarStatus() {
        StringBuilder builder = new StringBuilder("Média: ");
        builder.append(media);

        if (media >= 7) {
            builder.append("\nAluno Aprovado");
        } else if (media >= 5) {
            builder.append("\nAluno em exame\n");
        } else {
            builder.append("\nAluno Reprovado");
        }
        return builder.toString();
    }

    public void setNotaExame(float notaExame) {
        this.notaExame = notaExame;
    }
}
