import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        //Animal animal = new Animal(); //Nao posso mais instanciar pelo fato da class Animal ser abstract.
        Cachorro c1 = new Cachorro();
        Gato g1 = new Gato();
        Passarinho p1 = new Passarinho();

        //animal.comer();
        c1.comer();
        g1.comer();
        p1.comer();

        List<Animal> animais = new ArrayList<>();
        animais.add(new Gato());
        animais.add(new Cachorro());
        animais.add(new Passarinho());

        for (Animal animalAtual : animais) {
            animalAtual.comer();
        }

    }

}
