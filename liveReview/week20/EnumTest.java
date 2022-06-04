package week20;

public class EnumTest {

    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void tellItLikeItIs(){
        switch (day){
            case MONDAY:
                System.out.println("Mondays are not my Day");
                break;
            case FRIDAY:
                System.out.println("Best day ever, week is over");
                break;
            case SATURDAY:
                System.out.println("Oscar day, join the review");
                break;
            case SUNDAY:
                System.out.println("Family day, rest little bit");
                break;
            default:
                System.out.println("MeedWeeks are any ordinary day");
                break;
        }
    }

    public static void main(String[] args) {

        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.tellItLikeItIs();

        EnumTest secondDay = new EnumTest(Day.SATURDAY);
        secondDay.tellItLikeItIs();

        EnumTest thirdDay = new EnumTest(Day.SUNDAY);
        thirdDay.tellItLikeItIs();


    }
}
