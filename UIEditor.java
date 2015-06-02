import java.lang.*;
import java.util.*;
//Edits for the armor

public class UIEditor{
   private static Scanner in;
   public static void main(String[] args){
      in = new Scanner(System.in);
      System.out.println("Welcome to your editor choose to edit Armor");
      editArmor();
      editWeapon();
      editAdventGear();
   }
   public static void editArmor(){
      Armor x =  new Armor();
      System.out.print("Name your armor >> ");
      x.setName(in.nextLine().trim());
      System.out.print("Name the type of armor >> ");
      x.setType(in.nextLine().trim());
      try{
      System.out.print("Weight of your armor >> ");
      x.setWeight(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }try{
      System.out.print("Defense you want on armor >> ");
      x.setArmorMod(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
      System.out.print("Attack Speed Armor Grants >> ");
      x.setSpeedMod(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
      System.out.print("Check Bonuses Granted >> ");
      x.setCheckMod(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      System.out.print("Describe what your wearing or anything extra you want >> ");
      x.setInfo(in.nextLine().trim());   
      }
      public static void editWeapon(){
      Weapon y = new Weapon();
      System.out.print("Name your Weapon >> ");
      y.setName(in.nextLine().trim());
      System.out.print("Name the type of Weapon >> ");
      y.setType(in.nextLine().trim());
      System.out.print("Name the group of Weapon >> ");
      y.setGroup(in.nextLine().trim());
      try{
         System.out.print("Pro bonus of Weapon >> ");
         y.setProbonus(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("Damage Weapon deals >> ");
         y.setDmg(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("Range the weapon has >> ");
            y.setRange(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("Weight of your weapon >> ");
         y.setWeight(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
         System.out.print("Describe what your using or anything extra you want >> ");
         y.setInfo(in.nextLine().trim());   
      }
      public static void editAdventGear(){
      adventGear z = new adventGear();
      System.out.print("Name of your game >> ");
      z.setName(in.nextLine().trim());
           try{
         System.out.print("Prce of gear >> ");
         z.setPrice(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("Weight of your gear >> ");
         z.setWeight(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      } 
   }
   
}