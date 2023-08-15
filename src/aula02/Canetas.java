package aula02;

public class Canetas{ 

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Caneta 01";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.escrever();
        c1.status();

     System.out.println("===================================");
     
        Caneta c2 = new Caneta();
        c2.modelo = "Caneta 02";
        c2.cor = "Preto";
        c2.ponta = 0.8f;
        c2.tampar();
        c2.escrever();
        c2.status();

    }
}

