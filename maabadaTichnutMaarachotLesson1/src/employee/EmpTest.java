package employee;



public class EmpTest {
    public static void main(String[] args) {
        Employee1 one = new Employee1("Loyer", "Itay", 5);
        System.out.println(one);
        one.change("moshe" , "scientist", 7).toString();
        System.out.println(one.change(one.getName(), one.getJob(), one.getLevel()));

    }
}
