package lesson5.lecture.intfaces2;


import java.util.List;

public class EQTriangle implements Polygon {
    private double side;

    public EQTriangle(double side) {
        this.side = side;
    }

    public EQTriangle() {
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public List<Double> getLengths() {
        return List.of(side, side, side);
    }
}