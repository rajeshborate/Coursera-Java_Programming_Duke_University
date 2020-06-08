
/**
 * Write a description of DistanceFilter here.
 * 
 * 
 */
public class DistanceFilter implements Filter{
    private Location location;
    private float maximumDistance;

    public DistanceFilter(Location loc, float maxDistance) {
        location = loc;
        maximumDistance = maxDistance;
    }

    public boolean satisfies(QuakeEntry qe) { 
        return qe.getLocation().distanceTo(location) < maximumDistance; 
    }
    
    public String getName() {
        return "Distance";
    }
}
