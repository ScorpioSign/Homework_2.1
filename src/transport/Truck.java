package transport;

public class Truck extends Transport <DriverC> implements Competitive {
    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    public void startMoving(){
        System.out.println("грузовой автомобиль марки " + getBrand() + "  начал движение");
    };
    public void finishMoving(){
        System.out.println("грузовой автомобиль марки " +getBrand() + "  закончил движение");

    };
    public void pitstop(){
        System.out.println("pitstop у грузового автомобиля");
    }
    public void bestLapTime(){
        System.out.println("лучшее время круга у грузового автомобиля");
    }
    public void maxSpeed(){
        System.out.println("максимальная скорость у грузового автомобиля");
    }
}
