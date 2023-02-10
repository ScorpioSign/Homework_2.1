package transport;

public class DriverC extends Driver{

    public DriverC(String name, boolean isLicense, int experience) {
        super(name, isLicense, experience);
    }
    public void startMoving(){
        System.out.println("водитель категории С " + getName() + "начал движение");
    };
    public void finishMoving(){
        System.out.println("водитель категории С " + getName() + "закончил движение");
    }
    public void fillCar(){
        System.out.println("водитель категории С " + getName() + "заправил машину");
    }
}
