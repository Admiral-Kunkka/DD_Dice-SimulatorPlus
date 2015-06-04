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
      }
      else{
         /*g.setColor(Color.black);
         g.fillRect(15,15,750,895);*/
         g.drawImage(imag,15,15,null);
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
            g.drawString(theDie,1340,450);
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
            g.drawString(theDie,1340,450);
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
         UI.Editor();
      }
   }
}