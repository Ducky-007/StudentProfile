public class Student {
    //first name
    String firstName;

    //last name
    String lasName;

    //expected year to graduate
    int expectedGradYear;

    //GPA
    double gpa;

    //Declared major
    String major;

    //current level in school
    String currCollegeLevel;

    //function that increments student's expected graduation year by one
    public Student(
            String firstName,
            String lasName,
            int expectedGradYear,
            double gpa,
            String major,
            String currCollegeLevel) {

        //create constructor for each attribute
        this.firstName = firstName;
        this.lasName = lasName;
        this.expectedGradYear = expectedGradYear;
        this.gpa = gpa;
        this.major = major;
        this.currCollegeLevel = currCollegeLevel;
    }

    //call incremented graduation year function of one of the student's profiles and print out expected grad year
    public int nextIncrementedGradYear() {
        return ++expectedGradYear;
    }
}
