package aula02;

public class Caneta {

    String modelo;
    String cor;
    Float ponta;
    int carga;
    boolean tampada;

    void status() { 
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada/Destampada: " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }

    void escrever() {
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta está tampada");
        } else{ 
            System.out.println("A caneta está escrevendo!");
        }

    }

    void tampar() { 
        this.tampada = true;

    }

    void destampar() { 
        this.tampada = false;

    }
    
}
