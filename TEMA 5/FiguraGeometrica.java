package ejercicio_26;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public interface FiguraGeometrica {
    
    public double getArea();
    public int getPrimero();
    public void dibujar(Graphics g);
    Cuadrado crearCuadradoIgualArea(Point esquinaSuperiorIzquierda);
    
}
