package DiffElements;

public class DateTime {
    public static void main(String[] args) {


        System.out.println(java.time.LocalDate.now());

    /*        2017-01-23
    Get Current Time: java.time.LocalTime
    The LocalTime.now() method returns the instance of LocalTime class. If we print the instance of LocalTime class, it prints current time.
            1.*/
        System.out.println(java.time.LocalTime.now());

        System.out.println(java.time.LocalDateTime.now());

    }
}
