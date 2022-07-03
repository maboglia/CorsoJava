public class SwitchPractice {

    public static void printQuarter(String monthName){
        switch (monthName) {
            case "JANUARY":
            case "FEBRUARY":
            case "MARCH":
                System.out.println("Q1");
            case "APRIL":
            case "MAY":
            case "JUNE":
                System.out.println("Q2");
            default:
                System.out.println("Invalid Month with name");
        }
    }

    public static void main(String[] args) {
        //printQuarter("March".toUpperCase());
        String monthName = getMonthName();
        String quarterValue = switch (monthName) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                System.out.println("Q1");
                yield "Q1";
            }
            case "APRIL", "MAY", "JUNE" -> "Q2";
            default -> "Invalid Month with name";
        };

        System.out.println(quarterValue);
    }

    public static void yield(String s1){
        System.out.println("method");
    }

    private static String getMonthName() {
        return "March".toUpperCase();
    }
}
