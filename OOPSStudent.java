public class OOPSStudent {
    public static void main(String args[]){
       /*  Student s1=new Student("Tushar");*/
       Student s1= new Student();
       s1.name="Tushar";s1.roll=456;
       s1.password="abcd";
       s1.marks[0]=100;
       s1.marks[1]=90;
       s1.marks[2]=80;

       Student s2= new Student(s1); //copy

       s2.password="xyz";
       s1.marks[2]=100;

       //Student s3= new Student(64);
       //Student s3= new Student("Aman",64); //errors

       for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    
       }


       
    }
}
    
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    /*Student (Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }*/

    //deep copy comstructor
    Student(Student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        for (int i=0;i<marks.length;i++){
            this.marks[i]=s1.marks[i];
        } 
        
    } 


    Student(String name){  //parameterized constructor
        marks =new int[3];
        this.name=name;
    }
    Student(){    //non parameterized constructor
        marks=new int[3];
        System.out.println("costructor is called...");
    }
    Student(int roll){  //parameterized constructor
        this.roll=roll;
    }
}

    

