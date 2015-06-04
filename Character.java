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
   int raceSpeed; 
   int raceDef;
   int raceAtk;
   int miscBA; 
   int miscAC; 
   int miscFORT; 
   int miscREF; 
   int miscWILL; 
   int miscSpeed; 
   int str;
   int con;
   int dex; 
   int intel; 
   int wis; 
   int cha;
   int hp;
   int surgeValue; 
   int numSurge; 
   int ap; 
   int initiative; 
   String personality; 
   String appearance; 
   String background; 
   //skills
   int acrobatics; 
   int arcana; 
   int athletics;
   int bluff; 
   int diplomacy; 
   int dungeoneering; 
   int endurance; 
   int heal; 
   int history; 
   int insight; 
   int intimidate; 
   int nature; 
   int perception; 
   int religion; 
   int stealth; 
   int streetwise; 
   int thievery; 
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
   public void setRaceSpeed(int x){raceSpeed = x;}
   public void setRaceDef(int x){raceDef = x;}
   public void setRaceAtk(int x){raceAtk = x;}
   public void setMiscBA(int x){miscBA = x;}
   public void setMiscAC(int x){miscAC = x;}
   public void setMiscFORT(int x){miscFORT = x;}
   public void setMiscREF(int x){miscREF = x;}
   public void setMiscWILL(int x){miscWILL = x;}
   public void setMiscSpeed(int x){miscSpeed = x;}
   public void setStr(int x){str = x;}
   public void setCon(int x){con = x;}
   public void setDex(int x){dex = x;}
   public void setIntel(int x){intel = x;}
   public void setWis(int x){wis = x;}
   public void setCha(int x){cha = x;}
   public void setAcrobatics(int x){acrobatics = x + level/2;}
   public void setArcana(int x){arcana = x + level/2;}
   public void setAthletics(int x){athletics = x + level/2;}
   public void setBluff(int x){bluff = x + level/2;}
   public void setDiplomacy(int x){diplomacy = x + level/2;}
   public void setDungeoneering(int x){dungeoneering = x + level/2;}
   public void setEndurance(int x){endurance = x + level/2;}
   public void setHeal(int x){heal = x + level/2;}
   public void setHistory(int x){history = x + level/2;}
   public void setInsight(int x){insight = x + level/2;}
   public void setIntimidate(int x){intimidate = x + level/2;}
   public void setNature(int x){nature = x + level/2;}
   public void setPerception(int x){perception = x + level/2;}
   public void setReligion(int x){religion = x + level/2;}
   public void setStealth(int x){stealth = x + level/2;}
   public void setStreetwise(int x){streetwise = x + level/2;}
   public void setThievery(int x){thievery = x + level/2;}
   public void setHP(int x){hp = x + con;}
   public void setSurgeValue(int x){surgeValue = hp/4;}
   public void setNumSurge(int x){numSurge = x;}
   public void setAP(int x){ap = x;}
   public void setInitiative(int x){initiative = x + level/2 + dex;}
   public void setPersonality(String x){personality = x;}
   public void setAppearance(String x){appearance = x;}
   public void setBackground(String x){background = x;}
   
   
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
   public int getRaceSpeed(){return raceSpeed;}
   public int getRaceDef(){return raceDef;}
   public int getRaceAtk(){return raceAtk;}
   public int getMiscBA(){return miscBA;}
   public int getMiscAC(){return miscAC;}
   public int getMiscFORT(){return miscFORT;}
   public int getMiscREF(){return miscREF;}
   public int getMiscWILL(){return miscWILL;}
   public int getMiscSpeed(){return miscSpeed;}
   public int getStr(){return str;}
   public int getCon(){return con;}
   public int getDex(){return dex;}
   public int getIntel(){return intel;}
   public int getWis(){return wis;}
   public int getCha(){return cha;}
   public int getAcrobatics(){return acrobatics;}
   public int getArcana(){return arcana;}
   public int getAthletics(){return athletics;}
   public int getBluff(){return bluff;}
   public int getDiplomacy(){return diplomacy;}
   public int getDungeoneering(){return dungeoneering;}
   public int getEndurance(){return endurance;}
   public int getHeal(){return heal;}
   public int getHistory(){return history;}
   public int getInsight(){return insight;}
   public int getIntimidate(){return intimidate;}
   public int getNature(){return nature;}
   public int getPerception(){return perception;}
   public int getReligion(){return religion;}
   public int getStealth(){return stealth;}
   public int getStreetwise(){return streetwise;}
   public int getThievery(){return thievery;}
   public int getHP(){return hp;}
   public int getSurgeValue(){return surgeValue;}
   public int getNumSurge(){return numSurge;}
   public int getAP(){return ap;}
   public int getInitiative(){return initiative;}
   public String getPersonality(){return personality;} 
   public String getAppearance(){return appearance;}
   public String getBackground(){return background;}
   

   public int baseAttack()
   {
      return level/2 + abilityMod + raceAtk + miscBA;
   }
   
   public int defenceAC()
   {
      return 10 + level/2 + raceDef + miscAC;
   }
   
   public int defenceFORT()
   {
      if(str > con)
      {
         return 10 + level/2 + raceDef + str + miscFORT;
      }
      else
      {
         return 10 + level/2 + raceDef + con + miscFORT;
      }
   }

   public int defenceREF()
   {
      if(dex > intel)
      {
         return 10 + level/2 + raceDef + dex + miscREF;
      }
      else
      {
         return 10 + level/2 + raceDef + intel + miscREF;
      }
   }

   public int defenceWILL()
   {
      if(wis > cha)
      {
         return 10 + level/2 + raceDef + wis + miscWILL;
      }
      else
      {
         return 10 + level/2 + raceDef + cha + miscWILL;
      }
   }
   
   public int speed()
   {
      return raceSpeed + miscSpeed;
   }
}