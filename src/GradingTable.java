public class GradingTable {
    public static void main(String[] args) {
        System.out.println(getGrade(33));
        System.out.println(getGrade(53));
        System.out.println(getGrade(63));
        System.out.println(getGrade(73));
        System.out.println(getGrade(83));
        System.out.println(getGrade(93));
    }

    public static String getGrade(int points) {
        if (points >= 90) {
            return "Outstanding";
        } else if (points >= 78) {
            return "Excellent";
        } else if (points >= 65) {
            return "Acceptable";
        } else if (points >= 51) {
            return "Passing";
        } else {
            return "Fail";
        }
    }
}
