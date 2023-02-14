import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Patient extends Person {
    private String id;
    private int age;
    private Date accepted;
    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;
    private List<OperationsStaff> assignedOperationsStaff;

    public Patient(String title, String givenName, String middleName, String familyName, String name, Date birthDate,
            String gender, String homeAddress, String phone, String id, int age, Date accepted, String[] prescriptions,
            String[] allergies, String[] specialReqs) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
        this.id = id;
        this.age = age;
        this.accepted = accepted;
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
        this.assignedOperationsStaff = new LinkedList<>();
    }

    public void addOperationsStaff(OperationsStaff os) {
        this.assignedOperationsStaff.add(os);
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", age=" + age + ", accepted=" + accepted + ", prescriptions="
                + Arrays.toString(prescriptions) + ", allergies=" + Arrays.toString(allergies) + ", specialReqs="
                + Arrays.toString(specialReqs) + "]";
    }

}
