package f_8August;

public class DistanceBetweenBusStops {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int shun = 0, ni = 0;
        if(start > destination){
            int tem = start;
            start = destination;
            destination = tem;
        }
        for(int i = start; i < destination; i++){
            shun += distance[i];
        }
        for(int i = 0; i < start; i++){
            ni += distance[i];
        }
        for(int i = destination; i < distance.length; i++){
            ni += distance[i];
        }
        if(shun > ni)return ni;
        return shun;
    }
}
