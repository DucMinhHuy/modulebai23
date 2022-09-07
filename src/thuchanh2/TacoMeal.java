package thuchanh2;

public class TacoMeal extends Meal{
    @Override
    public void prepareIngredients() {
        System.out.println("getting groud beef and shells");
    }

    @Override
    public void cook() {
        System.out.println("Cooking ground beef in pan");
    }

    @Override
    public void cleanUp() {
        System.out.println("the tacos are tasty ");
    }
    @Override
    public void eat(){
        System.out.println("doing the dishes");
    }
}
