import transport.*;


public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++){
            DriverB driverB = new DriverB("driverB" + i,true,3+i);
            Car car = new Car("car" + i,"model"+ i, 1.7,driverB);
            DriverC driverC = new DriverC("driverC" + i,true,5+i);
            Truck truck = new Truck("truck" + i,"model"+ i, 3.5,driverC);
            DriverD driverD = new DriverD("driverD" + i,true,7+i);
            Bus bus = new Bus("bus" + i,"model"+ i, 50,driverD);
            prinInfo(car);
            prinInfo(truck);
            prinInfo(bus);
            System.out.println();

        }

    }
    public static void prinInfo(Transport<?> transport){
        System.out.println("водитель " + transport.getDriver().getName() + " управляет автомобильным средством " + transport.getBrand() + " и будет участвовать в заезде");
    }
}