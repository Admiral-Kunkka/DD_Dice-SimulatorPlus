import java.util.*;

public class Character{
 //Basic Stats
   String name;
   String owner;
   String classType;
   String paragonPath;
   String epicDestiny;
   String totalXP;
   String race;
   String size;
   int age;
   String gender;
   String height;
   String weight;
   String alignment;
   String deity;
 //Inventory Lists
   ArrayList<atWill> atWillList = new ArrayList<atWill>();
   ArrayList<SpclAbility> SpclAbilityList = new ArrayList<SpclAbility>;
   ArrayList<adventGear> adventGearList = new ArrayList<adventGear>;
   ArrayList<Weapon> weaponList = new ArrayList<Weapon>;
   ArrayList<Armor> armorList = new ArrayList<Armor>;
   //Arryalist<MagicItem> MagicItemsList = new ArrayList<MagicItem>;
   //              ^-- Ethan gets to create that class :3
   
   
   public Character(){}
}