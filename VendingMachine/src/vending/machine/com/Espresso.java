package vending.machine.com;

import java.util.Map;

public class Espresso extends Drink {

    String extraIngredient;

    public Espresso(String drinkName) {
        super(drinkName);
    }

    public Espresso(String drinkName, Recipe recipe, Double price, Mixer mixer) {
        super(Constant.DRINKS.ESPRESSO.name(), recipe, price, mixer);
        this.extraIngredient = "added cream";
    }

    @Override
    public Espresso process() {
        Map<Ingredient, Integer> ingredientMap = getWholeIngredient(recipe.getIngredientMap());
        Espresso espresso = (Espresso) mixer.makeDrink(this.drinkName, recipe.getInstructionList(), ingredientMap);
        espresso.price = this.price;
        espresso.recipe = this.recipe;
        return espresso;
    }

    @Override
    public void addCommonIngredient(Ingredient ingredient, int volume) {
        this.commonIngredient.put(ingredient, volume);
    }

    @Override
    public String toString() {
        return "Espresso{" +
                "extraIngredient='" + extraIngredient + '\'' +
                ", drinkName='" + drinkName + '\'' +
                ", recipe=" + recipe +
                ", price=" + price +
                '}';
    }
}
