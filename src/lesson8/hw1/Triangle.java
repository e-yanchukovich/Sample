package lesson8.hw1;

public class Triangle extends Figure {
    private double line1;
    private double line2;
    private double line3;

    public Triangle(double lineLength) {
        line1 = line2 = line3 = lineLength;
    }

    public Triangle(double leg1Length, double leg2Length) {
        line1 = leg1Length;
        line2 = leg2Length;
        line3 = Math.sqrt(leg1Length * leg1Length + leg2Length * leg2Length);
    }

    public Triangle(double line1Length, double line2Length, double line3Length) {
        line1 = line1Length;
        line2 = line2Length;
        line3 = line3Length;
    }

    public void setLineLengths(double line1Length, double line2Length, double line3Length) {
        line1 = line1Length;
        line2 = line2Length;
        line3 = line3Length;
    }

    public void setLineLengths(double lineLength) {
        line1 = line2 = line3 = lineLength;
    }

    public void setLineLengths(double leg1Length, double leg2Length) {
        line1 = leg1Length;
        line2 = leg2Length;
        line3 = Math.sqrt(leg1Length * leg1Length + leg2Length * leg2Length);
    }

    public double[] getLineLengths() {
        return new double[]{line1, line2};
    }

    @Override
    public double perimeter() {
        return line1 + line2 + line3;
    }

    @Override
    public double square() {
        double p = (line1 + line2 + line3) / 2;
        return Math.sqrt(p * (p - line1) * (p - line2) * (p - line3));
    }
}
