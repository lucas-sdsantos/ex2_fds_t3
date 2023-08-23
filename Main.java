public class Main {
    public static void main(String[] args) {
        Personagem um = Personagem.Normal();
        System.out.println(um);
        System.out.println("________________________________");

        Personagem dois = Personagem.Poderoso(70);
        System.out.println(dois);
        System.out.println("________________________________");

        Personagem tres = Personagem.Sortudo(7);
        System.out.println(tres);
        System.out.println("________________________________");
        
        Personagem quatro = Personagem.Ajustavel(9, 100, 5);
        System.out.println(quatro);
        System.out.println("________________________________");
    }
}
