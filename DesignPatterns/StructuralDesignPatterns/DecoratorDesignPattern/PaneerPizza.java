package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class PaneerPizza extends PizzaDecorator{
    public PaneerPizza(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + ", Paneer Pizza";
    }

    public double getCost() {
        return 100 + super.getCost();
    }
}
