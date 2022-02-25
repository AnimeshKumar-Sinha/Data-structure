package vending.machine.com;

import java.util.Map;

public class Cappuccino extends Drink {

    public Cappuccino(String drinkName) {
        super(drinkName);
    }

    public Cappuccino(String drinkName, Recipe recipe, Double price, Mixer mixer) {
        super(Constant.DRINKS.CAPPUCCINO.name(), recipe, price, mixer);
    }

    @Override
    public Cappuccino process() {
        Map<Ingredient, Integer> ingredientMap = getWholeIngredient(recipe.getIngredientMap());
        Cappuccino cappuccino = (Cappuccino) mixer.makeDrink(this.drinkName, recipe.getInstructionList(), ingredientMap);
        cappuccino.price = this.price;
        cappuccino.recipe = this.recipe;
        return cappuccino;
    }

    @Override
    public void addCommonIngredient(Ingredient ingredient, int volume) {
        this.commonIngredient.put(ingredient, volume);
    }

    @Override
    public String toString() {
        return "Cappuccino{" +
                "drinkName='" + drinkName + '\'' +
                ", recipe=" + recipe +
                ", price=" + price +
                '}';
    }
}
