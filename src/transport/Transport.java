package transport;

public class Transport {
    private static String defaultBrand = "default" ;
    private static String defaultModel = "default";
    private static String defaultColor = "white";
    private static int defaultProductionYear = 2000;
    private static String defaultProductionCountry = "default";
    private static int defaultMaxSpeed = 150;
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        this.brand = (isBrandEmpty(brand)) ? defaultBrand : brand;
        this.model = (isModelEmpty(model)) ? defaultModel : model;
        this.productionYear = productionYear <= 0 ? defaultProductionYear : productionYear;
        this.productionCountry = (isProductionCountryEmpty(productionCountry)) ? defaultProductionCountry : productionCountry;
        this.color = (isColorEmpty(color)) ? defaultColor : color;
        this.maxSpeed = maxSpeed <= 150 ? defaultMaxSpeed : maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    private boolean isBrandEmpty(String brand){
        return brand  == null || brand.isEmpty();
    }
    private boolean isModelEmpty(String model){
        return model  == null || model.isEmpty();
    }
    private boolean isProductionCountryEmpty(String productionCountry){
        return productionCountry  == null || productionCountry.isEmpty();
    }
    private boolean isColorEmpty(String color){
        return color == null || color.isEmpty();
    }

    @Override
    public String toString() {
        return "Марка: " + brand + ", " +
                " Модель: " + model + ", " +
                " Цвет кузова: " + color + ", " +
                " Год производства: " + productionYear + ", " +
                " Страна сборки: " + productionCountry + ", " +
                " Максимальная скорость: " + maxSpeed;
    }
}
