package thuchanh2;

public class HamburgerMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("getting burgers, buns,and french fries");
    }

    @Override
    public void cook() {
        System.out.println("cooking burgers on grill and fries in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("throwing away paper plates");
    }
}
