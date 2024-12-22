package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class OlivePizza extends PizzaDecorator{
    public OlivePizza(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return super.getDescription() + ", Olive Pizza";
    }

    public double getCost() {
        return 100 + super.getCost();
    }
}
