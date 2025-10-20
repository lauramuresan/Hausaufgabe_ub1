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
        if (grades.length == 0) return 0.00;
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double avg = sum / grades.length;
        return (avg * 100.0) / 100.0;
    }

    public int[] rounded_grades(int[] grades) {

        int[] rounded_grade = new int[grades.length];
        for(int i = 0; i < grades.length; i++) {

                int next_multOf_5 = (grades[i]/5 + 1) * 5;
                if(next_multOf_5 - grades[i] >= 3 || next_multOf_5 < 40)
                    rounded_grade[i] = grades[i];
                else
                    rounded_grade[i] = next_multOf_5;



        }
        return rounded_grade;
    }
}
