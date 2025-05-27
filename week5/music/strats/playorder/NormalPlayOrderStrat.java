package music.strats.playorder;

import java.util.ArrayList;
import java.util.List;

public class NormalPlayOrderStrat implements PlayOrderStrat{

    @Override
    public List<String> playOrder(List<String> playlist) {
        return new ArrayList<>(playlist);
    }
}
