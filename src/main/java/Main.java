public class Main {
    public static void main(String args[]){
        Counselor counselor = new Counselor("Sam White", 45, 451235, "Success Counselor", "A-J");
        Teacher teach = new Teacher("Kim Smith", 38, 12345, "Math", 458);
        Student student = new Student("Bob Brown", 19, 4521, "Freshman", 3.5);

        counselor.IDCard();
        teach.IDCard();
        student.IDCard();
    }
}
