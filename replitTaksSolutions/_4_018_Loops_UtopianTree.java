//The Utopian Tree grows exactly 1 cm for the first three years, and after that it grows by 2 cm every year.
//        Show 10 years of growth of the Utopian Tree.
//
//        Output:
//
//        ```
//        year 1 - growth 1 cm
//        tree size: 1cm
//
//        year 2 - growth 1 cm
//        tree size: 2cm
//
//        year 3  - growth 1 cm
//        tree size:3cm
//
//        year 4 - growth 2 cm
//        tree size: 5cm
//
//        year 5 - growth 2 cm
//        tree size: 7cm
//
//        year 6 - growth 2 cm
//        tree size: 9cm
//
//        ... until you reach year 10
//        ```


public class _4_018_Loops_UtopianTree {
    public static void main(String[] args) {

        int growth=0;
        int growthrate;

        for(int i=1;i<=10;i++)
        {
            if(i<4)
            {
                growthrate=1;
            }
            else
            {
                growthrate=2;
            }

            growth+=growthrate;

            System.out.println("year "+ i + " - growth " + growthrate + " cm");
            System.out.println("tree size: "+ growth + "cm");
        }
    }
}
