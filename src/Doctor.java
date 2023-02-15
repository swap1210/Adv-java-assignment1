import java.util.Arrays;

public class Doctor extends OperationsStaff {

    protected String[] speciality;
    protected String[] locations;

    public Doctor(String title, String givenName, String middleName, String familyName, String name, String birthDate,
            String gender, String homeAddress, String phone, String joined, String[] education, String[] certification,
            String[] languages, String designation) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages, designation);
        speciality = new String[5];
        locations = new String[5];
    }

    @Override
    public String toString() {
        String temp = super.toString();
        temp += "\n" + this.tabs() + "Speciality: " + Arrays.toString(speciality);
        temp += "\n" + this.tabs() + "Locations: " + Arrays.toString(locations);
        return temp;
    }
}
