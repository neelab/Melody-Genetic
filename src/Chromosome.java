import java.util.ArrayList;
import java.util.Random;

public class Chromosome implements Comparable<Chromosome>{    
    ArrayList<Note> notes = new ArrayList<Note>();
	double fitness = 0.0; 
	String stringRep = "";
	
    public Chromosome (ArrayList<Note> notes) {
        this.notes = notes;
        this.fitness = 5.0;
    }

    public void getFitness() {
        fitness = calculateFitness();
    }
    
    public ArrayList<Note> getNotes() {
    	return notes;
    }

    private Note randomNote() {
    	Random rand = new Random();
        int noteVal = rand.nextInt(12) + 48;
        return new Note(noteVal);
    }
    
    // TODO: Update fitness calculation
    public double calculateFitness() {
    	return 1.0;
    }
    
    // TODO: Add mutation function
    // TODO: Add crossover Function
   
    
	// Override compareTo so we can sort a chromosome by fitness in descending order
	@Override
	public int compareTo(Chromosome a) 
	{
		if (this.fitness == a.fitness)
			return 0;
		else if (this.fitness > a.fitness)
		    return -1;
		else
		    return 1;
	}

}