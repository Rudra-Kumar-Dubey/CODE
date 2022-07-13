import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
public class random
{
  public static void main (String[]args)
  {
    Year y = Year.now ();
      System.out.println (y);
    Year y1 = Year.of (2000);
    LocalDate d = y1.atDay (156);
      System.out.println (d);
      System.out.println (y1.isLeap ());
      System.out.println (y1.length ());
  }
}