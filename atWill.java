public class atWill{
   
   String name;
   String type;
   String actionType;
   String target;
   String info;
   int range;
   
   public atWill(){}
   
   //Set Methods
   public void setName(String x){name = x;}
   public void setType(String x){type = x;}
   public void setActionType(String x){actionType = x;}
   public void setTarget(String x){target = x;}
   public void setInfo(String x){info = x;}
   public void setRange(int x){range = x;}
   
   //Get Methods
   public String getName(){return name;}
   public String getType(){return type;}
   public String getActionType(){return actionType;}
   public String getTarget(){return target;}
   public String getInfo(){return info;}
   public int getRange(){return range;}
}