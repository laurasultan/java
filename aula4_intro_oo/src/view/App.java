package view;

import model.Cliente;
import model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa paulo = new Cliente();
        paulo.setCodigo((byte) 1);
        paulo.setPontosDeFidelidade((short) 1500);
    }
}