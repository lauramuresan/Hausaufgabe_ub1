import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Grades grade = new Grades();
        int[] grades = {29,37,38,41,84,67};
        int[] insufficient = grade.insufficient_grades(grades);
        System.out.println("Insufficient grades : " + Arrays.toString(insufficient));
        System.out.println("Average : " + String.format("%.2f", grade.average(grades)));
    }
}
