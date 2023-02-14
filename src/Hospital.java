import java.util.LinkedList;
import java.util.List;

public class Hospital extends Printable {
    private String name;
    private String address;
    private String phone;
    private List<Department> departments;
    private int departmentLimit;
    private List<Person> patients;
    private int patientLimit;

    public Hospital(String name, String address, String phone, int departmentLimit, int patientLimit) {
        this.level = 1;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.departments = new LinkedList<>();
        this.departmentLimit = departmentLimit;
        this.patients = new LinkedList<>();
        this.patientLimit = patientLimit;
    }

    public int totalDepartments() {
        return departments.size();
    }

    public void addDepartment(Department dep) throws UnableToAddException {
        if (this.departments.size() < this.departmentLimit) {
            this.departments.add(dep);
        } else {
            throw new UnableToAddException("department");
        }
    }

    public void addPatient(Person pat) throws UnableToAddException {
        if (this.patients.size() < this.patientLimit) {
            this.patients.add(pat);
        } else {
            throw new UnableToAddException("patient");
        }
    }

    public Department getDepartment(int index) throws IndexOutOfBoundsException {
        return this.departments.get(index);
    }

    @Override
    public String toString() {
        String temp = "";
        temp += "\nHospital:\n";
        temp += this.tabs() + this.name + " Phone: " + this.phone;
        temp += "\n" + this.tabs() + this.address;
        temp += "\n" + this.tabs() + "Departments:";
        for (Department dep : departments) {
            temp += "\n" + this.tabs() + dep.toString();
        }

        temp += "\n" + this.tabs() + "Patientss:";
        for (Person pat : patients) {
            temp += "\n" + this.tabs() + pat.toString();
        }
        return temp;
    }
}