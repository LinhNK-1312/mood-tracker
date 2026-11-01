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

        System.out.println("Cam xuc: " + mood + " | Ghi chu: " + note);

        if (mood.equals("Vui")) {
            System.out.println("Hom nay that tuyet");
        } else {
            System.out.println("Mong ban som vui hon");
        }
    }
}