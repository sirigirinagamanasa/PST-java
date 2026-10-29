
import java.util.HashMap;
import java.util.Map;

class UndergroundSystem {
    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Travel {
        int totalTime;
        int count;
    }

    Map<Integer, CheckIn> checkIns = new HashMap<>();
    Map<String, Travel> travels = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkIns.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        CheckIn start = checkIns.remove(id);

        String route = start.station + "->" + stationName;

        Travel travel = travels.get(route);

        if (travel == null) {
            travel = new Travel();
            travels.put(route, travel);
        }

        travel.totalTime += t - start.time;
        travel.count++;
    }

    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "->" + endStation;
        Travel travel = travels.get(route);

        return (double) travel.totalTime / travel.count;
    }
}

public class week7_Task3_DesignUndergroundSystem {
    public static void main(String[] args) {
        UndergroundSystem system = new UndergroundSystem();

        system.checkIn(1, "A", 3);
        system.checkOut(1, "B", 13);

        System.out.println(system.getAverageTime("A", "B"));
    }
}
