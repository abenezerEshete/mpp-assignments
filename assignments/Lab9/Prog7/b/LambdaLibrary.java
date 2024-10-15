import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {


    public static final Function<List<Employee>, String> EMPLOYEE_FILTER =
            employees -> employees.stream()
                    .filter(e -> e.getSalary() > 100000)
                    .filter(e -> e.getLastName().compareToIgnoreCase("N") >= 0)
                    .map(e -> e.getFirstName() + " " + e.getLastName())
                    .sorted()
                    .collect(Collectors.joining(", "));
}

