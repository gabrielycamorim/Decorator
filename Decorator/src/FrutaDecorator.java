
public abstract class FrutaDecorator implements Fruta {
	   protected Fruta decorarFruta;

	   public FrutaDecorator(Fruta decorarFruta){
	      this.decorarFruta = decorarFruta;
	   }

	   public void draw(){
		   decorarFruta.draw();
	   }	

}
