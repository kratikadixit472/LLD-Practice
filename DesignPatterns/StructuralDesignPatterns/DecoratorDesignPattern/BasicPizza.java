package DesignPatterns.StructuralDesignPatterns.DecoratorDesignPattern;

public class BasicPizza implements Pizza{

    public String getDescription() {
        return "Base Pizza";
    }

    public double getCost() {
        return 100.0;
    }
}
