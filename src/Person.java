import java.util.Date;

public abstract class Person extends Printable {
    protected String title;
    protected String givenName;
    protected String middleName;
    protected String familyName;
    protected String name;
    protected Date birthDate;
    protected String gender;
    protected String homeAddress;
    protected String phone;

    public Person(String title, String givenName, String middleName, String familyName, String name, Date birthDate,
            String gender, String homeAddress, String phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName;
        this.familyName = familyName;
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

}
