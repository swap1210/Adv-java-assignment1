
public class Nurse extends OperationsStaff {

    public Nurse(String title, String givenName, String middleName, String familyName, String name, String birthDate,
            String gender, String homeAddress, String phone, String joined, String[] education, String[] certification,
            String[] languages, String designation) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages, designation);
        this.level = 4;
    }

}