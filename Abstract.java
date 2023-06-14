public class Abstract {
    public static void main(String args[]){
       /*  Horse h= new Horse();
        h.eat();
        h.walk();

        Chicken c=new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);*/
        Mustang myHorse=new Mustang();
        //Animal->Horse->Mustang
    } 

}
abstract class Animal{   // we can not create object of any abstract classes
    String color;
    Animal(){
       
       System.out.println("Animal constructor called");
    }
    void eat(){
        System.out.println("Eats");
    }
    abstract void walk();  // yaha implementation nahi kiya ise bolte hai abstraction * it gives idea only for a subclass ki aapke andar ye function hona hi chahiye
}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void ChangeColor(){
        color= "dark brown";
    }                                           //child class se pehle animal class ka constructor called hoga uske baad child ka . Aur yahi heirarchy follow hogi
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called");
    }
}
class Chicken extends Animal{
    Chicken(){
       System.out.println("chicken constructor called");
    }
    void ChangeColor(){ 
        color= "yellow";
    }
    void walk(){
        System.out.println("walks on 2 legs");
    }
}
    
