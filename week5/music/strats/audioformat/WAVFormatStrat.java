package music.strats.audioformat;

public class WAVFormatStrat implements AudioFormatStrat {

    @Override
    public void play(String fileName) {
        System.out.println("Playing WAV audio track -> " + fileName);
    }
}
