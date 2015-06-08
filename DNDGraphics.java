//Chance Cook
import java.applet.*;
import java.awt.*;
import java.awt.Font;
import java.util.Random;
import java.awt.event.*;
import javax.imageio.*;
import java.io.*;


public class DNDGraphics extends Applet implements MouseListener, MouseMotionListener{


   int[] yPointsTriangle = {250,550,550};
   int[] xPointsTriangle = {1350,1150,1550};
   
   Character character = new Character();
   
   int mouseX;
   int mouseY;
   
   public Image img = null;
   public Image imag = null;
      
   public boolean ifD4 = false;
   public boolean ifD6 = false;
   public boolean ifD8 = false;
   public boolean ifD10 = false;
   public boolean ifD12 = false;
   public boolean ifD20 = false;
   public boolean ifRollButtonPressed;
   public boolean mouseDown;
   public boolean ifReset = false;
   public boolean ifFlipped = true;
   public boolean ifEdit = false;
   public boolean butts = false;
   public boolean ShowTypeScreen = false;
   
   public String name = "" + character.getName();
   public String level = " " + character.getLevel(); 
   public String owner = " " + character.getOwner();
   public String classType = " " + character.getClassType();
   public String paragonPath = " " + character.getParagonPath();
   public String epicDestiny = " " + character.getEpicDestiny();
   public String totalXP = " " + character.getTotalXP();
   public String race = " " + character.getRace();
   public String size = " " + character.getSize();
   public String age = " " + character.getAge();
   public String gender = " " + character.getGender();
   public String height = " " + character.getHeight();
   public String weight = " " + character.getWeight();
   public String alignment = " " + character.getAlignment();
   public String deity = " " + character.getDeity();
   public String abilityMod = " " + character.getAbilityMod();
   public String raceSpeed = " " + character.getRaceSpeed(); 
   public String raceDef = " " + character.getRaceDef();
   public String raceAtk = " " + character.getRaceAtk();
   public String miscBA = " " + character.getMiscBA(); 
   public String miscAC = " " + character.getMiscAC(); 
   public String miscFORT = " " + character.getMiscFORT(); 
   public String miscREF = " " + character.getMiscREF(); 
   public String miscWILL = " " + character.getMiscWILL(); 
   public String miscSpeed = " " + character.getMiscSpeed(); 
   public String str = " " + character.getStr();
   public String con = " " + character.getCon();
   public String dex = " " + character.getDex(); 
   public String intel = " " + character.getIntel(); 
   public String wis = " " + character.getWis(); 
   public String cha = " " + character.getCha();
   public String hp = " " + character.getHP();
   public String surgeValue = " " + character.getSurgeValue(); 
   public String numSurge = " " + character.getNumSurge(); 
   public String ap = " " + character.getAP(); 
   public String initiative = " " + character.getInitiative(); 
   public String personality = " " + character.getPersonality(); 
   public String appearance = " " + character.getAppearance(); 
   public String background = " " + character.getBackground(); 
   //skills
   public String acrobatics = " " + character.getAcrobatics(); 
   public String arcana = " " + character.getArcana(); 
   public String athletics = " " + character.getAthletics();
   public String bluff = " " + character.getBluff(); 
   public String diplomacy = " " + character.getDiplomacy(); 
   public String dungeoneering = " " + character.getDungeoneering(); 
   public String endurance = " " + character.getEndurance(); 
   public String heal = " " + character.getHeal(); 
   public String history = " " + character.getHistory(); 
   public String insight = " " + character.getInsight(); 
   public String intimidate = " " + character.getIntimidate(); 
   public String nature = " " + character.getNature(); 
   public String perception = " " + character.getPerception(); 
   public String religion = " " + character.getReligion(); 
   public String stealth = " " + character.getStealth(); 
   public String streetwise = " " + character.getStreetwise(); 
   public String thievery = " " + character.getThievery();
   
   DiceRoller something = new DiceRoller();
   UIEditor UI = new UIEditor();
   
   public Font myFont = new Font("Comic Sans MS", Font.BOLD, 48);
   public Font normal = new Font("serif", Font.BOLD, 20);
   public Font attention = new Font("Times New Roman",Font.BOLD,80);

