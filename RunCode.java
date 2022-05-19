
package constructor;


public class RunCode {
    
    public static void main(String[] args) {
        Student studobj = new Student();
        Student studobj1 = new Student("123", "ifeoluwa", "oladeni@gmail.com", "26-06-1995", "08109822728");
        Student studobj2 = new Student("123", "ifeoluwa", "oladeni@gmail.com");
        
        studobj1.message();
        studobj2.mess();
        studobj.display();
        studobj.show();
    }
    
}
