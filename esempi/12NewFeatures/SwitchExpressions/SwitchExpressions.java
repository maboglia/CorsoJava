public class SwitchExpressions {

    public static String printQuarter(String monthName){
        String qName = null;
        switch (monthName) {
            case "JANUARY", "FEBRUARY", "MARCH" -> qName = "Q1";
            case "APRIL", "MAY", "JUNE" -> qName = "Q2";
            default -> System.out.println("Invalid Month");
        }
        return qName;
    }
    public static String getMonthName(){return "MARCH";}

    public static void main(String[] args) {
        String monthName = getMonthName();
        String qName = switch (monthName) {
            case "JANUARY", "FEBRUARY", "MARCH" -> {
                int i=10;
                System.out.println("sdfgdg");
                yield "Q1";
            }
            case "APRIL", "MAY", "JUNE" -> {
                yield "Q2";
            }
            default -> "Invalid Month";
        };
        System.out.println("Qname with new Switch :" + qName);
    }
}
