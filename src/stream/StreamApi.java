package stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(1, "Rohit", "Mall", 30, "Male", "Mechanical Engineering", 2015, "Mumbai", 122),
                new Student(2, "Pulkit", "Singh", 56, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankit", "Patil", 25, "Female", "Mechanical Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish Ray", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Roshan", "Mukd", 23, "Male", "Biotech Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Shubham", "Pandey", 26, "Male", "Instrumentation Engineering", 2017, "Mumbai", 98));
//            1- Find list of students whose first name starts with alphabet A
        List<Student> lstStuName = list.stream().filter(student -> student.getFirstName().startsWith("A")).toList();
        System.out.println("Question 1:: " + lstStuName);

//            2- Group The Student By Department Names
        System.out.println("Question 2:: " +
                list.stream().collect(Collectors.groupingBy(Student::getDepartmantName)));

//            3- Find the total count of student using stream
        System.out.println("Question 3:: " +
                list.stream().count()
        );

//            4- Find the max age of student
        System.out.println("Question 4:: " +
                list.stream().mapToInt(Student::getAge).max().getAsInt()
        );

//            5- Find all departments names
        System.out.println("Question 5:: " +
                list.stream().map(Student::getDepartmantName).distinct().toList()
        );
//            6- Find the count of student in each department
        System.out.println("Question 6:: " +
                list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting()))
        );
//            7- Find the list of students whose age is less than 30
        System.out.println("Question 7:: " +
                list.stream().filter(dt -> dt.getAge() < 30).toList()
        );
//            8- Find the list of students whose rank is in between 50 and 100
        System.out.println("Question 8:: " +
                list.stream().filter(dt -> dt.getRank() > 50 && dt.getRank() < 100).toList()
        );
//            9- Find the average age of male and female students
        System.out.println("Question 9:: " +
                list.stream().collect(Collectors.groupingBy(Student::getGender, Collectors.averagingInt(Student::getAge)))
        );
//            10- Find the department who is having maximum number of students
        System.out.println("Question 10:: " +
                list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.counting())).entrySet().stream().max(Map.Entry.comparingByValue()).get()
        );

//            11- Find the Students who stays in Delhi and sort them by their names
        System.out.println("Question 11:: " +
                list.stream().filter(dt -> dt.getCity().equals("Delhi"))
                        .sorted(Comparator.comparing(Student::getFirstName)).toList()
        );
//            12- Find the average rank in all departments
        System.out.println("Question 12:: " +
                list.stream().collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)))
        );
//            13- Find the highest rank in each department
        Map<String, Optional<Student>> studentData = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName,
                        Collectors.minBy(Comparator.comparing(Student::getRank))));
        System.out.println("Question 13:: " + studentData);

//            14- Find the list of students and sort them by their rank
        System.out.println("Question 14:: " +
                list.stream().sorted(Comparator.comparing(Student::getRank)).toList());

//            15- Find the student who has second rank
        System.out.println("Question 15:: " +
                list.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst());

    }
}