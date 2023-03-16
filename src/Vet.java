import java.util.ArrayList;

public class Vet {
    private String name;
    ArrayList<Animal> clients;

    public Vet(String name) {
        this.name = name;
        clients = new ArrayList<>();
    }

    public void addClient(Animal newAnimal) {
        if (clients.contains(newAnimal)) {
            System.out.println(newAnimal.getName() + " is already a client of " + name + "!");
        } else {
            clients.add(newAnimal);
            System.out.println("Welcome to " + name + "'s office, " + newAnimal.getName() + "!");
        }
    }
}
