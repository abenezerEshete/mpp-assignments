import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("Joe", "Davis", 120000),
                new prog7.a.Employee("John", "Sims", 110000),
                new prog7.a.Employee("Joe", "Stevens", 200000),
                new prog7.a.Employee("Andrew", "Reardon", 80000),
                new prog7.a.Employee("Joe", "Cummings", 760000),
                new prog7.a.Employee("Steven", "Walters", 135000),
                new prog7.a.Employee("Thomas", "Blake", 111000),
                new prog7.a.Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));


        String result = LambdaLibrary.EMPLOYEE_FILTER.apply(list);
        System.out.println(result);
    }
}



