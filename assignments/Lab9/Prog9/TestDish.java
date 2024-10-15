import java.util.Optional;

public class TestDish {
    public static void main(String[] args) {
        // a. Is there any Vegetarian meal available (return type boolean)
        boolean anyVegetarian = Dish.menu.stream()
                .anyMatch(Dish::isVegetarian);
        System.out.println("Is there any Vegetarian meal available? " + anyVegetarian);

        // b. Is there any healthy menu having calories less than 1000 (return type boolean)
        boolean anyHealthyMenu = Dish.menu.stream()
                .anyMatch(dish -> dish.getCalories() < 1000);
        System.out.println("Is there any healthy menu (calories < 1000)? " + anyHealthyMenu);

        // c. Is there any unhealthy menu having calories greater than 1000 (return type boolean)
        boolean anyUnhealthyMenu = Dish.menu.stream()
                .anyMatch(dish -> dish.getCalories() > 1000);
        System.out.println("Is there any unhealthy menu (calories > 1000)? " + anyUnhealthyMenu);

        // d. find and return the first item for the type of MEAT (return type Optional<Dish>)
        Optional<Dish> firstMeatDish = Dish.menu.stream()
                .filter(dish -> dish.getType() == Dish.Type.MEAT)
                .findFirst();
        System.out.println("First MEAT dish: " + firstMeatDish.orElse(null));

        // e. calculateTotalCalories() in the menu using reduce (return int)
        int totalCalories = Dish.menu.stream()
                .map(Dish::getCalories)
                .reduce(0, Integer::sum);
        System.out.println("Total calories in the menu: " + totalCalories);

        // f. calculateTotalCaloriesMethodReference() in the menu using MethodReferences (return int)
        int totalCaloriesMethodReference = Dish.menu.stream()
                .mapToInt(Dish::getCalories)
                .sum();
        System.out.println("Total calories in the menu (using method reference): " + totalCaloriesMethodReference);
    }
}
