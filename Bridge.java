
package main;

public class Bridge {
    public static void main(String[] args) {
        Figura f = new Circulo(new Rojo());
        f.dibujar();
        //f.Color=new Rojo();
        
        // TAREA
        
        
        Figura f2 = new Cuadrado(new Azul());
        f2.dibujar();
    }
    
}
