import java.util.LinkedList;
import java.util.List;

public class Department extends Printable {
    private String name;
    private List<Staff> staff;
    private int staffLimit;

    public Department(String name, int staffLimit) {
        this.level = 2;
        this.name = name;
        this.staff = new LinkedList<>();
        this.staffLimit = staffLimit;
    }

    @Override
    public String toString() {
        String temp = "";
        temp += this.tabs() + this.name + " Staff:";
        for (Staff staf : staff) {
            temp += "\n" + this.tabs() + staf.toString();
        }
        return temp;
    }

    public int totalStaff() {
        return staff.size();
    }

    public void addStaff(Staff staf) throws UnableToAddException {
        if (this.staff.size() < this.staffLimit) {
            this.staff.add(staf);
        } else {
            throw new UnableToAddException("staff");
        }
    }
}
