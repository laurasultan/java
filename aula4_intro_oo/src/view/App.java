package view;

import model.Cliente;
import model.Vendedor;
import model.Produto;
import model.Item;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(
            (byte) 33,
            "Florisbaldo",
            "504.713.620-50"
        );
        Vendedor vendedor = new Vendedor(
            (byte) 1,
            "Paulo Gilberto",
            "331.647.950-33"
        );
        Item item = new Item(
            new Produto(
                "ABC123",
                "Bolacha Trakinas Banana",
                3.44f
            ),
            (byte) 5
        );
    }
}