public class Pen{
    public static void main(String args[]){
          Penn p1=new Penn(); 
          p1.setColor("Blue");
          System.out.println(p1.getColor());
          p1.setTip(5);
          System.out.println(p1.getTip());
          p1.setColor("Yellow");
          System.out.println(p1.getColor());
    }
}

class Penn{
    String
color;
    int tip;
    
    String getColor(){
        return this.color; 
    }
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    } 
}

