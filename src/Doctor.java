import java.util.Date;

public class Doctor extends OperationsStaff {
    public Doctor(String title, String givenName, String middleName, String familyName, String name, Date birthDate,
            String gender, String homeAddress, String phone, Date joined, String[] education, String[] certification,
            String[] languages, String designation) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages, designation);
        // TODO Auto-generated constructor stub
    }

    protected String[] speciality;
    protected String[] locations;

}
