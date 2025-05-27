import music.MusicPlayer;
import music.strats.playorder.NormalPlayOrderStrat;
import music.strats.playorder.RepeatPlayOrderStrat;
import music.strats.playorder.ShufflePlayOrderStrat;

import java.util.ArrayList;
import java.util.List;

public class AppMusicPlayer {

    public static void main(String[] args) {

        List<String> playlist = new ArrayList<String>(4);
        playlist.add("song1.mp3");
        playlist.add("song2.wav");
        playlist.add("song3.flac");

        System.out.println("Normal Order:");
        MusicPlayer musicPlayer = new MusicPlayer(new NormalPlayOrderStrat());
        musicPlayer.play(playlist);

        System.out.println();

        System.out.println("Repeat Order:");
        musicPlayer.setPlayOrderStrategy(new RepeatPlayOrderStrat());
        musicPlayer.play(playlist);

        System.out.println();

        System.out.println("Shuffle Order:");
        musicPlayer.setPlayOrderStrategy(new ShufflePlayOrderStrat());
        musicPlayer.play(playlist);

        // Uncomment to see exception for unknown format
        // musicPlayer.play(List.of("song4.unknown"));

    }

}
