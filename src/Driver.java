public class Driver {
    public static void main(String args[]) {
        Hospital hospital = new Hospital("Hi-Tech Medical Center", "2305 Bay Area Blvd", "+1-800-890-7865", 4, 6);
        try {
            hospital.addDepartment(new Department("Orthodontics", 3));
            hospital.addDepartment(new Department("Surgery", 3));
            hospital.addDepartment(new Department("Paediatrics", 3));
            hospital.addDepartment(new Department("Neurology", 3));
        } catch (UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        Person p1 = new Patient(null, null, null, null, null, null, null, null, null, null, 0, null, args, args, args);
        try {
            hospital.addPatient(p1);
        } catch (UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        Staff nurse1 = new Nurse(null, null, null, null, null, null, null, null, null, null, args, args, args, null);
        Staff surg1 = new Surgeon(null, null, null, null, null, null, null, null, null, null, args, args, args, null);
        try {
            hospital.getDepartment(0).addStaff(nurse1);
            hospital.getDepartment(0).addStaff(surg1);
        } catch (IndexOutOfBoundsException | UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(hospital);
    }
}