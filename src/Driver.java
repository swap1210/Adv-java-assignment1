import java.util.Date;

public class Driver {
    public static void main(String args[]) {
        Hospital hospital = new Hospital("Hi-Tech Medical Center", "2305 Bay Area Blvd", "+1-800-890-7865", 4, 6);
        try {
            hospital.addDepartment(new Department("Orthodontics", 7));
            hospital.addDepartment(new Department("Surgery", 5));
            hospital.addDepartment(new Department("Paediatrics", 3));
            hospital.addDepartment(new Department("Neurology", 3));
        } catch (UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        Person p1 = new Patient("Mr.", "Roshan", null, "Robinson", null, new Date(), null, null, null, null, 0, null,
                args,
                args, args);
        try {
            hospital.addPatient(p1);
        } catch (UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        Staff nurse1 = new Nurse("Mrs.", "Gracy", null, "Palmer", null, new Date(), "F", null, null, null, args, args,
                args,
                null);
        Staff surg1 = new Surgeon("Dr.", "Peter", null, "Garrison", null, new Date(), "M", null, null, null, args, args,
                args, null);

        Staff recpt1 = new Receptionist("Ms.", "Jenny", null, "Saul", null, new Date(), "F", null, null, null, args,
                args,
                args);

        Staff technician1 = new Technician("Mr.", "Bob", "the", "Builder", null, new Date(), null, null, null, null,
                args,
                args,
                args);
        Staff surgicalTech1 = new SurgicalTechnologiest(null, null, null, null, null, new Date(), null, null, null,
                null,
                args, args, args);
        try {
            hospital.getDepartment(0).addStaff(nurse1);
            hospital.getDepartment(0).addStaff(surg1);
            hospital.getDepartment(0).addStaff(recpt1);
            hospital.getDepartment(0).addStaff(technician1);
            hospital.getDepartment(0).addStaff(surgicalTech1);
        } catch (IndexOutOfBoundsException | UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(hospital);
    }
}