package transport;

import java.util.Objects;

public class Mechanic {
    private String name;

    private String company;

    public Mechanic(String name, String company) {
        this.name = name;

        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Механик: " +
                name + " " +
                company;
    }

    public static void doService() {
        System.out.println("Техобслуживание проведено");
    }

    public static void fixAuto() {
        System.out.println("Ремонт выполнен");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic mechanic = (Mechanic) o;
        return Objects.equals(name, mechanic.name) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, company);
    }
}

