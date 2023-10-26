public abstract class Shape {
    public abstract double area(); //define um comportamento
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
