package music.strats.audioformat;

public class MP3AudioStrat implements AudioFormatStrat{

    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 audio track -> " + fileName);
    }
}
