import java.util.Scanner;

public class LessonOne {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Привет! Какое у тебя имя?");

        String firstName = reader.nextLine();

        System.out.println("Привет " + firstName);

        System.out.println("Какая у тебя фамилия?");

        String secondName = reader.nextLine();

        System.out.println("Твое имя " + firstName + " " + secondName);
    }
}
