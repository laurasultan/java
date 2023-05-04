package model;

import java.util.Scanner;

public class Crime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        private boolean telefonouParaAVitima;
        private boolean esteveNoLocalDoCrime;
        private boolean moraPertoDaVitima;
        private boolean deviaParaAVitima;
        private boolean trabalhoComAVitima;

        public Crime(boolean telefonouParaAVitima, boolean esteveNoLocalDoCrime, boolean moraPertoDaVitima, boolean deviaParaAVitima, boolean trabalhoComAVitima) {
            // this.telefonouParaAVitima = telefonouParaAVitima;
            // this.esteveNoLocalDoCrime = esteveNoLocalDoCrime;
            // this.moraPertoDaVitima = moraPertoDaVitima;
            // this.deviaParaAVitima = deviaParaAVitima;
            // this.trabalhoComAVitima = trabalhoComAVitima;
            
            telefonouParaAVitima = a;
            esteveNoLocalDoCrime = b;
            moraPertoDaVitima = c;
            deviaParaAVitima = d;
            trabalhoComAVitima = e;
        }

        public String verificarNivelDeSuspeita() {
            if ((a && b) || (a && c) || (a && d) || (a && e) || (b && c) || (b && d) || (b && e) || (c && d) || (c && e) || (d && e)) {
                System.out.println("Suspeita");
            } else if ((a && b && c) || (a && b && d) || (a && b && e) || (b && c && d) || (b && c && e) || (c && d && e) || (a && b && c && d) || (b && c && d && e)) {
                System.out.printn("Cúmplice");              
            } else if (a && b && c && d && e) {
                System.out.println("Assassino");
            } else {
                System.out.println("Inocente");
            }
        }
    }
}