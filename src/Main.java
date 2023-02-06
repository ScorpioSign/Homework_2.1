import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta", 1.7,"yellow", 2015, "Russia",200,
                "auto", "sedan", "A646", 5, true, null);
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "black", 2020, "Germany", 220,
                "auto", "sedan", "A020", 5, false, new Car.Key(false,true));
        Car car3 = new Car("BMW", "Z8", 3.0, "black", 2021, "Germany", 230,
                "auto", "hatchback", "A323", 4, true, new Car.Key(true,false));
        Car car4 = new Car("Kia", "Sportage 4th generation", 2.4, "red", 2018, "South Korea",180,
                "mech", "universal", "A558", 6, true, new Car.Key(false,false));
        Car car5 = new Car("Hyundai", "Avante",1.6, "orange",2016, "South Korea", 200,
                "auto", "sedan", "A598", 5, true, new Car.Key(true,true));
        Car car6 = new Car("", null, 0,null, 0, "", 0,null, "", "",
                0, false, null);

        Bus bus1 = new Bus(null,"111", 2018, "China","", 100);
        Bus bus2 = new Bus("VOLVO", "222", 2020, "Germany", "yellow", 120);
        Bus bus3 = new Bus("HYUNDAI", "333", 2010, "South Korea", "black", 160);


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
        System.out.println(car6);
        car1.changeTyres(6);
        System.out.println();
        System.out.println(car1);
        System.out.println();
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

    }
}