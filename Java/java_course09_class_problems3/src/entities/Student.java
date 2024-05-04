package entities;

public class Student {
    public String name;
    public double firstTrimester, secondTrimester, thirdTrimester;

    public void gradeCheck(){
        double finalGrade = firstTrimester + secondTrimester + thirdTrimester;

        if ( finalGrade >= 60 ) {
            System.out.println("PASS");
        } else {
            System.out.printf("FAILED%n" +
                    "MISSING %.2f POINTS%n", 60 - finalGrade);

        }
    }
}
