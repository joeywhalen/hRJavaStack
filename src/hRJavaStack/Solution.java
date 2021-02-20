package hRJavaStack;

import java.util.Scanner;
import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    while (scanner.hasNext()) {
      String input = scanner.next();
      System.out.println(balanced(input));
    }

  }

  public static boolean balanced(String text) {
    Stack<Character> stack = new Stack<Character>();
    for(int i = 0; i < text.length(); i++) {
      char charToCheck = text.charAt(i);
      if(charToCheck == '[' || charToCheck == '(' || charToCheck == '{') {
        stack.push(charToCheck);
      } else if(charToCheck == ']') {
          if(stack.isEmpty() || stack.pop() != '[') {
            return false;
          }
      } else if(charToCheck == ')') {
          if(stack.isEmpty() || stack.pop() != '(') {
            return false;
          }
      } else if(charToCheck == '}') {
          if(stack.isEmpty() || stack.pop() != '{') {
            return false;
          }
      }
    }
    return stack.isEmpty();
  }

}
