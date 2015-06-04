import java.lang.*;
import java.util.*;
//Edits for the armor

public class UIEditor{
   private static Scanner in;
   private static int selection;
   public static void main(String[] args){
      in = new Scanner(System.in);
      while(selection != 8){
      System.out.println("Welcome to your editor choose to edit Armor\n"
                         +"Press a number to select what you want to edit!\n"
                         +"1. Armor\n"
                         +"2. Weapon\n"
                         +"3. Adventure Gear\n"
                         +"4. Ritual\n"
                         +"5. At Will Powers\n"
                         +"6. Special Ability\n"
                         +"7. Character\n"
                         +"8. Exit");
      System.out.print("Please select an option > ");
      selection = in.nextInt();
      if(selection == 1){editArmor();}
      else if(selection == 2){editWeapon();}
      else if(selection == 3){editAdventGear();}
      else if(selection == 4){editRitual();}
      else if(selection == 5){editatWill();}
      else if(selection == 6){editSpclAbility();}
      else if(selection == 7){editCharacter();}
      else{System.out.println("Good Luck Have Fun!");
      System.exit(0);
      }
     }
   }
   public static void editArmor(){
      Armor x =  new Armor();
      System.out.println("Name your armor >> ");
      in.nextLine();
      x.setName(in.nextLine().trim());
      System.out.println("Name the type of armor >> ");
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
      System.out.println("Name your Weapon >> ");
      in.nextLine();
      y.setName(in.nextLine().trim());
      System.out.println("Name the type of Weapon >> ");
      y.setType(in.nextLine().trim());
      System.out.println("Name the group of Weapon >> ");
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
      System.out.println("Name of your game >> ");
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
      in.nextLine();
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
      in.nextLine();
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
      }
      try{
         System.out.print("What is the Fortification of your character >> ");
         k.setMiscFORT(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Reflex of your character >> ");
         k.setMiscREF(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Will Power of your character >> ");
         k.setMiscWILL(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Speed of your character >> ");
         k.setMiscSpeed(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Strength of your character >> ");
         k.setStr(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Constitution of your character >> ");
         k.setCon(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Dexterity of your character >> ");
         k.setDex(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Intellegence of your character >> ");
         k.setIntel(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Wisdom of your character >> ");
         k.setWis(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Charisma of your character >> ");
         k.setCha(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What are the Acrobatics of your character >> ");
         k.setAcrobatics(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Arcana of your character >> ");
         k.setArcana(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What are the Athletics of your character >> ");
         k.setAthletics(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Bluff of your character >> ");
         k.setBluff(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Diplomacy of your character >> ");
         k.setDiplomacy(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Dungeoneering of your character >> ");
         k.setDungeoneering(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Endurance of your character >> ");
         k.setEndurance(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Heal of your character >> ");
         k.setHeal(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the History of your character >> ");
         k.setHistory(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Insight of your character >> ");
         k.setInsight(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Intimidate of your character >> ");
         k.setIntimidate(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Nature of your character >> ");
         k.setNature(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Perception of your character >> ");
         k.setPerception(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Religion of your character >> ");
         k.setReligion(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Stealth of your character >> ");
         k.setStealth(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Streetwise of your character >> ");
         k.setStreetwise(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
      try{
         System.out.print("What is the Theivery of your character >> ");
         k.setThievery(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
       try{
         System.out.print("What is the HP of your character >> ");
         k.setHP(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
       try{
         System.out.print("What is the Surge Value of your character >> ");
         k.setSurgeValue(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
       try{
         System.out.print("What is the Number of Surges per day of your character >> ");
         k.setNumSurge(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
       try{
         System.out.print("What is the AP of your character >> ");
         k.setAP(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }
       try{
         System.out.print("What is the initiative of your character >> ");
         k.setInitiative(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
         }
      System.out.print("Describe your personality of your character >> ");
         k.setPersonality(in.nextLine().trim());
      System.out.print("Describe the appearance of your character >> ");
         k.setAppearance(in.nextLine().trim()); 
      System.out.print("Describe the background >> ");
         k.setBackground(in.nextLine().trim());     
      
   }
   public static void editSpclAbility(){
      SpclAbility p = new SpclAbility();
      System.out.println("What is the name of your Special Ability >> ");
         in.nextLine();
         p.setName(in.nextLine().trim());
      System.out.print("Describe your Special Ability >> ");
         p.setInfo(in.nextLine().trim());
   }
   public static void editatWill(){
      atWill j = new atWill();
      System.out.println("What is your at Will Power name >> ");
      in.nextLine();
         j.setName(in.nextLine().trim());
      System.out.println("What is your at Will Power type >> ");
         j.setType(in.nextLine().trim());
      System.out.println("What is your at Will Power action type >> ");
         j.setActionType(in.nextLine().trim());
      System.out.println("What is your at Will Power target >> ");
         j.setTarget(in.nextLine().trim());   
      System.out.println("Describe your At Will Power >> ");
         j.setInfo(in.nextLine().trim());
      try{
         System.out.print("What is the Range of your Will Power >> ");
         j.setRange(Integer.parseInt(in.nextLine().trim()));
      }catch(Exception e){
         System.out.println("That's not a number you idiot!");
      }  
   }
   
}