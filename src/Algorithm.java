import java.util.ArrayList;

// Base class for running genetic algorithm
public class Algorithm {
	Population population;

    int POPULATION_SIZE = 100;

    public Algorithm (ArrayList<Note> notes) {
        population = new Population();
        for (int i = 0; i< POPULATION_SIZE; i++) {
            Chromosome newChromosome = new Chromosome(notes);
            population.add(newChromosome);
        }
        population.sortPopulation();
    }

    public void run(float mutProb, int quantMut, int ITERS) {
        int currentIter = 0;
        while (currentIter < ITERS ) {
            System.out.println(currentIter);
            Population newPopulation = new Population();
            for (int i = 0; i<population.size(); i++) {
                Chromosome parent1 = population.getFittest();
                Chromosome parent2 = population.getRandom();
                // Crossover two parents Chromosome child = parent1.cross(parent2, .5f);
                // Mutate child child.mutate(mutProb, quantMut);
                Chromosome child = parent1;
                newPopulation.add(child);
            }
            newPopulation.sortPopulation();
          
            population = newPopulation;
            currentIter++;
        }
        Player.play(population.getFittest().getNotes());
    }
}
