import java.util.Arrays;

public class ArrayExamples {

  public static void main(String[] args) {

    String[] weekdays = new String[7]; // null initialized
    System.out.println(Arrays.toString(weekdays));

    weekdays[0] = "Monday";
    System.out.println(Arrays.toString(weekdays));

    weekdays = new String[]{"Monday", "Tuesday", "Wednesday"};
    System.out.println(Arrays.toString(weekdays));

    for(String day : weekdays){
      System.out.println("Week day: "+day);
    }

    for(int i=0;i<weekdays.length;i++){
      System.out.println("Week day: "+weekdays[i].toUpperCase());
    }


  }

}
