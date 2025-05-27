package music.strats.playorder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShufflePlayOrderStrat implements PlayOrderStrat{

    @Override
    public List<String> playOrder(List<String> playlist) {
        ArrayList<String> shuffledList = new ArrayList<>(playlist);
        Collections.shuffle(shuffledList);
        return shuffledList;
    }
}
