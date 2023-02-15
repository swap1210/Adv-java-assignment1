import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import static java.util.Calendar.*;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class Patient extends Person {
    private String id;
    private int age;
    private Date accepted;
    private String[] prescriptions;
    private String[] allergies;
    private String[] specialReqs;
    private List<OperationsStaff> assignedOperationsStaff;

    public Patient(String title, String givenName, String middleName, String familyName, String name, String birthDate,
            String gender, String homeAddress, String phone, String id, String accepted, String[] prescriptions,
            String[] allergies, String[] specialReqs) {
        super(title, givenName, middleName, familyName, name, birthDate, gender, homeAddress, phone);
        this.id = id;
        this.age = getDiffYears(this.birthDate, new Date());
        this.accepted = string2Date(accepted);
        this.prescriptions = prescriptions;
        this.allergies = allergies;
        this.specialReqs = specialReqs;
        this.assignedOperationsStaff = new LinkedList<>();
        this.level = 3;
    }

    public void addOperationsStaff(OperationsStaff os) {
        this.assignedOperationsStaff.add(os);
    }

    @Override
    public String toString() {
        String temp = super.toString();
        int ind = temp.indexOf("Sex:") + 4;
        temp = temp.substring(0, ind) + age + "(" + gender + ")" + temp.substring(ind);
        temp += "\n" + tabs() + "Admitted on: " + accepted;
        temp += "\n" + tabs() + "prescriptions: " + Arrays.toString(prescriptions);
        temp += "\n" + tabs() + "Allergies: " + Arrays.toString(allergies);
        temp += "\n" + tabs() + "Special Reqests: " + Arrays.toString(specialReqs);
        return this.getClass().getSimpleName() + "(" + id + "): " + temp;
    }

    @Override
    public String getBirthDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        String strDate = dateFormat.format(birthDate);
        return strDate;
    }

    public static int getDiffYears(Date first, Date last) {
        Calendar a = getCalendar(first);
        Calendar b = getCalendar(last);
        int diff = b.get(YEAR) - a.get(YEAR);
        if (a.get(MONTH) > b.get(MONTH) ||
                (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
            diff--;
        }
        return diff;
    }

    public static Calendar getCalendar(Date date) {
        Calendar cal = Calendar.getInstance(Locale.US);
        cal.setTime(date);
        return cal;
    }
}
