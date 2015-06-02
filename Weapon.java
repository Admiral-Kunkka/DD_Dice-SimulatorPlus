public class Weapon{
   
   String name;
   String type;
   String group;
   int probonus;
   int dmg;
   int range;
   int weight;
   String info;
   
   public Weapon(){}
   
   //Set Methods
   public void setName(String x){name = x;}
   public void setType(String x){type = x;}
   public void setGroup(String x){group = x;}
   public void setProbonus(int x){probonus = x;}
   public void setDmg(int x){dmg = x;}
   public void setRange(int x){range = x;}
   public void setWeight(int x){weight = x;}
   public void setInfo(String x){info = x;}
   
   //Get Methods
   public String getName(){return name;}
   public String getType(){return type;}
   public String getGroup(){return group;}
   public int getProbonus(){return probonus;}
   public int getDmg(){return dmg;}
   public int getRange(){return range;}
   public int getWeight(){return weight;}
   public String getInfo(){return info;}
}