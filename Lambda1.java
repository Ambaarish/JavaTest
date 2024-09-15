import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String name;
    int salary;
    int experience;

    Employee(String name , int salary , int experience) {
        this.name = name;
        this.salary = salary;
        this.experience = experience;
    }
}



public class Lambda1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Raghu" , 20000 , 3);
        //Predicate<Integer> p = s -> s>10;
        //System.out.println(p.test(2));

        //Predicate<String> pr = s -> s.length() > 5;
        //System.out.println(pr.test("Gambling"));
        //System.out.println(pr.test("ted"));

//        String[] names = {"Davidson" , "Mary" , "Scott" , "Hud"};
//        for(String name:names) {
//            System.out.println(pr.test(name));
//        }

        Predicate<Employee> pr = s -> (s.salary > 10000 && s.experience > 3);
        //System.out.println(pr.test(emp));

        ArrayList<Employee> list = new ArrayList();
        list.add(new Employee("Joshy" , 10000 , 3));
        list.add(new Employee("Chethan", 20000 , 3));
        list.add(new Employee("Sujeer" , 30000 , 4));

        for(Employee d:list) {
           if (pr.test(d)) {
               System.out.println(d.name + " is eligible for promotion");
           } else {
               System.out.println(d.name + " is not eligible for promotion");
           }
        }
    }

}
