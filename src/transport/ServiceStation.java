package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private static Queue<Transport<?>> service;


    public ServiceStation() {
        service = new LinkedList<>();
    }


    public static void addInQueue(Transport<?> transport) {
        if (transport.checkType(transport)) {
            service.offer(transport);
            System.out.println(transport.getBrand() + " поставлен в очередь");
        }
    }

    public static void makeInspection(Transport<?> transport) {

        if (transport.checkType(transport)) {
            System.out.println(transport.getBrand() + " техосмотр проведен");
            service.poll();

        }
    }
}

