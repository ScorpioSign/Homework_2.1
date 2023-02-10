package transport;

public class Car extends Transport <DriverB> implements Competitive {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }


    public void pitstop() {
        System.out.println("pitstop у легкового автомобиля");
    }

    public void bestLapTime() {
        System.out.println("лучшее время круга у легкового автомобиля");
    }

    public void maxSpeed() {
        System.out.println("максимальная скорость у легкового автомобиля");
    }

    public void startMoving() {
        System.out.println("легковой автомобиль марки " + getBrand() + " начал движение");
    }

    ;

    public void finishMoving() {
        System.out.println("легковой автомобиль марки " + getBrand() + " закончил движение");

    }
}

