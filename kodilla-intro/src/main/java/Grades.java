public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return; //W dotychczasowych przykładach return zwracało pewną wartość, ale w metodzie oznaczonej jako void pełni ono specjalną rolę – przerywa działanie
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int checkLastAddedGrade(){
        if (size == 0){
            return 0;
        }
        return grades[size-1];
    }

    public double receiveAverageGrade(){
        double total = 0;
        for(int i = 0; i < grades.length; i++) {
            total += grades[i];
        }
        return total / size;
    }

    public static void main(String[] args){
        Grades grades = new Grades();
        grades.add(5);
        grades.add(4);
        grades.add(1);
        grades.add(5);
        grades.add(3);
        grades.add(5);

        System.out.println("Last added grade: " + grades.checkLastAddedGrade());
        System.out.println("Average grades are: " + grades.receiveAverageGrade());
    }
}
