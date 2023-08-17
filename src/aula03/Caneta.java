package aula03;

public class Caneta {

    public String modelo;
    public String cor;
    private Float ponta;
    protected int carga;
    private boolean tampada;

    void status() { 
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada/Destampada: " + this.tampada);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);
    }

    public void escrever() {
        if (this.tampada == true) {
            System.out.println("ERRO! A caneta está tampada");
        } else{ 
            System.out.println("A caneta está escrevendo!");
        }

    }

    public void tampar() { 
        this.tampada = true;

    }

    public void destampar() { 
        this.tampada = false;

    }
    
}
