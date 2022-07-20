import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName() {
        return name + " " + surname;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float calculateYearlySalary() {
        return getSalary() * 12;
    }

    public int calculateAge() {
        Calendar today = Calendar.getInstance();
        Calendar birthdayCalendar = Calendar.getInstance();
        birthdayCalendar.setTime(birthDate);
        int age = today.get(Calendar.YEAR) - birthdayCalendar.get(Calendar.YEAR);
        return age;
    }

    public boolean isMEI() {
        if (calculateYearlySalary() < 130000 &&
                calculateAge() > 18 &&
                anotherCompanyOwner == false &&
                pensioner == false &&
                publicServer == false) {
            return true;
        } else {
            return false;
        }
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
        this.anotherCompanyOwner = anotherCompanyOwner;
    }

    public void setPensioner(boolean pensioner) {
        this.pensioner = pensioner;
    }

    public void setPublicServer(boolean publicServer) {
        this.publicServer = publicServer;
    }
}
