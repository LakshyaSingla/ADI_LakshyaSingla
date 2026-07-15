public class MethodOverriding {
    static class Student{
        void Name(String name){
            System.out.println("Name is: " + name);
        }
    }
    static class John extends Student{
        @Override
        void Name(String name) {
            System.out.println("Name is " + name);
        }
    }

    public static void main(String[] args) {
        // THis is just creating the object of John class
        John j = new John();
        j.Name("John");

        // This is using polymorphism and we have created object of student class but used function of john class by using polymorphism
        Student s = new John();
        s.Name("Student John");

        // This is just creating object of student class
        Student s1 = new Student();
        s1.Name("Student");
    }
}
