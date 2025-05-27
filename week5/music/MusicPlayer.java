package music;

import music.factory.AudioFormatFac;
import music.strats.audioformat.AudioFormatStrat;
import music.strats.playorder.PlayOrderStrat;

import java.util.List;

public class MusicPlayer {

    AudioFormatStrat audioFormat;
    PlayOrderStrat orderStrat;

    public MusicPlayer(PlayOrderStrat playOrder) {
        this.orderStrat = playOrder;
    }

    public void setPlayOrderStrategy(PlayOrderStrat playOrderStrategy) {
        this.orderStrat = playOrderStrategy;
    }

    public void play(List<String> playlist) {

        List<String> playList = orderStrat.playOrder(playlist);
        for(String music : playList) {
            audioFormat = AudioFormatFac.getAudioFormat(getFileExtension(music));
            audioFormat.play(music);
        }

    }


    private String getFileExtension(String filename) {
        int idx = filename.lastIndexOf('.');
        if(idx == -1 || idx == filename.length()-1) {
            throw new IllegalArgumentException("Invalid file name: " + filename);
        }
        return filename.substring(idx+1);
    }

}
