package transport;

import java.util.Queue;

public class TechStation {
    private Queue<Transport> transportQueue;

    public TechStation(Queue<Transport> transportQueue) { this.transportQueue = transportQueue;}

    public void addCarinQueue(Transport transport) {
        if (transport instanceof Bus) {
            System.out.println("Busses do not need technical check-up");
        }
        else {
            transportQueue.add(transport);
        }
    }

    public void startTransportInspection() {
        if (transportQueue.isEmpty()) {
            System.out.println("no transport in the queue");
        }
        else {
            Transport transport = transportQueue.poll();
            System.out.println(" inspect " + transportQueue.poll().getBrand());
        }
    }
}
