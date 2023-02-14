import java.util.Date;

public class SurgicalTechnologiest extends Technologist {
    public SurgicalTechnologiest(String title, String givenName, String middleName, String familyName, String name,
            Date birthDate, String gender, String homeAddress, String phone, Date joined, String[] education,
            String[] certification, String[] languages) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages);
        this.level = 4;
    }

}
