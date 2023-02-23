package transport;
import java.util.List;
public class Bus extends Transport<DriverD> implements Competitive {
    private CapacityType capacityType;
    private Type type;

    public Bus(String brand, String model, double engineVolume, DriverD driver, CapacityType capacityType,List<Mechanic> mechanicList) {
        super(brand, model, engineVolume, driver, mechanicList);
        this.capacityType = capacityType;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public Type getType() {
        return Type.BUS;
    }

    public CapacityType getCapacityType() {
        return capacityType;
    }

    @Override
    public void startMoving() {
        System.out.println("автобус марки " + getBrand() + "  начал движение");
    }

    ;

    @Override
    public void finishMoving() {
        System.out.println("автобус марки " + getBrand() + "  закончил движение");

    }

    ;

    public void pitstop() {
        System.out.println("pitstop у автобуса");
    }

    public void bestLapTime() {
        System.out.println("лучшее время круга у автобуса");
    }

    public void maxSpeed() {
        System.out.println("максимальная скорость у автобуса");
    }

    @Override
    public void getDiagnosed() throws TransportTypeException {
        throw new TransportTypeException(": автобусы диагностику проходить не должны");
    }

    @Override
    public void printType() {
        if (getType() == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println("Тип транспортного средства: " + getType());
        }

    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + ", " +
                " Модель: " + getModel() + ", " +
                " Объем двигателя: " + getEngineVolume() + getDriver() + getCapacityType() + getMechanicList();
    }

    enum CapacityType {
        VERY_LITTLE(0, 10),
        LITTLE(11, 25),
        AVERAGE(26, 50),
        HIGH(51, 80),
        VERY_HIGH(81, 120);
        private int minNumberOfSeats;
        private int maxNumberOfSeats;

        CapacityType(int minNumberOfSeats, int maxNumberOfSeats) {
            this.minNumberOfSeats = minNumberOfSeats;
            this.maxNumberOfSeats = maxNumberOfSeats;
        }

        public int getMinNumberOfSeats() {
            return minNumberOfSeats;
        }

        public int getMaxNumberOfSeats() {
            return maxNumberOfSeats;
        }

        @Override
        public String toString() {
            if (minNumberOfSeats == 0) {
                return " Вместимость: до " +
                        maxNumberOfSeats + " мест";
            } else {
                return " Вместимость: " +
                        minNumberOfSeats + " - "
                        + maxNumberOfSeats + " мест";
            }
        }

    }
}
