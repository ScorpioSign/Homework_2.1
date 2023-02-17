package transport;

public class Truck extends Transport <DriverC> implements Competitive {
    private LoadCapacity loadCapacity;
    private Type type;

    public Truck(String brand, String model, double engineVolume, DriverC driver, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }
    @Override
    public void startMoving() {
        System.out.println("грузовой автомобиль марки " + getBrand() + "  начал движение");
    }

    ;
    @Override
    public void finishMoving() {
        System.out.println("грузовой автомобиль марки " + getBrand() + "  закончил движение");

    }



    public void pitstop() {
        System.out.println("pitstop у грузового автомобиля");
    }

    public void bestLapTime() {
        System.out.println("лучшее время круга у грузового автомобиля");
    }

    public void maxSpeed() {
        System.out.println("максимальная скорость у грузового автомобиля");
    }
    @Override
    public Type getType(){
        return Type.TRUCK;
    }
    @Override
    public void printType() {
        if (getType() == null){
            System.out.println("Данных по транспортному средству недостаточно");
        }else {
            System.out.println("Тип транспортного средства: " + getType());
        }
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", " +
                " Модель: " + getModel() + ", " +
                " Объем двигателя: " + getEngineVolume() + getDriver() + getLoadCapacity();
    }

    enum LoadCapacity {
        N1(0, 3.5f),
        N2(3.51f, 12f),
        N3(12.01f, 100f);
        private float startMass;
        private float finishMass;

        LoadCapacity(float startMass, float finishMass) {
            this.startMass = startMass;
            this.finishMass = finishMass;
        }

        public float getStartMass() {
            return startMass;
        }

        public float getFinishMass() {
            return finishMass;
        }

        @Override
        public String toString() {
            if (startMass == 0) {
                return " Грузоподъемность до "
                        + finishMass + " тонн";
            }else if(finishMass > 12){
                return " Грузоподъемность свыше "
                        + (int) startMass + " тонн";
            } else {
                return " Грузоподъемность от " +
                        startMass + " тонн до "
                        + finishMass + " тонн";
            }
        }
    }
}