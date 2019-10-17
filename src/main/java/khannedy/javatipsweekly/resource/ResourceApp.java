package khannedy.javatipsweekly.resource;

import java.io.InputStream;
import java.util.Scanner;

public class ResourceApp {

  public static void main(String[] args) throws Exception {
    InputStream inputStream = ResourceApp.class.getResourceAsStream("/files/artikel.txt");

    printFile(inputStream);
  }

  private static void printFile(InputStream inputStream) {
    Scanner scanner = new Scanner(inputStream);
    while (scanner.hasNext()) {
      System.out.println(scanner.nextLine());
    }
  }
}
