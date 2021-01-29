import java.util.Scanner;
import java.util.ArrayList;
public class Application extends Students{


    public static void main (String[] args){
        Scanner inputObject = new Scanner (System.in); //inputObject can be named anything of your choice
        System.out.println("Enter Matriculation Number");
        String studentMatricNumber = inputObject.nextLine();



   Application app_object=new Application(); //app_object can be named anything of your choice
    app_object.setMatricNumber(studentMatricNumber);

    ArrayList<String> studentData = new ArrayList<>();

    studentData.add(studentMatricNumber);
    studentData.add("Amina");
        studentData.add("200 level");
        studentData.add("Computer Science");
        studentData.add("Science and Technology");

    System.out.println(app_object.getUniversity());
    System.out.println("Your Matriculation Number is " +app_object.getMatricNumber());
        System.out.println(studentData);
    }
}