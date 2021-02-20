package hRJavaStack;

import java.util.Scanner;

public class SolutionTwo {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String input = scanner.next();
    while(input.length() != (input = input.replaceAll("\\(\\)|\\[\\]|\\{\\}", "")).length());
      System.out.println(input.isEmpty());

  }

}
