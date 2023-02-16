package transport;

public abstract class Transport<T extends Driver>  {
    private static String defaultBrand = "default" ;
    private static String defaultModel = "default";
        private static double defaultEngineVolume = 1.5;
    private final String brand;
    private final String model;
    private double engineVolume;
    private T driver;



    public Transport(String brand, String model,double engineVolume, T driver) {
        this.brand = (isBrandEmpty(brand)) ? defaultBrand : brand;
        this.model = (isModelEmpty(model)) ? defaultModel : model;
        this.engineVolume = engineVolume <= 0 ? defaultEngineVolume : engineVolume;
        setDriver(driver);

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

    public abstract Type getType();


    public abstract void startMoving();
    public abstract void finishMoving();
       public abstract void printType();


    private boolean isBrandEmpty(String brand){
        return brand  == null || brand.isEmpty();
    }
    private boolean isModelEmpty(String model){
        return model  == null || model.isEmpty();
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
}
