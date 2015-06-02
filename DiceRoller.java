//Jacob Contreras
import java.util.*;

public class DiceRoller{
   public int roll;
   public int roll2;
   public int roll3;
   public int roll4;
   public int roll5;
   public int roll6;
  public static void main(String[] args){
  }
  public int DiceRollerD20(){
    Random diceRoller = new Random();
      roll = diceRoller.nextInt(20)+1;
      return roll;
  }
  public int DiceRollerD12(){
    Random diceRoller = new Random();
      roll2 = diceRoller.nextInt(12)+1;
      return roll2;
  }
  public int DiceRollerD10(){
    Random diceRoller = new Random();
      roll3 = diceRoller.nextInt(10)+1;
      return roll3;
  }
  public int DiceRollerD8(){
    Random diceRoller = new Random();
      roll4 = diceRoller.nextInt(8)+1;
      return roll4;
  }
  public int DiceRollerD6(){
    Random diceRoller = new Random();
      roll5 = diceRoller.nextInt(6)+1;
      return roll5;
  }
  public int DiceRollerD4(){
    Random diceRoller = new Random();
      roll6 = diceRoller.nextInt(4)+1;
      return roll6;
  }
}
