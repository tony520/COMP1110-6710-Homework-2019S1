package comp1110.homework.C01;

import com.sun.jdi.connect.spi.TransportService;

import java.util.LinkedList;
import java.util.List;

public class RoutePlanner {

    public static class Location {
        double xCoord, yCoord;

        Location(double xCoord, double yCoord) {
            this.xCoord = xCoord;
            this.yCoord = yCoord;
        }
    }

    LinkedList<Location> locations;

    RoutePlanner() {
        locations = new LinkedList<>();
    }

    public void addLocation(Location loc) {
        locations.add(loc);
    }

    public List<Location> calculateRoute(double startx, double starty) {
        if (locations.size() == 0) {
            return new LinkedList<>();
        }
        LinkedList<Location> res = new LinkedList<>();
        LinkedList<Location> tmp;
        tmp = (LinkedList) locations.clone();
        Location currentLocation = new Location(startx, starty);

        while (tmp.size() > 0) {
            Location nearestLocation = getNearest(tmp, currentLocation);
            currentLocation = nearestLocation;
            tmp.remove(nearestLocation);
            res.add(nearestLocation);
        }

        return res;
    }

    public Location getNearest(LinkedList<Location> allLocations, Location current) {
        Location leastOne = allLocations.get(0);
        for (int i = 1; i < allLocations.size(); i += 1) {
            if (distance(allLocations.get(i), current) < distance(leastOne, current)) {
                leastOne = allLocations.get(i);
            }
        }

        return leastOne;
    }

    public double distance(Location loc1, Location loc2) {
        double disX = loc1.xCoord - loc2.xCoord;
        double disY = loc1.yCoord - loc2.yCoord;

        return Math.sqrt(disX*disX + disY*disY);
    }
}
