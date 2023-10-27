package classroomhomework;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> examScores1 = new ArrayList<>();
        ArrayList<Double> examScores2 = new ArrayList<>();
        ArrayList<Double> examScores3 = new ArrayList<>();
        examScores1.add(90.00);
        examScores1.add(59.00);
        examScores1.add(65.00);
        examScores2.add(77.00);
        examScores2.add(90.00);
        examScores2.add(55.00);
        examScores3.add(90.00);
        examScores3.add(90.00);
        examScores3.add(80.00);
        Student student = new Student("Bob", "jeff", examScores1);
        Student student2 = new Student("Jefff", "Hello", examScores2);
        Student student3 = new Student("bobby", "santos", examScores3);
        Classroom classroom = new Classroom();
        classroom.addStudent(student);
        classroom.addStudent(student2);
        classroom.addStudent(student3);



        System.out.println(Arrays.toString(classroom.getStudentsByScore()) );

        classroom.getGradeBook();


    }
    }
