
public class Practice5 {
    static class AttendanceSheet {
        private String[] names;
        private int presentCount;

        public AttendanceSheet(int size) {
            names = new String[size];
            presentCount = 0;
        }

        public void markPresent(String name) {
            if (isPresent(name)) {
                return;
            }

            if (presentCount < names.length) {
                names[presentCount] = name;
                presentCount++;
            }
        }

        public int getPresentCount() {
            return presentCount;
        }

        public boolean isPresent(String name) {
            for (int i = 0; i < presentCount; i++) {
                if (names[i].equals(name)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println("Present count: " + sheet.getPresentCount());
        System.out.println("Ben present: " + sheet.isPresent("Ben"));
        System.out.println("Chen present: " + sheet.isPresent("Chen"));
    }
}
