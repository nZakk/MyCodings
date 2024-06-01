import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDate date01 = LocalDate.now();
        LocalDateTime date02 = LocalDateTime.now();
        Instant date03 = Instant.now();


        System.out.println(date01);
        System.out.println(date02);
        System.out.println(date03);

        LocalDate date04 = LocalDate.parse("2022-07-20");
        LocalDateTime date05 = LocalDateTime.parse("2022-07-20T23:59:27.374237944");
        Instant date06 = Instant.parse("2022-07-20T23:59:27.374237944Z");
        Instant date07 = Instant.parse("2022-07-20T23:59:27-03:00");

        System.out.println(date04);
        System.out.println(date05);
        System.out.println(date06);
        System.out.println(date07);


        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date08 = LocalDate.parse("20/07/2022", fmt1);

        LocalDateTime date09 = LocalDateTime.parse("31/02/2001 03:34", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate date10 = LocalDate.of(2022, 7, 20);
        LocalDateTime date11 = LocalDateTime.of(2022, 12, 12, 3, 33);

        System.out.println(date08);
        System.out.println(date09);
        System.out.println(date10);
        System.out.println(date11);

        System.out.println();
        System.out.println("Now converting into text: ");
        System.out.println();
        //date (default) -> ISO8601 basic toString method

        LocalDate date12 = LocalDate.parse("2022-07-20");
        LocalDateTime date13 = LocalDateTime.parse("2012-09-02T23:59:27.374237944");
        Instant date14 = Instant.parse("1999-12-30T23:59:27.374237944Z");

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt5 = DateTimeFormatter.BASIC_ISO_DATE;

        System.out.println("Default date12.toString format: " + date12);
        System.out.println("Custom date12.toString format: " + date12.format(fmt2));
        System.out.println("Custom date12.toString format: " + fmt2.format(date12));
        System.out.println("Custom date12.toString format: " + date12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println("Custom date13.toString format: " + date13.format(fmt2));
        System.out.println("Custom+time date13.toString format: " + date13.format(fmt3));
        System.out.println("Preset date13.toString format: " + date13.format(fmt5));

        System.out.println("Custom Global time zone date14.toString format: " + fmt4.format(date14));



    }
}