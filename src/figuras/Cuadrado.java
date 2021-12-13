package figuras;

import java.awt.Graphics;

public class Cuadrado extends FiguraGeometrica {

    private static int lado;

    public Cuadrado(int pLado) {
        super();
        lado = pLado;
    }

    public static int getLado() {
        return lado;
    }

    public static void setLado(int aLado) {
        lado = aLado;
    }
    @Override
    public float Area(){
        return (float)(lado*lado);
    }
    @Override
    public float Perimetro(){
        return(float)(lado*4);
    }
    public void drawFigure(Graphics g){
        g.drawRect((int)(155-(lado/2)), (int)(110-(lado/2)), lado, lado);
        
    }

}
