import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Staff extends Person {
    private Date joined;
    private String[] education;
    private String[] certification;
    private String[] languages;

    public Staff(String title, String givenName, String middleName, String familyName, String name, Date birthDate,
            String gender, String homeAddress, String phone, Date joined, String[] education, String[] certification,
            String[] languages) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
        this.joined = joined;
        this.education = education;
        this.certification = certification;
        this.languages = languages;
    }

    @Override
    public String getBirthDate() {
        DateFormat dateFormat = new SimpleDateFormat("MMM-dd");
        String strDate = dateFormat.format(birthDate);
        return strDate;
    }

    @Override
    public String toString() {
        return this.tabs() + this.getClass().getName() + ": " + super.toString();
    }
}
