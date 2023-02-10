package transport;

public class DriverD extends Driver{

    public DriverD(String name, boolean isLicense, int experience) {
        super(name, isLicense, experience);

    }
    public void startMoving(){
        System.out.println("водитель категории D " + getName() + "начал движение");
    };
    public void finishMoving(){
        System.out.println("водитель категории D " + getName() + "закончил движение");
    }
    public void fillCar(){
        System.out.println("водитель категории D " + getName() + "заправил машину");
    }
}
