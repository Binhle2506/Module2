public class Main4 {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(11, "Hoang");
        Student s2 = new Student(22, "Khanh");
        Student s3 = new Student(22, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
