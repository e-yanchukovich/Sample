package lesson8.hw1;

public class Rectangle extends Figure {
    private double line1;
    private double line2;

    public Rectangle(double lineLength) {
        line1 = lineLength;
        line2 = lineLength;
    }

    public Rectangle(double line1Length, double line2Length) {
        line1 = line1Length;
        line2 = line2Length;
    }

    public void setLineLengths(double line1Length, double line2Length) {
        line1 = line1Length;
        line2 = line2Length;
    }

    public void setLineLengths(double lineLength) {
        line1 = lineLength;
        line2 = lineLength;
    }

    public double[] getLineLengths() {
        return new double[]{line1, line2};
    }

    @Override
    public double perimeter() {
        return (line1 + line2) * 2;
    }

    @Override
    public double square() {
        return line1 * line2;
    }
}
