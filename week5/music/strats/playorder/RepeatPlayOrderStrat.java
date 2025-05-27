package music.strats.playorder;

import java.util.ArrayList;
import java.util.List;

public class RepeatPlayOrderStrat implements PlayOrderStrat{

    @Override
    public List<String> playOrder(List<String> playlist) {
        List<String> list = new ArrayList<>(playlist);
        list.addAll(playlist);
        return list;
    }
}
