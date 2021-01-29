import java.util.Scanner;
import java.util.ArrayList;
public class Enumerated{

    enum classOfDegree{ //enumerated value
        FIRST_CLASS,SECOND_CLASS_UPPER,SECOND_CLASS_LOWER,THIRD_CLASS, PASS}

    public static void main (String[] args){
        Scanner inputObject = new Scanner (System.in); //inputObject can be named anything of your choice
        System.out.println("Enter your CGPA");
        //System.out.println("Enter Matriculation Number");
        //float studentMatricNumber = inputObject.nextFloat();

        float cgpa = inputObject.nextFloat();

        if (cgpa>4.5 && cgpa<=5.0){
            System.out.println (classOfDegree.FIRST_CLASS);
        } else if (cgpa<4.5 && cgpa>= 3.5){
            System.out.println (classOfDegree.SECOND_CLASS_UPPER);
        } else if (cgpa<3.5 && cgpa>=3.0){
            System.out.println (classOfDegree.SECOND_CLASS_LOWER);
        } else if (cgpa<3.0 && cgpa>=2.0) {
            System.out.println(classOfDegree.THIRD_CLASS);
        } else{
            System.out.println (classOfDegree.PASS);
        }
   /* Application app_object=new Application(); //app_object can be named anything of your choice
    app_object.setMatricNumber(studentMatricNumber);

    ArrayList<String> studentData = new ArrayList<>();

    studentData.add(studentMatricNumber);
    studentData.add("Amina");
        studentData.add("200 level");
        studentData.add("Computer Science");
        studentData.add("Science and Technology");

    //System.out.println(app_object.getUniversity());
    //System.out.println("Your Matriculation Number is " +app_object.getMatricNumber());
        System.out.println(studentData); */
    }
}