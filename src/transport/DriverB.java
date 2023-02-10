package transport;

public class DriverB extends Driver{

    public DriverB(String name, boolean isLicense, int experience) {
        super(name, isLicense, experience);

    }
    public void startMoving(){
        System.out.println("водитель категории В " + getName() + "начал движение");
    };
    public void finishMoving(){
        System.out.println("водитель категории В " + getName() + "закончил движение");
    }
    public void fillCar(){
        System.out.println("водитель категории В " + getName() + "заправил машину");
    }

}
