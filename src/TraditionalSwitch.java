public class TraditionalSwitch {
    public static void main(String[] args) {

        char letter = 'B';

        switch (letter) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            case 'C':
                System.out.print("Charlie");
                break;
            case 'D':
                System.out.print("Dog");
                break;
            case 'E':
                System.out.print("Easy");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        printDayOfWeek(7);

    }
    public static void printDayOfWeek(int day) {
         String dayOfWeek = switch(day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Invalid Day";
        };
        System.out.println(dayOfWeek);
    }
}
