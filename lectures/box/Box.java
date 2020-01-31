package lectures.box;

public class Box{
    // Set up class Object
    int boxHeight, boxWidth, boxDepth;
    boolean boxFilled;

    public Box(int height, int width, int depth, boolean full){
        boxHeight = height;
        boxWidth = width; 
        boxDepth = depth;
        boxFilled = full;      
    }
    // Accessors/Getters(Read)
    public int getHeight(){
        return boxHeight;
    }

    public int getWidth(){
        return boxWidth;
    }

    public int getDepth(){
        return boxDepth;
    }

    public boolean isFull(){
        return boxFilled;
    }

    //Mutator/Setters(Write)

    public void setHeight(int height){
        boxHeight=height;
    }
    public void setWidth(int width){
        boxWidth=width;
    }
    public void setDepth(int depth){
        boxDepth=depth;
    }
    public void setFull(Boolean full){
        boxFilled=full;
    }

    

}