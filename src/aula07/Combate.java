package aula07;

public class Combate {
    public static void main(String[] args) {

        Lutador l[] = new Lutador[6];

        // Idade, altura e cartel não são os verdadeiros
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 10, 0, 3);
        l[1] = new Lutador("Charles Oliveira", "Brasil", 29, 1.70f, 69.9f, 6, 1, 0);
        l[2] = new Lutador("Jon Jones", "EUA", 33, 1.75f, 80.56f, 5, 4, 0);
        l[3] = new Lutador("Mike Tayson", "EUA", 26, 1.85f, 82.9f, 15, 3, 1);
        l[4] = new Lutador("Anderson Silva", "Brail", 36, 1.95f, 106.9f, 12, 0, 0);
        l[5] = new Lutador("Gervonta Davis", "EUA", 27, 1.89f, 109.9f, 13, 0, 0);

        l[0].status();
        
        l[1].status();
    }
    
}
