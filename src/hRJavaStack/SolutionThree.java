package hRJavaStack;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Scanner;

public class SolutionThree {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    HashMap<Character, Character> map = new HashMap<>();
    map.put('(', ')');
    map.put('[', ']');
    map.put('{', '}');
    
    while (scanner.hasNext()) {
      String input = scanner.next();
      System.out.println(bam(input, map)? "true" : "false");
    }
    scanner.close();
  }

  public static boolean bam(String a, HashMap<Character, Character> map) {
    if(a.length() % 2 != 0) {
      return false;
    }
      ArrayDeque<Character> ad = new ArrayDeque<Character>();
      for(int i = 0; i < a.length(); i++) {
        Character c = a.charAt(i);
        if(map.containsKey(c)) {
          ad.push(c);
          
      } else if(ad.isEmpty() || c != map.get(ad.pop())) {
          return false;
      }
    }
      return true;
  }
}
