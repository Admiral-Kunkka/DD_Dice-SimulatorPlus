import java.util.*;

public class Character{
 //Basic Stats
   String name;
   int level; 
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
   int weight;
   String alignment;
   String deity;
   int abilityMod;
 //Inventory Lists
   ArrayList<atWill> atWillList = new ArrayList<atWill>();
   ArrayList<SpclAbility> spclAbilityList = new ArrayList<SpclAbility>();
   ArrayList<adventGear> adventGearList = new ArrayList<adventGear>();
   ArrayList<Weapon> weaponList = new ArrayList<Weapon>();
   ArrayList<Armor> armorList = new ArrayList<Armor>();
   
   public Character(){}
   
 //Set Methods
   public void setName(String x){name = x;}
   public void setOwner(String x){owner = x;}
   public void setClassType(String x){classType = x;}
   public void setParagonPath(String x){paragonPath = x;}
   public void setEpicDestiny(String x){epicDestiny = x;}
   public void setTotalXP(String x){totalXP = x;}
   public void setRace(String x){race = x;}
   public void setSize(String x){size = x;}
   public void setAge(int x){age = x;}
   public void setGender(String x){gender = x;}
   public void setHeight(String x){height = x;}
   public void setWeight(int x){weight = x;}
   public void setAlignment(String x){alignment = x;}
   public void setDeity(String x){deity = x;}
   public void setLevel(int x){level = x;}
   public void setAbilityMod(int x){abilityMod = x;}
 //Get Methods
   public String getName(){return name;}
   public String getOwner(){return owner;}
   public String getClassType(){return classType;}
   public String getParagonPath(){return paragonPath;}
   public String getEpicDestiny(){return epicDestiny;}
   public String getTotalXP(){return totalXP;}
   public String getRace(){return race;}
   public String getSize(){return size;}
   public int getAge(){return age;}
   public String getGender(){return gender;}
   public String getHeight(){return height;}
   public int getWeight(){return weight;}
   public String getAlignment(){return alignment;}
   public String getDeity(){return deity;}
   public int getLevel(){return level;}
   public int getAbilityMod(){return abilityMod;}

   public int baseAttack()
   {
      return level/2 + abilityMod /* + raceBonus + enhancement + itemBonus + powerBonus + powerBonus + misc*/;
   }
   
   public int defence()
   {
      return 10 + level/2 /* + armorBonus + sheildBonus + fortitude + will + raceBonus + enhancement + itemBonus + powerBonus + misc */;
   }
   
   public int speed()
   {
      return -1; /* raceSpeed + misc - Armor.getArmorMod */
   }
}