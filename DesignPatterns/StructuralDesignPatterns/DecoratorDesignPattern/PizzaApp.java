package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class PizzaApp {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();

        // Add decorator
        pizza = new CheeseDecorator(pizza);
        pizza = new PaneerPizza(pizza);
        pizza = new OlivePizza(pizza);
        pizza = new MushroomPizza(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
