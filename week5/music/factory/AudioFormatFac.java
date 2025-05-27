package music.factory;

import music.strats.audioformat.AudioFormatStrat;
import music.strats.audioformat.FLACFormatStrat;
import music.strats.audioformat.MP3AudioStrat;
import music.strats.audioformat.WAVFormatStrat;

import java.util.HashMap;
import java.util.Map;

public class AudioFormatFac {

    private static final Map<String, AudioFormatStrat> audioMap = new HashMap<>();

    static {
        MP3AudioStrat mp3AudioFormat = new MP3AudioStrat();
        audioMap.put("mp3", mp3AudioFormat);
        WAVFormatStrat wavFormatStrat = new WAVFormatStrat();
        audioMap.put("wav", wavFormatStrat);
        FLACFormatStrat flacFormatStrat = new FLACFormatStrat();
        audioMap.put("flac", flacFormatStrat);
    }

    /* Good software design anticipates change...
     * Even though the original problem statement only mentions three audio formats
     * (MP3, WAV, and FLAC), it is wise to design your AudioFormatFactory with a
     * method like registerFormat that allows you to add new formats easily
     * in the future.
     */
    public static void registerFormat(String extension, AudioFormatStrat strategy) {
        audioMap.put(extension.toLowerCase(), strategy);
    }

    public static AudioFormatStrat getAudioFormat(String audioFormat) {
        AudioFormatStrat audioFormatStrat = audioMap.get(audioFormat);
        if (audioFormatStrat == null) {
            throw new IllegalArgumentException("Audio format not supported: " + audioFormat);
        }

        return audioFormatStrat;

    }

}
