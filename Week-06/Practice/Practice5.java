
public class Practice5 {
    static class Student {
        String name;
        double attendance;

        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount = 0;

        Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        static void printCollegeInfo() {
            System.out.println(collegeName);
            System.out.println("Students created: " + studentCount);
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Rahul", 90);
        Student s2 = new Student("Priya", 85);

        Student.printCollegeInfo();
    }
}
