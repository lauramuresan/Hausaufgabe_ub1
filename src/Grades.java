public class Grades {

    public int[] insufficient_grades(int[] grades) {

        int counter = 0;
        for (int grade : grades) {
            if (grade <= 40)
                counter += 1;
        }
        int[] insufficient = new int[counter];
        int index = 0;
        for (int grade : grades) {
            if (grade <= 40)
                insufficient[index++] = grade;
        }
        return insufficient;
    }

    public double average(int[] grades) {
        if (grades.length == 0) return 0.0;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double avg = sum / grades.length;
        return (avg * 100.0) / 100.0;
    }
}
