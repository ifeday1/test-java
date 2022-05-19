
package constructor;
import java.util.Scanner;


public class Student {
    String studentNumber;
    String studentName;
    String email;
    String dob;
    String phoneNum;
    
    Student()
    {
        
    }
    
      Student(String we, String wee, String weee)
    {
        studentNumber = we;
        studentName = wee;
        email= weee;
    }

        Student(String se, String see, String seee, String  seeee, String seeeee)
    {
        studentNumber = se;
        studentName = see;
        email= seee;
        dob=seeee;
        phoneNum=seeeee;
    }
        
        Scanner input = new Scanner(System.in);
        
        void display() {
            System.out.println("Enter Student Number: ");
            studentNumber = input.next();
            
             System.out.println("Enter Student Name: ");
            studentName = input.next();
            
             System.out.println("Enter Email Address: ");
            email = input.next();
            
            System.out.println(studentNumber + studentName + email);
        }
        
        void show() {
            System.out.println("Enter Student Number: ");
            studentNumber = input.next();
            
             System.out.println("Enter Student Name: ");
            studentName = input.next();
            
             System.out.println("Enter Email Address: ");
            email = input.next();
            
            System.out.println("Enter Date of Birth: ");
            dob = input.next();
            
            System.out.println("Enter Phone Number: ");
            phoneNum = input.next();
            
            System.out.println(studentNumber + studentName + email + dob + phoneNum);
        }
        
        void message()
        {
            System.out.println(studentNumber + studentName + email + dob + phoneNum);
        }    
        
         void mess()
        {
            System.out.println(studentNumber + studentName + email);
        } 
}
