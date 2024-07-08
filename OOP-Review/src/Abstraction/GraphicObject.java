package Abstraction;

public abstract class GraphicObject {

    int x, y;

    //abstract methods
    abstract void draw();
    abstract void resize();

    //concrete or normal methods
    void moveTo(int newX, int newY){
        System.out.println("move to x: "+x+" and y: "+y);
    }
}
