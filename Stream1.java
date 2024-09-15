import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee2 {
    String name;
    int rno;

    Employee2(String name, int rno) {
        this.name = name;
        this.rno = rno;
    }
}

    public class Stream1 {
        public static void main(String[] args) {
            List<Employee2> list = new ArrayList();
            list.add(new Employee2("Asd",1));
            list.add(new Employee2("Sdf" , 2));
            list.add(new Employee2("Dfg", 3));
            list.add(new Employee2("Fgh", 4));
            list.add(new Employee2("Ghj", 6));

            list.stream().filter(s->s.rno > 2).forEach(pr->System.out.println(pr.name));


        }
}
