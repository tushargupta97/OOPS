public class Inheritance {
    public static void main(String args[]){
       /*  Fish shark=new Fish();
        shark.eat(); */
       /*  Dogs Doby= new Dogs();
        Doby.eat();
        Doby.legs=4;
        System.out.println(Doby.legs);*/
        Fish shark=new Fish();
        shark.swim();
        Bird aves=new Bird();
        aves.fly();
        Mammals human=new Mammals();
        human.walk();

    }
    
    
}
//Base class
class Animals{
    String color;

    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }

}
class Mammals extends Animals{
    void walk(){
        System.out.println("walks");
    }
}
class Fish extends Animals{
    void swim(){
        System.out.println("swims");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("flies");
    }
}
//derived class
/*class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("swims in water");
    }
}*/

