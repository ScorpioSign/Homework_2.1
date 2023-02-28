package transport;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Mechanic> mechanicSet = new HashSet<>();


        mechanicSet.add(new Mechanic("mechanic1", "company1"));
        mechanicSet.add(new Mechanic("mechanic2", "company2"));
        mechanicSet.add(new Mechanic("mechanic3", "company3"));
        mechanicSet.add(new Mechanic("mechanic1", "company1"));
        mechanicSet.add(new Mechanic("mechanic2", "company2"));


        System.out.println("Информация о механиках: ");
        Iterator<Mechanic> mechanicName = mechanicSet.iterator();
        while (mechanicName.hasNext()) {
            System.out.println(mechanicName.next());
        }


        System.out.println();

        List<Transport<?>> transports = new ArrayList<>();
        ServiceStation serviceStation = new ServiceStation();
        Map<Transport<?>, Set<Mechanic>> mechanicMap = new HashMap<>();
        for (int i = 1; i <= 4; i++) {


            DriverB driverB = new DriverB("driverB" + i, true, 3 + i);
            Car car = new Car("car" + i, "model" + i, 1.7, driverB, Car.BodyType.SEDAN);
            transports.add(car);
            car.printType();
            System.out.println(car);
            printInfo(car);
            System.out.println();
            mechanicMap.put(car, mechanicSet);

            DriverC driverC = new DriverC("driverC" + i, true, 5 + i);
            Truck truck = new Truck("truck" + i, "model" + i, 3.5, driverC, Truck.LoadCapacity.N1);
            transports.add(truck);
            truck.printType();
            System.out.println(truck);
            printInfo(truck);
            System.out.println();
            mechanicMap.put(truck, mechanicSet);

            DriverD driverD = new DriverD("driverD" + i, true, 7 + i);
            Bus bus = new Bus("bus" + i, "model" + i, 50, driverD, Bus.CapacityType.VERY_LITTLE);
            transports.add(bus);
            bus.printType();
            System.out.println(bus);
            printInfo(bus);
            System.out.println();
            mechanicMap.put(bus, mechanicSet);

        }
        System.out.println();
        System.out.println("Список автомобиль-механик: ");
        for (Map.Entry<Transport<?>, Set<Mechanic>> autoAndMechanics : mechanicMap.entrySet()) {
            System.out.println("Автомобиль " + autoAndMechanics.getKey() + "   Механики: " + autoAndMechanics.getValue());

        }
        System.out.println();

        System.out.println("Информация о прохождении диагностики: ");
        for (Transport<?> transport : transports) {
            try {
                System.out.print(transport.getBrand());
                transport.getDiagnosed();
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println();

        System.out.println("Прохождение техосмотра: ");
        for (Transport<?> transport : transports) {
            ServiceStation.addInQueue(transport);
            ServiceStation.makeInspection(transport);
        }


        System.out.println();


    }


    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобильным средством " + transport.getBrand() + " и будет участвовать в заезде");
    }


}