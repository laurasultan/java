package model;

import java.util.Scanner;

public class Triangulo {
    public void static main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        private int ladoA;
        private int ladoB;
        private int ladoC;

        public Triangulo(int ladoA, int ladoB, int ladoC) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        }

        public int getLadoA() {
            return this.ladoA;
        }

        public void setLadoA(int ladoA) {
            this.ladoA = ladoA;
        }

        public int getLadoB() {
            return this.ladoB;
        }

        public void setLadoB(int ladoB) {
            this.ladoB = ladoB;
        }

        public int getLadoC() {
            return this.ladoC;
        }

        public void setLadoC(int ladoC) {
            this.ladoC = ladoC;
        }

        public String verificarTipoDeTriangulo() {
            String trianguloType = switch (triangulo) {
                case (ladoA == ladoB == ladoC):
                    System.out.println("Triângulo Equilátero");
                    break;
                case (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC):
                    System.out.println("Triângulo Isósceles");
                    break;
                case (ladoA != ladoB != ladoC):
                    System.out.println("Triângulo Escaleno"); 
            }
        }
    }
}