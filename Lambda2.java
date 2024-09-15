import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

class Employee1 {
    String name;
    int salary;

    Employee1(String name , int salary) {
        this.name = name;
        this.salary = salary;
    }
}


public class Lambda2 {
    public static void main(String[] args) {
        ArrayList<Employee1> emp1 = new ArrayList<Employee1>();
        emp1.add(new Employee1("Ragha" , 30000));
        emp1.add(new Employee1("Sugha" , 40000));
        emp1.add(new Employee1("Vargha" , 50000));

        Function<Employee1 , Integer> fr = s -> {
            int sal = s.salary;
                if(sal > 20000 && sal < 30000) {
                    return sal * 10/100;
                } else if(sal > 30000 && sal < 45000 ) {
                    return sal *15/100;
                } else if(sal > 45000) {
                    return sal *12/100;
                } else return sal *9/100;
        };

        Predicate<Integer> pr = s -> s>3000;

        for(Employee1 e:emp1) {
            int bonus = fr.apply(e);
            if (pr.test(bonus)) {
                System.out.println(e.name + " bonus will be " + bonus);
            }
        }



    }
}
