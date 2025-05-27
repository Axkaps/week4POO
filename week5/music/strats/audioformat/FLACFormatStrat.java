package music.strats.audioformat;

public class FLACFormatStrat implements AudioFormatStrat {

    @Override
    public void play(String fileName) {
        System.out.println("Playing FLAC audio track -> " + fileName);
    }
}
