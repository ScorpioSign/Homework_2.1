public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta", 1.7,"yellow", 2015, "Russia");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany");
        Car car3 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany");
        Car car4 = new Car("Kia", "Sportage 4th generation", 2.4, "red", 2018, "South Korea");
        Car car5 = new Car("Hyundai", "Avante",1.6, "orange",2016, "South Korea");
        Car car6 = new Car("", null, 0,null, 0, "");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);

    }
}