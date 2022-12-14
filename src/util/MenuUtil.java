package util;

import main.Config;
import main.Student;

public class MenuUtil {
    public static  void printAllStudents(){
        if(Config.students == null){
            System.out.println("You don't have any students");
            return;
        }
        System.out.println("Students that you have registered: ");
        for (int i = 0; i < Config.students.length; i++) {
            Student student = Config.students[i];
            System.out.println((1 + i) + ". Student \n" + student.getInfo());
        }
    }

    public static void registerStudent(){
        int count = InputUtil.enterInteger("How many students are you registering?");
        Config.students = new Student[count]; // count determines the size of the array
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". Registration");
            Student studentDetails = InputUtil.fill();
            Config.students[i] = studentDetails;
        }
    }

    public  static  void findStudent(){
        String find = InputUtil.enterString("Enter the name or surname of the student you are looking for");

        for (int i = 0; i < Config.students.length; i++){
            Student student = Config.students[i];
            if (student.getName().equalsIgnoreCase(find) || student.getSurname().equalsIgnoreCase(find)){
                System.out.println(student.getInfo());
            }
        }
    }

    public static void updateStudent(){
        int student_place = InputUtil.enterInteger("Which student do you want to edit?");
        System.out.println("Enter their new information");
        Student student = InputUtil.fill();
        Config.students[student_place -1] = student;
        System.out.println(student.getInfo());
    }

}
