package transport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public abstract class Transport<T extends Driver> {
    private static String defaultBrand = "default";
    private static String defaultModel = "default";
    private static double defaultEngineVolume = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;
    private Set<Mechanic> mechanicSet;

    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = (isBrandEmpty(brand)) ? defaultBrand : brand;
        this.model = (isModelEmpty(model)) ? defaultModel : model;
        this.engineVolume = engineVolume <= 0 ? defaultEngineVolume : engineVolume;
        setDriver(driver);


    }



    public Transport(String brand, String model, double engineVolume, T driver, Set<Mechanic> mechanicSet) {
        this.brand = (isBrandEmpty(brand)) ? defaultBrand : brand;
        this.model = (isModelEmpty(model)) ? defaultModel : model;
        this.engineVolume = engineVolume <= 0 ? defaultEngineVolume : engineVolume;
        setDriver(driver);
        this.mechanicSet = mechanicSet;

    }


    public Set<Mechanic> getMechanicSet() {
        return mechanicSet;
    }

    public void setMechanicSet(Set<Mechanic> mechanicSet) {
        this.mechanicSet = mechanicSet;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
    public void getDiagnosed() throws TransportTypeException{

    }

    public abstract Type getType();
    public boolean checkType(Transport<?> transport) {
        if (transport.getType().equals(Type.BUS)) {
            return false;
        }
        return true;
    }



    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void printType();


    private boolean isBrandEmpty(String brand) {
        return brand == null || brand.isEmpty();
    }

    private boolean isModelEmpty(String model) {
        return model == null || model.isEmpty();
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                " Модель: " + model + ", " +
                " Объем двигателя: " + engineVolume + driver ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }
}
