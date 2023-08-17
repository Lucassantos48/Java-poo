package aula03;

public class Canetas{ 

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.modelo = "Bic Prime";
        c1.cor = "Preto";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.destampar();
        c1.status();
    
    }
}

