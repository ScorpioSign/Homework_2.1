package transport;

public class Car extends Transport<DriverB> implements Competitive {
    private BodyType bodyType;
    private Type type;


    public Car(String brand, String model, double engineVolume, DriverB driver, BodyType bodyType) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    @Override
    public Type getType() {
        return Type.CAR;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public BodyType getBodyType() {
        return bodyType;
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

    @Override
    public void startMoving() {
        System.out.println("легковой автомобиль марки " + getBrand() + " начал движение");
    }

    ;

    @Override
    public void finishMoving() {
        System.out.println("легковой автомобиль марки " + getBrand() + " закончил движение");

    }

    @Override
    public void getDiagnosed() {
        System.out.println(": необходимо пройти диагностику");
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
                " Объем двигателя: " + getEngineVolume() + getDriver() + getBodyType();
    }


    enum BodyType {

        SEDAN("«Седан»"),
        HATCHBACK("Хетчбэк"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String translation;

        BodyType(String translation) {
            this.translation = translation;
        }

        public String getTranslation() {
            return translation;
        }

        @Override
        public String toString() {
            return " Тип кузова: " + getTranslation();
        }
    }
}

