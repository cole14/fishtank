package environment;

import java.util.TreeMap;
import java.util.Set;

public class WorldState {
    public long seqID;
    protected java.util.Hashtable<Fish, FishState> fishStates;

    public double xDim;
    public double yDim;
    
    public Set<Fish> get_fish() {
    	return fishStates.keySet();
    }
    
    public FishState get_state (Fish f) {
    	return fishStates.get(f);
    }

    public WorldState(long ID) {
        seqID = ID;

        fishStates = new java.util.Hashtable<Fish, FishState>();
    }
}

