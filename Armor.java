public class Armor{
   
   String name;
   String type;
   int weight;
   int armorMod;
   int speedMod;
   int checkMod;
   int proBonus;
   String info;
   
   public Armor(){}
   
   //Set Methods
   public void setName(String x){name = x;}
   public void setType(String x){type = x;}
   public void setWeight(int x){weight = x;}
   public void setArmorMod(int x){armorMod = x;}
   public void setSpeedMod(int x){speedMod = x;}
   public void setCheckMod(int x){checkMod = x;}
   public void setInfo(String x){info = x;}
   
   //Get Methods
   public String getName(){return name;}
   public String getType(){return type;}
   public int getWeight(){return weight;}
   public int getArmorMod(){return armorMod;}
   public int getSpeedMod(){return speedMod;}
   public int getCheckMod(){return checkMod;}
   public String getInfo(){return info;}
}