
public class Receptionist extends FrontDeskStaff {
    public Receptionist(String title, String givenName, String middleName, String familyName, String name,
            String birthDate, String gender, String homeAddress, String phone, String joined, String[] education,
            String[] certification, String[] languages) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone, joined, education,
                certification, languages);
        this.level = 4;
    }
}
