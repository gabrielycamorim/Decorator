
public class SaudavelDecorator extends FrutaDecorator {

	   public SaudavelDecorator(Fruta decorarFruta) {
	      super(decorarFruta);		
	   }

	   @Override
	   public void draw() {
		   decorarFruta.draw();	       
	      setSaudavel(decorarFruta);
	   }

	   private void setSaudavel(Fruta decorarFruta){
	      System.out.println("Saudavel: Sim");
	   }

}
