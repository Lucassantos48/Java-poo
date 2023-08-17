package aula03;

public class Carros {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.modelo = "Fox";
        c1.peneo = 4;
        c1.portas = 4;
        c1.combustivel1();
        c1.combustivel();
        c1.dirigir();
        c1.mecanico();
        c1.status();

    }
    
}
