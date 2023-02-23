package transport;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Mechanic> mechanicList = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            Mechanic mechanic = new Mechanic("mechanic" + i, "company" + i);
            mechanicList.add(mechanic);
        }

        List<Transport<?>> transports = new ArrayList<>();
        ServiceStation serviceStation = new ServiceStation();
        for (int i = 1; i <= 4; i++) {


            DriverB driverB = new DriverB("driverB" + i, true, 3 + i);
            Car car = new Car("car" + i, "model" + i, 1.7, driverB, Car.BodyType.SEDAN, mechanicList);
            transports.add(car);
            car.printType();
            System.out.println(car);
            printInfo(car);
            System.out.println();

            DriverC driverC = new DriverC("driverC" + i, true, 5 + i);
            Truck truck = new Truck("truck" + i, "model" + i, 3.5, driverC, Truck.LoadCapacity.N1, mechanicList);
            transports.add(truck);
            truck.printType();
            System.out.println(truck);
            printInfo(truck);
            System.out.println();

            DriverD driverD = new DriverD("driverD" + i, true, 7 + i);
            Bus bus = new Bus("bus" + i, "model" + i, 50, driverD, Bus.CapacityType.VERY_LITTLE, mechanicList);
            transports.add(bus);
            bus.printType();
            System.out.println(bus);
            printInfo(bus);
            System.out.println();

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

// Напишите программу, с помощью которой можно узнать:
        //как зовут водителя авто;
        //какие механики есть у автомобиля.

        System.out.println();
        System.out.println("Информация о водителе и механиках:");
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите название авто: ");
        String name = scn.next();
        boolean autoExists = false;
        for (Transport<?> transport : transports) {
            if (transport.getBrand().contains(name)) {
                System.out.println("Водитель: " + transport.getDriver().getName() + " " + "механики: " + transport.getMechanicList());
                autoExists = true;

            }

        }
        if (!autoExists) System.out.println("Некорректный ввод");


    }


    public static void printInfo(Transport<?> transport) {
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобильным средством " + transport.getBrand() + " и будет участвовать в заезде");
    }


}