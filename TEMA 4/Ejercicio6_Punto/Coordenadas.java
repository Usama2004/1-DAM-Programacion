package daw.punto;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;

/**
 *
 * @author Oussama <oedd308@g.educaand.es>
 */
public class Coordenadas {
    
    private int x; 
    private int y;
    
    public Coordenadas(){
    
        x = 0;
        y = 0;
        
    }
    
    public Coordenadas(int x, int y){
    
        Toolkit screen = Toolkit.getDefaultToolkit();
        Dimension dim = screen.getScreenSize();
        
        x = dim.width;
        y = 0;
    
    }
    
    public Coordenadas (Point p){
        
                
        x = p.x/2;
        y = p.y/2;
        
    }
    
    public Coordenadas(double angulo, double distancia){
        double x1 = Math.sin(angulo)*distancia;
        int x2 = (int) x1;
        x = x2;
        double y1 = Math.cos(angulo)*distancia;
        int y2 = (int) y1;
        y = y2;
    }
    
     public void setX(int x1){
        x = x1;
    }
    public void setY(int y1){
        y = y1;
    }
    
    //GETTERS
    
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    
}
