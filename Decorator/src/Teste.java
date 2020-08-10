
public class Teste {
public static void main(String[] args) {

    Fruta maça = new Maça();

    Fruta saudavelMaça = new SaudavelDecorator(new Maça());

    Fruta saudavelBanana = new SaudavelDecorator(new Banana());
    System.out.println("Maça com banana");
    maça.draw();

    System.out.println("\nMaça");
    saudavelMaça.draw();

    System.out.println("\nBanana");
    saudavelBanana.draw();
 }

}
