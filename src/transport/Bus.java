package transport;

public class Bus extends Transport <DriverD> implements Competitive {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoving(){
        System.out.println("автобус марки " + getBrand() +"  начал движение");
    };
    public void finishMoving(){
        System.out.println("автобус марки " + getBrand() +"  закончил движение");

    };
    public void pitstop(){
        System.out.println("pitstop у автобуса");
    }
    public void bestLapTime(){
        System.out.println("лучшее время круга у автобуса");
    }
    public void maxSpeed(){
        System.out.println("максимальная скорость у автобуса");
    }


}
