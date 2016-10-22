import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Population {
    private ArrayList<Chromosome> p = new ArrayList<Chromosome>();

    public void add(Chromosome c) {
        p.add(c);
    }

    public Chromosome getFittest() {
        return p.get(0);
    }

    public void sortPopulation() {
        Collections.sort(p);
    }

    public int size() {
        return p.size();
    }

    public Chromosome getRandom() {
    	Random rand = new Random();
        return p.get(rand.nextInt(p.size()));
    }
}