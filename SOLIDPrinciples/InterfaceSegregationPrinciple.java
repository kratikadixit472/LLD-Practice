package SOLIDPrinciples;

public interface InterfaceSegregationPrinciple {
    
}

interface Shape {

}

interface TwoDimensionalShape {
    public double getArea(int a, int b);
}

interface ThreeDimensionalShape {
    public double getVolume(int a, int b, int c);
}

class Square implements TwoDimensionalShape {
    public double getArea(int a, int b) {
        return a * b;
    }
}

class Cuboid implements ThreeDimensionalShape {
    public double getVolume(int a, int b, int c) {
        return a * b * c;
    }
}