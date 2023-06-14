public class OOPS {
    public static void main(String args[]){
      Pen p1=new Pen(); //created a pen object called p1
      p1.setColor("Blue");
      System.out.println(p1.color);
      p1.setTip(5);
      System.out.println(p1.tip);
      //p1.setColor("yellow");
      p1.color="Yellow";
      System.out.println(p1.color);


      BankAccount myAcc=new BankAccount();
      myAcc.username="Tushar Gupta";
      //myAcc.password="abcedfghi"; #error
      myAcc.setPassword("abcdefghi");


    }
}
class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color =newColor ;
    }

    void setTip(int newTip){
        tip=newTip;
    }
}  

class Student{
    int age;
    String name;
    float percentage;//cgpa

    void calcPercentage(int math, int phy, int chem){
       float percentage=(math+phy+chem)/3;
    }
}


class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
}

