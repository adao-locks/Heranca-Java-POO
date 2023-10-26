public class Quadrado extends Shape {

    private double lado;

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }
}
