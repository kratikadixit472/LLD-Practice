package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class CheeseDecorator extends PizzaDecorator{
    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return  super.getDescription() + ", Cheese Pizza";
    }

    public double getCost() {
        return 100 + super.getCost();
    }
}
