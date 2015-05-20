//Jacob Contreras
import java.util.*;

public class DiceRoller{
  public static void main(String[] args){

  }
  public int DiceRollerD20(){
    Random diceRoller = new Random();
    for(int i = 1;i<21;i++){
      int roll = diceRoller.nextInt(20)+1;
      System.out.println(roll);
    }
  }
  public int DiceRollerD12(){
    Random diceRoller = new Random();
    for(int i = 1;i<13;i++){
      int roll2 = diceRoller.nextInt(12)+1;
      System.out.println(roll2);
    }
  }
  public int DiceRollerD10(){
    Random diceRoller = new Random();
    for(int i = 1;i<11;i++){
      int roll3 = diceRoller.nextInt(10)+1;
      System.out.println(roll3);
    }
  }
  public int DiceRollerD8(){
    Random diceRoller = new Random();
    for(int i = 1;i<9;i++){
      int roll4 = diceRoller.nextInt(8)+1;
      System.out.println(roll4);
    }
  }
  public int DiceRollerD6(){
    Random diceRoller = new Random();
    for(int i = 1;i<7;i++){
      int roll5 = diceRoller.nextInt(6)+1;
      System.out.println(roll5);
    }
  }
  public int DiceRollerD4(){
    Random diceRoller = new Random();
    for(int i = 1;i<5;i++){
      int roll6 = diceRoller.nextInt(4)+1;
      System.out.println(roll6);
    }
  }
}
