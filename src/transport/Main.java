package transport;




public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++){
            DriverB driverB = new DriverB("driverB" + i,true,3+i);
            Car car = new Car("car" + i,"model"+ i, 1.7,driverB, Car.BodyType.SEDAN);
            car.printType();
            System.out.println(car);
            printInfo(car);
            System.out.println();

            DriverC driverC = new DriverC("driverC" + i,true,5+i);
            Truck truck = new Truck("truck" + i,"model"+ i, 3.5,driverC, Truck.LoadCapacity.N1);
            truck.printType();
            System.out.println(truck);
            printInfo(truck);
            System.out.println();

            DriverD driverD = new DriverD("driverD" + i,true,7+i);
            Bus bus = new Bus("bus" + i,"model"+ i, 50,driverD, Bus.CapacityType.VERY_LITTLE);
            bus.printType();
            System.out.println(bus);
            printInfo(bus);
            System.out.println();


        }


    }
    public static void printInfo(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобильным средством " + transport.getBrand() + " и будет участвовать в заезде");
    }

}