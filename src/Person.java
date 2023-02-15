import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
    final String DATE_FORMAT = "dd/MM/yyyy";

    public Person(String title, String givenName, String middleName, String familyName, String name, String birthDate,
            String gender, String homeAddress, String phone) {
        this.title = title;
        this.givenName = givenName;
        this.middleName = middleName != null ? middleName : "";
        this.familyName = familyName;
        this.name = name;
        this.birthDate = string2Date(birthDate);
        this.gender = gender;
        this.homeAddress = homeAddress;
        this.phone = phone;
    }

    @Override
    public String toString() {
        String temp = title + " " + givenName + " " + middleName + " " + familyName;
        temp += "\n" + this.tabs() + this.tabs()
                + "Date of Birth: "
                + this.getBirthDate() + " Sex: ";
        temp += "\n" + this.tabs() + this.tabs() + "Address " + homeAddress;
        temp += "\n" + this.tabs() + this.tabs() + "Phone " + phone;
        return temp;
    }

    public Date string2Date(String p_text) {
        SimpleDateFormat df = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        try {
            return df.parse(p_text);
        } catch (ParseException e) {
            System.out.println("Error parsing date!");
            return null;
        }
    }

    public abstract String getBirthDate();
}
