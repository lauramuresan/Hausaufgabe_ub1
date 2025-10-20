public class Grades {

    public int[] insufficient_grades(int[] grades){

        int counter = 0;
        for(int grade : grades) {
            if( grade <= 40 )
                counter+=1;
        }
        int[] insufficient = new int[counter];
        int index = 0;
        for(int grade : grades) {
            if(grade <= 40)
                insufficient[index++] = grade;
        }
        return insufficient;
    }
}
