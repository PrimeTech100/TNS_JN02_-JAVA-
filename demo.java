import java.util.*;

class Main {/*from   w w  w.  j  a  v  a2 s  .  com*/

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();
 
        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person {

    private String firstName;
    private String lastName;
    private int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    void printPerson() {

        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {

    private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores) {

        super(firstName, lastName, id);
        this.testScores = testScores;
    }

    char calculate() {

        int tally = 0;
        for (int score : this.testScores) {
            tally += score;
        }

        int average = (tally / this.testScores.length);

        if (average > 40) {
            if (average >= 90) {
                return 'O';
            }
            if (average >= 80 && average < 90) {
                return 'E';
            }
            if (average >= 70 && average < 80) {
                return 'A';
            }
            if (average >= 55 && average < 70) {
                return 'P';
            }
            if (average >= 40 && average < 55) {
                return 'D';
            }
        }

        return 'T';
    }
}
