package main;

// Aquí creamos una nueva figura

public class Cuadrado extends Figura {
    public Cuadrado (Color Color){
    super(Color);
    }
 
    
    
    public void Dibujar()   {
 Color.pintar();
 }

    @Override
    public void dibujar() {
    System.out.println("Dibujando Cuadrado ..." );
    Color.pintar();
    }
}
