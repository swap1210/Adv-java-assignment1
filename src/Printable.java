public class Printable {
    int level;
    final String TAB_CHARACTER = "  ";

    public String tabs() {
        String temp = "";
        for (int i = 0; i < this.level; i++)
            temp += TAB_CHARACTER;
        return temp;
    }
}
