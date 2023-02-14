import java.util.Date;

public class Nurse extends OperationsStaff {

    public Nurse(String title, String givenName, String middleName, String familyName, String name, Date birthDate,
            String gender, String homeAddress, String phone, Date joined, String[] education, String[] certification,
            String[] languages, String designation) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages, designation);
        this.level = 3;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += this.tabs() + this.getClass().getName() + ": " + this.title + " " + this.name;
        return temp;
    }
}