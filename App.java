public class App {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person("Nhi",17 , "nu");
        person1.getInfo();
        Employee employee1 = new Employee("Tuyen", 19, "nam", "Student");
        employee1.getInfo();
        Worker worker1 = new Worker("Dien", 18, "nu", 10);
        worker1.getInfo();
        Engineer engineer1 = new Engineer("Van", 19, "nu", "Chinese");
        engineer1.getInfo();
    }
}
