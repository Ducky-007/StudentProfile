//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //create two different students with different profiles
        Student studentA = new Student(
                "Cameron",
                "Duckett",
                2025,
                3.50,
                "Computer Science",
                "Senior");

        Student studentB = new Student(
                "Jim",
                "Halpert",
                2030,
                3.23,
                "The Office",
                "Freshman");

        //print students A and B's info
        System.out.println(
                studentA.firstName + " " +
                studentA.lasName + ", " +
                studentA.expectedGradYear + ", " +
                studentA.gpa + ", " +
                studentA.major + ", " +
                studentA.currCollegeLevel
        );

        System.out.println(
                studentB.firstName + " " +
                studentB.lasName + ", " +
                studentB.expectedGradYear + ", " +
                studentB.gpa + ", " +
                studentB.major + ", " +
                studentB.currCollegeLevel
        );

        //call function to increment year
        System.out.println(studentA.nextIncrementedGradYear());
        System.out.println(studentB.nextIncrementedGradYear());
    }
}
