package vending.machine.com;

import java.util.Map;

public class Americano extends Drink {

    public Americano(String drinkName) {
        super(drinkName);
    }

    public Americano(String drinkName, Recipe recipe, Double price, Mixer mixer) {
        super(Constant.DRINKS.AMERICANO.name(), recipe, price, mixer);
    }

    @Override
    public Americano process() {
        Map<Ingredient, Integer> ingredientMap = getWholeIngredient(recipe.getIngredientMap());
        Americano americano = (Americano) mixer.makeDrink(this.drinkName, recipe.getInstructionList(), ingredientMap);
        americano.price = this.price;
        americano.recipe = this.recipe;
        return americano;
    }

    @Override
    public void addCommonIngredient(Ingredient ingredient, int volume) {
        this.commonIngredient.put(ingredient, volume);
    }

    @Override
    public String toString() {
        return "Americano{" +
                "drinkName='" + drinkName + '\'' +
                ", recipe=" + recipe +
                ", price=" + price +
                '}';
    }
}

