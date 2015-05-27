public class Ritual{
   
   String name;
   String catagory;
   String keySkill;
   int level;
   int durration;
   int compCost;
   int mrktCost;
   String info;
   
   public Ritual(){}
   
   //Set Methods
   public void setName(String x){name = x;}
   public void setCatagory(String x){catagory = x;}
   public void setKeySkill(String x){keySkill = x;}
   public void setLevel(int x){level = x;}
   public void setDurration(int x){durration = x;}
   public void setCompCost(int x){compCost = x;}
   public void setMrktCost(int x){mrktCost = x;}
   public void setInfo(String x){info = x;}
   
   //Get Methods
   public String getName(){return name;}
   public String getCatagory(){return catagory;}
   public String getKeySkill(){return keySkill;}
   public int getLevel(){return level;}
   public int getDurration(){return durration;}
   public int getCompCost(){return compCost;}
   public int getMrktCost(){return mrktCost;}
   public String getInfo(){return info;}
}