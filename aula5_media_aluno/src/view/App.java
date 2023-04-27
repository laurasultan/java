package view;

import java.util.Scanner;
import model.Aluno;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a primeira nota:");
        float n1 = teclado.nextFloat();
        System.out.println("Digite a segunda nota:");
        float n2 = teclado.nextFloat();
        System.out.println("Digite a terceira nota:");
        float n3 = teclado.nextFloat();
        System.out.println("Digite a quarta nota:");
        float n4 = teclado.nextFloat();

        Aluno aluno = new Aluno(n1, n2, n3, n4);
        String status = aluno.mostrarStatus();

        System.out.println(status);

        if (status.contains("Aluno em exame")) {
            System.out.println("Digite a nota do exame:");
            float notaExame = teclado.nextFloat();
            aluno.setNotaExame(notaExame);
            System.out.println(aluno.verificarStatusAluno());
        }
    }
}
