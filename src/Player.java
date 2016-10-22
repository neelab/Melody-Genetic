import javax.sound.midi.MidiSystem;
import javax.sound.midi.Synthesizer;

import java.util.ArrayList;

import javax.sound.midi.MidiChannel;

public class Player {

    public static void play(ArrayList<Note> notes) {
        int channel = 0;
        int volume = 80; 
        // duration in milliseconds
        int duration = 200;

        try {
            Synthesizer synth = MidiSystem.getSynthesizer();
            synth.open();
            MidiChannel[] channels = synth.getChannels();

            for (int i = 0; i<notes.size(); i++) {
                Note note = notes.get(i);
                channels[channel].noteOn( note.midiVal(), volume );
                if (i == notes.size() -1 ) {
                    Thread.sleep(2400);
                } else {
                    Thread.sleep(note.duration());
                }
                channels[channel].noteOff( note.duration()  );
            }
            synth.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}