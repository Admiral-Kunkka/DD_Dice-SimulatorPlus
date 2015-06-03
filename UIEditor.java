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
   public static void editRitual(){
      Ritual v = new Ritual();
      System.out.println("Name of the ritual >> ");
         v.setName(in.nextLine().trim());
      System.out.println("Name of the catagory >> ");
         v.setCatagory(in.nextLine().trim());
      System.out.println("Name of the Key Skill >> ");
         v.setKeySkill(in.nextLine().trim());
      try{
         System.out.print("Level of the ritual >> ");
         v.setLevel(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      } 
      try{
         System.out.print("Durration of the ritual >> ");
         v.setDurration(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      } 
      try{
         System.out.print("Cost of the Ritual >> ");
         v.setCompCost(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      } 
      try{
         System.out.print("Market Cost of the Ritual >> ");
         v.setMrktCost(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      } 
      System.out.print("Describe what your using or anything extra you want >> ");
         v.setInfo(in.nextLine().trim());
   }
   public static void editCharacter(){
      Character k = new Character();
      System.out.println("Name of your character >> ");
         k.setName(in.nextLine().trim());
      System.out.println("Your name >> ");
         k.setOwner(in.nextLine().trim());
      System.out.println("Name of your class type >> ");
         k.setClassType(in.nextLine().trim());
      System.out.println("What is your Paragon Path >> ");
         k.setParagonPath(in.nextLine().trim());
      System.out.println("What is your Epic Destiny >> ");
         k.setEpicDestiny(in.nextLine().trim());
      System.out.println("What is your total XP >> ");
         k.setTotalXP(in.nextLine().trim());
      System.out.println("What is the Race of your character >> ");
         k.setRace(in.nextLine().trim());
      try{
         System.out.print("What is the Age of your character >> ");
         k.setAge(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      } 
      System.out.println("What is the gender of your character(M/F) >> ");
         k.setGender(in.nextLine().trim());
      System.out.println("What is the height of your charcter >> ");
         k.setHeight(in.nextLine().trim());
      try{
         System.out.print("What is the weight of your character >> ");
         k.setWeight(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      System.out.println("What is the Alignment of your charcter >> ");
         k.setAlignment(in.nextLine().trim());
      System.out.println("What is the Deity of your charcter >> ");
         k.setDeity(in.nextLine().trim());
      try{
         System.out.print("What is the level of your character >> ");
         k.setLevel(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Ability Mod of your character >> ");
         k.setAbilityMod(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Race Speed of your character >> ");
         k.setRaceSpeed(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Race defense of your character >> ");
         k.setRaceDef(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Race Attack of your character >> ");
         k.setRaceAtk(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Base Attack of your character >> ");
         k.setMiscBA(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Armor Class of your character >> ");
         k.setMiscAC(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }try{
         System.out.print("What is the Fortification of your character >> ");
         k.setMiscFORT(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
   }
   
}