package classroomhomework;

import java.util.*;


public class Classroom {

    Student[] students;


    public Classroom(int maxNumberOfStudent) {
        this.students = new Student[maxNumberOfStudent];
    }

    public Classroom(Student[] students) {
        this.students = students;

    }

    public Classroom() {
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }


    public Double getAverageExamScore() {
        Double sum = 0.0;
        for (int i = 0; i < students.length; i++) {
            sum += students[i].getAverageExamScore();
        }
        return sum / students.length;

    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            } else {}
        }
    }




    public void removeStudent(String firstName, String lastName) {
        ArrayList<Student> studentArrayList = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < studentArrayList.size(); i++) {
            Student student = studentArrayList.get(i);
            if (student!=null && student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                studentArrayList.remove(i);
                break;
            }


        }
        this.students = studentArrayList.toArray(new Student[studentArrayList.size()]);
    }


    @Override
    public String toString() {
        String listOfStudents = "This is the list of students;";
        for (int i = 0; i < students.length; i++){
            listOfStudents += students[i];
        }
        return listOfStudents;
    }




    /*
    Create a copy of the students array and assign it to the sortedStudents array.
Iterate over the sortedStudents array using the outer loop.
If the current student at index i is null, break out of the loop.
Iterate over the sortedStudents array using the inner loop, starting from i+1.
If either the student at index i or j is null, break out of the inner loop.
Compare the average exam scores of the students at index i and j.
If the average score of the student at index i is less than the average score of the student at index j, swap their positions in the sortedStudents array.
If the average scores are equal, compare the concatenation of the first name and last name of the students at index i and j.
If the concatenation of the names of the student at index i is lexicographically less than the concatenation of the names of the student at index j, swap their positions in the sortedStudents array.
If the names are equal or the student at index i has a higher score, break out of the inner loop.
Repeat steps 4-10 until all students have been compared.
Repeat steps 2-11 until all students have been sorted.
Return the sortedStudents array.
     */
    public Student[] getStudentsByScore(){
        Student[] sortedStudents = this.students;
        Student tempObj;

        for (int i = 0; i < sortedStudents.length; i++){
            if (sortedStudents[i] == null) {
                break;
            }
            for (int j = i+1; j < sortedStudents.length; j++){
                if (students[i] != null && students[j] !=null ) {
                    if(sortedStudents[i].getAverageExamScore() < sortedStudents[j].getAverageExamScore())
                    {
                        tempObj = sortedStudents[i];
                        sortedStudents[i] = sortedStudents[j];
                        sortedStudents[j] = tempObj;
                    } else if (sortedStudents[i].getAverageExamScore().equals(sortedStudents[j].getAverageExamScore())) {
                        if ((students[i].getFirstName() + students[i].getLastName()).compareTo(students[j].getFirstName() + students[j].getLastName()) < 0) {
                            tempObj = sortedStudents[i];
                            sortedStudents[i] = sortedStudents[j];
                            sortedStudents[j] = tempObj;
                        }
                        else {
                            break;
                        }
                    }
                }else {
                    break;
                }
            }
        }
        return sortedStudents;
    }



        public void getGradeBook(){
            Student[] sortedList=getStudentsByScore();
            double highestScore=sortedList[0].getAverageExamScore();//set bobby santos ass a  benchmark
            double holdScore;
            for(Student i : sortedList) {
                if (i == null) {
                    break;
                }
                holdScore = i.getAverageExamScore();
                if (holdScore / highestScore >= .90) {
                    System.out.println(i.getFirstName() + " " + i.getLastName() + " has a score of  " + i.getAverageExamScore() + " and got an A");
                } else if (holdScore / highestScore > .70) {
                    System.out.println(i.getFirstName() + " " + i.getLastName() + " has a score of  " + i.getAverageExamScore() + " and got a B");
                } else if (holdScore / highestScore > .50) {
                    System.out.println(i.getFirstName() + " " + i.getLastName() + " has a score of  " + i.getAverageExamScore() + " and got a C");
                } else if (holdScore / highestScore > .11) {
                    System.out.println(i.getFirstName() + " " + i.getLastName() + " has a score of  " + i.getAverageExamScore() + " and got a D");
                } else {
                    System.out.println(i.getFirstName() + " " + i.getLastName() + " has a score of  " + i.getAverageExamScore() + " and got an F");
                }
            }
        }


















    }




























