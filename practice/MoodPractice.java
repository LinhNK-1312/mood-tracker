public class MoodPractice {
    public static void main(String[] args) {
        String mood = "Vui";
        System.out.println(mood);
        System.out.println("mood");

        mood = "Buon";
        System.out.println(mood);

        String note = "Hoc Java";
        System.out.println(note);

        note = "Da hieu bien";
        System.out.println(note);

        printMoodSummary(mood, note);
        String message = getMoodMessage(mood); // Nhận lời nhắn và lưu vào biến message
        System.out.println("Loi nhan: " +message);          // In giá trị của message
        }
        static void printMoodSummary(String mood, String note) {
        System.out.println("Cam xuc: " + mood + " | Ghi chu: " + note);
        }

        static String getMoodMessage(String mood) { // MỞ phương thức trả về String
        if (mood.equals("Vui")) {
            return "Hom nay that tuyet";
        } else if (mood.equals("Buon")) {
            return "Hay nghi ngoi mot chut";
        } else {
            return "Chuc ban mot ngay binh yen";
        }
    } // ĐÓNG phương thức getMoodMessage
}