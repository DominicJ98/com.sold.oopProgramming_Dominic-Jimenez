public class University {
    public static int studentCount;
    public static int employeeCount;

    static {
        studentCount = 4000;
        System.out.println("Total Students is: " + studentCount);
        employeeCount = 250;
        System.out.println("Total Employees is: " + employeeCount);
        System.out.println();
    }

    public static void enrollStudent() {
        studentCount++;
        System.out.println("Student enrolled. Student total: " + studentCount);
        System.out.println();
    }

    public static void hireEmployee() {
        employeeCount++;
        System.out.println("Employee Hired. Total Employees: " + employeeCount);
        System.out.println();
    }
}
