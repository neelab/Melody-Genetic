import java.util.HashMap;

public class Note {
    private int value;
    private String name;
    private int duration;


    public Note(String name, int duration) {
        this.value = convertToMidi(name);
        this.name = name;
        this.duration = duration;
    }

    public Note (int midiVal) {
        this.duration = 4;
        this.value = midiVal;
        this.name = "todo";
    }

    public int midiVal() {
        return value;
    }

    public String name() {
        return name;
    }

    public int duration()  {
        return duration;
    }

    public int val() {
        return value;
    }
    
    private int convertToMidi(String name){
    	HashMap<String, Integer> noteMap = new HashMap<String, Integer>();
        
        noteMap.put("C2", 48);
        noteMap.put("C#2", 49);
        noteMap.put("D2", 50);
        noteMap.put("Eb2", 51);
        noteMap.put("E2", 52);
        noteMap.put("F2", 53);
        noteMap.put("F#2", 54);
        noteMap.put("G2", 55);
        noteMap.put("G#2", 56);
        noteMap.put("A2", 57);
        noteMap.put("Bb2", 58);
        noteMap.put("B2", 59);
        noteMap.put("C3", 60);
    	return noteMap.get(name);        
    }
}