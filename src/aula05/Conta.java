package aula05;

public class Conta {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();

        p1.setNumConta(1234);
        p1.setDono("Lucas");
        p1.abrirConta("CC");
        p1.estadoAtual();
        
    }
    
}
