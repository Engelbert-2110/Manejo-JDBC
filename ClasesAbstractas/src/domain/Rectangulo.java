package domain;

public class Rectangulo extends FiguraGeometrica {

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
        
    }

    @Override
    public void dubujar() {
        System.out.println("La figua es : " + this.getClass().getSimpleName());
    }

   
}
