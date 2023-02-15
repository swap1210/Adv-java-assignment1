import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Staff extends Person {
    private Date joined;
    private String[] education;
    private String[] certification;
    private String[] languages;

    public Staff(String title, String givenName, String middleName, String familyName, String name, String birthDate,
            String gender, String homeAddress, String phone, String joined, String[] education, String[] certification,
            String[] languages) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
        this.joined = string2Date(joined);
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
        String temp = this.tabs() + this.getClass().getName() + ": " + super.toString();
        temp += "\n" + this.tabs() + "Joined on: " + joined;
        temp += "\n" + this.tabs() + "Education: " + Arrays.toString(education);
        temp += "\n" + this.tabs() + "Certification: " + Arrays.toString(certification);
        temp += "\n" + this.tabs() + "Languages: " + Arrays.toString(languages);
        return temp;
    }
}
