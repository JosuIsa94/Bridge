
package main;

public class Circulo extends Figura{
     public Circulo (Color Color){
        super(Color);
        

    }
 public void Dibujar()   {
 Color.pintar();
 }

    @Override
    public void dibujar() {
    System.out.println("Dibujando Circulo ..." );
    Color.pintar();
    }
}
