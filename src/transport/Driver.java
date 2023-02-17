package transport;

public abstract class Driver {
    private String name;
    private boolean isLicense;
    private int experience;


    public Driver(String name, boolean isLicense, int experience) {
        this.name = name;
        this.isLicense = isLicense;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return " Водитель: " +
                "имя: " + name +
                ", наличие лицензии: " + isLicense +
                ", experience: " + experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLicense() {
        return isLicense;
    }

    public void setLicense(boolean license) {
        isLicense = license;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public abstract void startMoving();
    public abstract void finishMoving();
    public abstract void fillCar();

}
