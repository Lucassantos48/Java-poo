package aula08;

public class ProjetoLivro {
    public static void main(String[] args) {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Lucas", 22, "M");
        p[1] = new Pessoa("Maria", 20, "F");

        l[0] = new Livro("A Praia", "Desconhecido", 150, p[0]);
        l[1] = new Livro("A floresta", "José dos Santos", 200, p[1]);

        l[1].abrir();
        l[1].folhear(30);
        System.out.println(l[1].detalhes());

    }
    
}
