package oops;

public class StringConcat {
    public static void main(String[] args) {
        //java execute the code left to right
        System.out.println("Result " + 1 + 2 + 3); //op Result 123
        System.out.println("Result " + (1 + 2 + 3)); //op 6 Result
        System.out.println(1 + 2 + 3 + " Result"); //op 6 Result
    }


}

