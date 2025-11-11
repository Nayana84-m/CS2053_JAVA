class Student {
    String sname, usn, programme;
    char section;
    int semester;

    Student(String s, String u, String p, char sec, int sem) {
        sname = s; usn = u; programme = p; section = sec; semester = sem;
    }

    void show() {
        System.out.println(sname + " | " + usn + " | " + programme + " | " + section + " | " + semester);
    }

    public static void main(String[] args) {
        Student st = new Student("Nayana", "1rua24scs0065", "BSc CS", 'b', 3);
        st.show();
    }
}