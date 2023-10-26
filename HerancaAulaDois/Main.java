public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Object o = new Base();
//
//        o.equals(null);
//        o.getClass();
//        o.hashCode();
//        o.notify();
//        o.toString();
//        o.wait();
//        o.wait(200);
//
//        if (o instanceof  Base)
//            ((Base)o).acao1();

        Retangulo rec = new Retangulo();
        rec.setBase(20);
        rec.setAltura(10);
        processar(rec);
        Quadrado quad = new Quadrado();
        quad.setLado(20);
        processar(quad);

        processar(new Circulo());
    }
    public static void processar(Shape shape) {
        System.out.println("A área do "+shape.getName()+" é "+ shape.area());
    }
}