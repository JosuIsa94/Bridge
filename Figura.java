
package main;


public abstract class Figura {
    protected Color Color;
   
   public Figura (Color Color){
      this.Color = Color;
      
   }
   public abstract void dibujar(); 

}
