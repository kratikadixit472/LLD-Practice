package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class MushroomPizza extends PizzaDecorator{
    
    public MushroomPizza(Pizza pizza) {
        super(pizza);
    }
    
    public String getDescription() {
        return super.getDescription() + ", Mushroom Pizza";
    }

    public double getCost() {
        return 100 + super.getCost();
    }
}
