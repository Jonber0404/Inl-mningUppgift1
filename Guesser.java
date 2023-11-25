import java.io.Console;
import java.util.*;

public class Guesser {
  private int low;
  private int high;

  public Guesser(int low, int high) {
    this.low = low;
    this.high = high;
  }

  public void start() {
    rules();
    doGuesses();
  }

  private void rules() {
    System.out.println("Think of a number between " +
        low + " and " + high);
    System.out.println("I'm going to ask a few questions in order " +
        "to guess the number.");
    System.out.println("Please answer T for true, and F for false.\n");
  }

  private String getReply() {
    String reply = null;

    while (true) {

      reply = new Scanner(System.in).nextLine();
      if (reply.equalsIgnoreCase("F") || reply.equalsIgnoreCase("T")) {
        break;
      } else {
        System.out.println("Please, answer T (for true) or F (for false)");
      }

    }

    return reply;

  }

  private void doGuesses() {
    int i = 0;
    int middle = 0;
    while (low < high) {

      middle = low + (high - low) / 2;

      System.out.println("Is the number less than or equal to " +
          middle + "?");
      String reply = getReply();
      if ("T".equals(reply)) {

        high = middle;
      } else {

        low = middle + 1;
      }
      i++;
    }

    answer(low, i);
  }

  private void answer(int guess, int numberOfGuesses) {
    System.out.println("You were thinking about " +
        guess +
        " (took me " + numberOfGuesses +
        " guesses)");
  }

}
