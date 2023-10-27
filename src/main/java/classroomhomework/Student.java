package classroomhomework;

import java.util.ArrayList;

public class Student {




    private String firstName;
    private String lastName;
    private ArrayList<Double> examScores;



    public Student(String firstName, String lastName, ArrayList<Double> examScores){
        this.firstName=firstName;
        this.lastName=lastName;
        this.examScores=examScores;}
/*Initialnizes constructor and variables above

     */

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }



    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getNumberOfExamsTaken(){
        return examScores.size();
}

    public String getExamScores() {
        String exam = "Exam scores: \n";
        for (int i =0 ; i < examScores.size(); i++) {
           exam += "       Exam "+ (i+1) + " ->  " +  examScores.get(i) + "\n";
        }
        return exam;
    };

    public void setExamScore(int examNumber,double newScore){
        examScores.set(examNumber,newScore);
    }

    public void addExamScores(double examScore){
        examScores.add(examScore);
    }
    public Double getAverageExamScore(){
        Double sum =0.0;
        for (int i=0;i < examScores.size();i++){
            sum += examScores.get(i);
        }
        return sum / examScores.size();
    }

    @Override
    public String toString() {
        return "Student Name: " +  firstName + " " + lastName + '\n'
                + "Average Score: " + getAverageExamScore() + '\n'
                +getExamScores();
    }
}
