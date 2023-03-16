import java.util.ArrayList;

public class Cabaret {
    private String name;
    private ArrayList<Performer> performers;

    public Cabaret(String name) {
        this.name = name;
        performers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public boolean addPerformer(Performer performer) {
        if (performers.contains(performer)) {
            return false;
        } else {
            performers.add(performer);
            return true;
        }
    }

    public boolean removePerformer(Performer performer) {
        int index = performers.indexOf(performer);
        if (index != -1) {
            performers.remove(index);
            return true;
        } else {
            return false;
        }
    }

    public double averagePerformerAge() {
        int sum = 0;
        for (Performer p : performers) {
            sum += p.getAge();
        }
        return (double) sum / performers.size();
    }

    public int performersOverAge(int ageLimit) {
        ArrayList<Performer> result = new ArrayList<>();
        for (Performer p : performers) {
            if (p.getAge() >= ageLimit) {

            }
        }
    }
}
