
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

        String[] dobs = { "08/11/1990",
                "25/10/1994",
                "08/04/1977",
                "07/06/1985",
                "17/02/1996",
                "14/01/1989",
                "20/08/1995",
                "17/10/1990",
                "11/09/1984",
                "27/07/1991",
                "08/05/1994",
                "11/12/1990",
                "16/08/1994",
                "11/07/1993",
                "11/08/1976",
                "16/03/1983",
                "10/09/1985",
                "24/03/1983",
                "14/09/1993",
                "13/03/1984" };

        Person p1 = new Patient("Mr.", "Roshan", null, "Robinson", null, dobs[0], "M", "233 Bay Area Blvd",
                "678-789-3411", null, dobs[6],
                args,
                args, args);
        try {
            hospital.addPatient(p1);
        } catch (UnableToAddException e) {
            System.out.println(e.getMessage());
        }

        Staff nurse1 = new Nurse("Mrs.", "Gracy", null, "Palmer", null, dobs[1], "F", "230 Bay Area Blvd",
                "678-789-3411",
                dobs[7], args, args,
                args,
                null);
        Staff surg1 = new Surgeon("Dr.", "Peter", null, "Garrison", null, dobs[2], "M", "231 Bay Area Blvd",
                "678-789-3411",
                dobs[8], args, args,
                args, null);

        Staff recpt1 = new Receptionist("Ms.", "Jenny", null, "Saul", null, dobs[3], "F", "232 Bay Area Blvd",
                "678-789-3411",
                dobs[9], args,
                args,
                args);

        Staff technician1 = new Technician("Mr.", "Bob", "the", "Builder", null, dobs[4], "M", "233 Bay Area Blvd",
                "678-789-3411", dobs[7],
                args,
                args,
                args);
        Staff surgicalTech1 = new SurgicalTechnologiest(null, null, null, null, null, dobs[5], "M",
                "234 Bay Area Blvd", "678-789-3411",
                dobs[10],
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