   public int die;
   public String theDie = "";
   
   public void init(){
      setSize(1915, 1280);
      setBackground(new Color(102, 51, 0));
      addMouseListener(this);
      addMouseMotionListener(this);   
      try {
           img = ImageIO.read(new File("DND Front Sheet1.png"));
           imag = ImageIO.read(new File("DND Back Sheet1.png"));
       } catch (IOException e) {
       }   
      addMouseMotionListener(this);      
   }
   
   public void mouseClicked(MouseEvent e){
   }
   public void mouseEntered(MouseEvent e){
   }
   public void mouseExited(MouseEvent e){
   }
   public void mousePressed(MouseEvent e){
      mouseDown = true;
      repaint();
      e.consume();
   }
   public void mouseReleased(MouseEvent e){
      mouseDown = false;
      repaint();
      e.consume();
   }
   public void mouseMoved(MouseEvent e){
      mouseX = e.getX();
      mouseY = e.getY();
   }
   public void mouseDragged(MouseEvent e){
   }
   
   public void paint(Graphics g){
   g.setFont(normal);
      if(ifFlipped){
         /*g.setColor(Color.white);
         g.fillRect(15, 15, 750, 895);
         */
         g.drawImage(img,15,15,null);
         g.setColor(Color.red);
         
         g.drawString(name,20,30);
         g.drawString(level,270,34);
         g.drawString(classType,300,30);
         g.drawString(paragonPath,415,30);
         g.drawString(epicDestiny,525,30);
         g.drawString(totalXP,650,34);
         g.drawString(race,20,58);
         g.drawString(size,160,58);
         g.drawString(age,205,58);
         g.drawString(gender,235,58);
         g.drawString(height,272,58);
         g.drawString(weight,325,58);
         g.drawString(alignment,375,58);
         g.drawString(deity,450,58);
         
         g.drawString(str,30,178);
         g.drawString(con,30,202);
         g.drawString(dex,30,234);
         g.drawString(intel,30,257);
            /*
            name
            level
            class
            paragon path
            epic destiny
            totalXP
            race
            size
            age
            gender
            height
            weight
            alignment
            deity
            
            intiative
            str
            con
            dex
            int
            wis
            cha
            
            
            AC
            FORT
            REF
            WILL
            speed
            
            maxHP
            bloodied
            surgeValue
            Action Points
            Race Features
            languages known
            
            acrobatics
            arcana
            athletics
            bluff
            diplomacy
            dungeoneering
            endurance
            heal
            history
            insight
            nature
            perception
            religion
            stealth
            streetwise
            thievery
            */
         
      }
      else{
         /*g.setColor(Color.black);
         g.fillRect(15,15,750,895);*/
         g.drawImage(imag,15,15,null);
         g.setColor(Color.red);
         
         /*
            at-will powers
            
            personality traits
            mannerisms and apperances
            character background
            
            other equipment
            */

      }  
      
      g.setColor(Color.gray);
      g.fillRect(1690,25,100,50);
      g.fillRect(1540,25,100,50);
      g.fillRect(1390,25,100,50);
      g.fillRect(1240,25,100,50);
      g.fillRect(1090,25,100,50);
      g.fillRect(940,25,100,50);
      g.fillRect(1250,700,200,100);
      g.fillRect(1550,700,200,100);
      g.fillRect(730,75,50,50);
      g.fillRect(730,850,50,50);
      
      if(ShowTypeScreen){
         UI.Editor();
           name = "" + character.getName();
           level = " " + character.getLevel(); 
           owner = " " + character.getOwner();
           classType = " " + character.getClassType();
           paragonPath = " " + character.getParagonPath();
           epicDestiny = " " + character.getEpicDestiny();
           totalXP = " " + character.getTotalXP();
           race = " " + character.getRace();
           size = " " + character.getSize();
           age = " " + character.getAge();
           gender = " " + character.getGender();
           height = " " + character.getHeight();
           weight = " " + character.getWeight();
           alignment = " " + character.getAlignment();
           deity = " " + character.getDeity();
           abilityMod = " " + character.getAbilityMod();
           raceSpeed = " " + character.getRaceSpeed(); 
           raceDef = " " + character.getRaceDef();
           raceAtk = " " + character.getRaceAtk();
           miscBA = " " + character.getMiscBA(); 
           miscAC = " " + character.getMiscAC(); 
           miscFORT = " " + character.getMiscFORT(); 
           miscREF = " " + character.getMiscREF(); 
           miscWILL = " " + character.getMiscWILL(); 
           miscSpeed = " " + character.getMiscSpeed(); 
           str = " " + character.getStr();
           con = " " + character.getCon();
           dex = " " + character.getDex(); 
           intel = " " + character.getIntel(); 
           wis = " " + character.getWis(); 
           cha = " " + character.getCha();
           hp = " " + character.getHP();
           surgeValue = " " + character.getSurgeValue(); 
           numSurge = " " + character.getNumSurge(); 
           ap = " " + character.getAP(); 
           initiative = " " + character.getInitiative(); 
           personality = " " + character.getPersonality(); 
           appearance = " " + character.getAppearance(); 
           background = " " + character.getBackground(); 
         //skills
           acrobatics = " " + character.getAcrobatics(); 
           arcana = " " + character.getArcana(); 
           athletics = " " + character.getAthletics();
           bluff = " " + character.getBluff(); 
           diplomacy = " " + character.getDiplomacy(); 
           dungeoneering = " " + character.getDungeoneering(); 
           endurance = " " + character.getEndurance(); 
           heal = " " + character.getHeal(); 
           history = " " + character.getHistory(); 
           insight = " " + character.getInsight(); 
           intimidate = " " + character.getIntimidate(); 
           nature = " " + character.getNature(); 
           perception = " " + character.getPerception(); 
           religion = " " + character.getReligion(); 
           stealth = " " + character.getStealth(); 
           streetwise = " " + character.getStreetwise(); 
           thievery = " " + character.getThievery();
      }
      
      if(mouseDown && mouseX>=1250 && mouseX<=1450 && mouseY>=700 && mouseY<=800)
         ifRollButtonPressed = true;

      if(mouseDown && mouseX>=1690 && mouseX<=1790 && mouseY>=25 && mouseY<=75)
        ifD20  = true;

      if(mouseDown && mouseX>=1540 && mouseX<=1640 && mouseY>=25 && mouseY<=75)
        ifD12  = true;

      if(mouseDown && mouseX>=1390 && mouseX<= 1490 && mouseY>=25 && mouseY<=75)
        ifD10  = true;

      if(mouseDown && mouseX>=1240 && mouseX<=1340 && mouseY>=25 && mouseY<=75)
         ifD8 = true;

      if(mouseDown && mouseX>=1090 && mouseX<=1190 && mouseY>=25 && mouseY<=75)
         ifD6 = true;
         
      if(mouseDown && mouseX>=940 && mouseX<=1040 && mouseY>=25 && mouseY<=75)
         ifD4 = true; 
         
      if(mouseDown && mouseX>=1550 && mouseX<=1750 && mouseY>=700 && mouseY<=800)
         ifReset = true;
      else
         ifReset = false;  
      
      if(mouseDown && mouseX>730 && mouseX<=780 && mouseY>=75 && mouseY<=125){
         if(ifFlipped){
            ifFlipped = false; 
            g.setColor(Color.darkGray);
            g.fillRect(730,75,50,50);
         }    
         else{
            ifFlipped = true;
            g.setColor(Color.darkGray);
            g.fillRect(730,75,50,50); 
         }     
      }      
      if(mouseDown && mouseX>775 && mouseX<=825 && mouseY>=75 && mouseY<=125){
         if(ifFlipped)
            ifFlipped = false;  
         else
            ifFlipped = true;   
      }      
      if(mouseDown && mouseX>=730 && mouseX<=780 && mouseY>=850 && mouseY<=900)
         ifEdit = true;
      if(mouseDown && mouseX>=0 && mouseX<=50 && mouseY>=0 && mouseY<=50)
         ifEdit = false;        
             
      if(ifReset){
         g.setColor(Color.darkGray);
         g.fillRect(1550,700,200,100);
         ifD4 = false;
         ifD6 = false;
         ifD8 = false;
         ifD10 = false;
         ifD12 = false;
         ifD20 = false;
         ifRollButtonPressed = false;
      }            
      if(ifEdit){
         g.setColor(Color.darkGray);
         g.fillRect(730,850,50,50);
      }                 
      if(ifRollButtonPressed){
         g.setColor(Color.darkGray);
         g.fillRect(1250,700,200,100);
         if(ifD4){
            die = something.DiceRollerD4();
            theDie = "" + die;
            g.setColor(Color.white);
            g.fillPolygon(xPointsTriangle, yPointsTriangle, 3);
            g.setColor(Color.blue);
            g.setFont(myFont);
            g.drawString(theDie,1340,450);
            g.setFont(normal);
         }   
         if(ifD6){
            die = something.DiceRollerD6();
            theDie = "" + die;
            g.setColor(Color.white);
            g.fillRect(1200,250,300,300);
            g.setColor(Color.blue);
            g.setFont(myFont);
            g.drawString(theDie,1340,420);
            //g.drawString(theDie,1340,450);
            g.setFont(normal);
         }   
         if(ifD8){
            die = something.DiceRollerD8();
            theDie = "" + die;
            g.setColor(Color.white);
            g.fillPolygon(xPointsTriangle, yPointsTriangle, 3);
            g.setColor(Color.blue);
            g.setFont(myFont);
            g.drawString(theDie,1340,450); 
            g.setFont(normal);         
         }   
         if(ifD10){
            die = something.DiceRollerD10();
            theDie = "" + die;
            g.setColor(Color.white);
            g.fillPolygon(xPointsTriangle, yPointsTriangle, 3);
            g.setColor(Color.blue);
            g.setFont(myFont);
            g.drawString(theDie,1340,450);
            g.setFont(normal);
         }   
         if(ifD12){
            die = something.DiceRollerD12();
            theDie = "" + die;
            g.setColor(Color.white);
            int[] xPoints = {1250,1150,1350,1550,1450};
            int[] yPoints = {600,400,200,400,600};
            g.fillPolygon(xPoints, yPoints, 5);
            g.setColor(Color.blue);
            g.setFont(myFont);
            g.drawString(theDie,1340,450);
            g.setFont(normal);
         }   
         if(ifD20){
            die = something.DiceRollerD20();
            theDie = "" + die;
            g.setColor(Color.white);
            g.fillPolygon(xPointsTriangle, yPointsTriangle, 3);
            g.setColor(Color.blue);
            g.setFont(myFont);
            if(theDie.length() == 2)
               g.drawString(theDie,1330,450);
            else
               g.drawString(theDie,1340,450);
            //g.drawString(theDie,1340,450);
            g.setFont(normal);
         }   
      }
      if(ifD4){
         g.setColor(Color.darkGray);
         g.fillRect(940,25,100,50);
      }
      if(ifD6){
         g.setColor(Color.darkGray);
         g.fillRect(1090,25,100,50);
      }
      if(ifD8){
         g.setColor(Color.darkGray);
         g.fillRect(1240,25,100,50);
      }
      if(ifD10){
         g.setColor(Color.darkGray);
         g.fillRect(1390,25,100,50);
      }
      if(ifD12){
         g.setColor(Color.darkGray);
         g.fillRect(1540,25,100,50);
      }
      if(ifD20){
         g.setColor(Color.darkGray);
         g.fillRect(1690,25,100,50);
      }  
      g.setColor(Color.blue);
      g.drawString("Select type of die",790,55);
      g.drawString("20",1730,55);
      g.drawString("12",1580,55);
      g.drawString("10",1430,55);
      g.drawString("8",1280,55);
      g.drawString("6",1130,55);
      g.drawString("4",980,55);
      g.drawString("Roll",1330,755);
      g.drawString("Reset",1630,755);
      g.drawString("Flip",740,100);
      g.drawString("Edit",740,875);
      if(ifEdit){
         g.setColor(Color.white);
         g.fillRect(0,0,1915,1280);
         g.setColor(Color.gray);
         g.fillRect(0,0,50,50);
         g.setColor(Color.blue);
         g.setFont(attention);
         g.drawString("Please move applet!",750,450);
         g.setFont(normal);
         g.drawString("Exit",10,20);
         repaint();
         ShowTypeScreen = true;
      }
   }
}