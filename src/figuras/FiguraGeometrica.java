package figuras;
import java.awt.Graphics;

public abstract class FiguraGeometrica {
    private static float area;
    private static float perimetro;

    public static float getArea() {
        return area;
    }

    public static void setArea(float aArea) {
        area = aArea;
    }

    public static float getPerimetro() {
        return perimetro;
    }

    public static void setPerimetro(float aPerimetro) {
        perimetro = aPerimetro;
    }
    public abstract void drawFigura(Graphics g);
    public abstract float Area();
    public abstract float Perimetro();
    
}
