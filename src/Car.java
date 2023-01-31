public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        if (brand == null || brand.equals("")) {
            brand = "default";
        }
        this.brand = brand;

        if (model == null || model.equals("")) {
            model = "default";
        }
        this.model = model;

        if (productionCountry == null || productionCountry.equals("")) {
            productionCountry = "default";
        }
        this.productionCountry = productionCountry;

        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;

        if (color == null || color.equals("")) {
            color = "white";
        }
        this.color = color;
        if (productionYear <= 0) {
            productionYear = 2000;
        }
        this.productionYear = productionYear;

    }



    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", color='" + color + '\'' +
                ", year=" + productionYear +
                ", country='" + productionCountry + '\'' +
                '}';
    }
}
