package aula02;

public class Carro {
    String marca;
    String modelo;
    int ano;
    int peneo;
    int portas;
    boolean flex;
    boolean manutencao;

    void status() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Peneo: " + this.peneo);
        System.out.println("Portas: " + this.portas);
        System.out.println("Flex: " + this.flex);
        System.out.println("Manutenção: " + this.manutencao);

    }

    void mecanico() {
        if (this.manutencao == true || this.peneo < 4) {
            System.out.println("ATENÇÃO! O carro não pode ser utilizado");
            
        } else {
            System.out.println("MANUTENÇÃO FEITA");
            
        }
    }
    void parado() {
        this.manutencao = true;
    }
    void dirigir() {
        this.manutencao = false;
    }

    void combustivel() {
        if (this.flex == true) {
            System.out.println("Alcool/Gasolina");
            
        } else {
            System.out.println("Gasolina");
        }
    }

    void combustivel1() { 
        this.flex = true;
    }

    void combustivel2() { 
        this.flex = false;
    }
    
}
