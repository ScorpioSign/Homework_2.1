package transport;

public class Car extends Transport {
    private static String defaultBrand = "default";
    private static String defaultModel = "default";
    private static double defaultEngineVolume = 1.5;
    private static String defaultColor = "white";
    private static int defaultProductionYear = 2000;
    private static String defaultProductionCountry = "default";
    private static String defaultTransmission = "default";
    private static String defaultTypeBody = "default";
    private static String defaultLicensePlate = "default";
    private static int defaultSeatsNumber = 2;
    //private static String defaulttypeBody;


    private double engineVolume;
    private String transmission;
    private final String typeBody;
    private String licensePlate;
    private final int seatsNumber;
    private boolean isTyresWinter;
    private Key key; // создаем поле класса Key


    public Car(String brand, String model, double engineVolume, String color, int productionYear,
               String productionCountry, int maxSpeed, String transmission, String typeBody, String licensePlate, int sitsNumber, boolean isTyresWinter, Key key) { //добавили в конструктор поле класса Key

        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume <= 0 ? defaultEngineVolume : engineVolume;
        this.transmission = transmission == null || transmission.isEmpty() ? defaultTransmission : transmission;
        this.typeBody = typeBody == null || typeBody.isEmpty() ? defaultTypeBody : typeBody;
        this.licensePlate = licensePlate == null || licensePlate.isEmpty() ? defaultLicensePlate : licensePlate;
        this.seatsNumber = sitsNumber <= 0 ? defaultSeatsNumber : sitsNumber;
        this.isTyresWinter = isTyresWinter;
        setKey(key);

    }

    public Key getKey() { // добавляем геттер и сеттер для поля key
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key(false, false);
        }
        this.key = key;
    }


    public double getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getSitsNumber() {
        return seatsNumber;
    }

    public boolean isTyresWinter() {
        return isTyresWinter;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setTyresWinter(boolean isTyresWinter) {
        this.isTyresWinter = isTyresWinter;

    }

    public void changeTyres(int month) {
        switch (month) {
            case 5, 6, 7, 8, 9, 10, 11 -> {
                isTyresWinter = false;
            }
        }
    }


    @Override
    public String toString() {
        return super.toString() + ", " +

                " Объем двигателя: " + engineVolume + ", " +
                " Коробка передач: " + transmission + ", " +
                " Тип кузова: " + typeBody + ", " +
                " Регистрационный номер: " + licensePlate + ", " +
                " Количество мест: " + seatsNumber + ", " +
                " Резина: " + (isTyresWinter ? "winter" : "summer") + " " +
                key;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessEntry;


        public Key(boolean remoteEngineStart, boolean keylessEntry) {
            this.keylessEntry = keylessEntry;
            this.remoteEngineStart = remoteEngineStart;

        }

        public boolean isKeylessEntry() {
            return keylessEntry;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        @Override
        public String toString() {
            return
                    "Удаленный запуск двигателя: " + (remoteEngineStart ? "да" : "нет") +
                            ", Бесключевой доступ: " + (keylessEntry ? "да" : "нет")
                    ;
        }
    }
}
