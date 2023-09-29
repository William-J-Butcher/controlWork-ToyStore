import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        Store controller = new Store();

        ArrayList<Toy> toys = new ArrayList<>();
        toys.add(new Toy(1, "Мягкая игрушка", 40));
        toys.add(new Toy(2, "Машинка", 50));
        toys.add(new Toy(3, "Кукла", 30));
        toys.add(new Toy(4, "Пазл", 20));
        toys.add(new Toy(5, "Робот", 55));

        int numberOfToys = 20; // Сколько нужно призов получить

        controller.fileWriter(toys, "results.txt", numberOfToys);
    }

}