
public class Teste {
public static void main(String[] args) {

    Fruta ma�a = new Ma�a();

    Fruta saudavelMa�a = new SaudavelDecorator(new Ma�a());

    Fruta saudavelBanana = new SaudavelDecorator(new Banana());
    System.out.println("Ma�a com banana");
    ma�a.draw();

    System.out.println("\nMa�a");
    saudavelMa�a.draw();

    System.out.println("\nBanana");
    saudavelBanana.draw();
 }

}
