package program3;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Person {
    protected String name;
    protected LocalDate dob;

    public Person(String name, String dobStr) {
        this.name = name;
        this.dob = parseDate(dobStr);
    }

    private LocalDate parseDate(String dobStr) {
        try {
            return LocalDate.parse(dobStr, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        } catch (Exception e) {
            return LocalDate.parse(dobStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        }
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + calculateAge() + " years");
    }

    private int calculateAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}

