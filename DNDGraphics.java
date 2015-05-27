import java.applet.*;
import java.awt.*;
import java.awt.Font;
import java.util.Random;
import java.awt.event.*;


public class DNDGraphics extends Applet implements MouseListener, MouseMotionListener{


   int[] yPoints = {250,550,550};
   int[] xPoints = {1350,1150,1550};
   
   int mouseX;
   int mouseY;
   
   public boolean ifD4 = false;
   public boolean ifD6 = false;
   public boolean ifD8 = false;
   public boolean ifD10 = false;
   public boolean ifD12 = false;
   public boolean ifD20 = false;
   public boolean ifRollButtonPressed;
   public boolean mouseDown;

   public int n;
   public int die;
   public String theDie = "";
   
   public void init(){
      setSize(1915, 1280);
      setBackground(new Color(102, 51, 0));
      addMouseListener(this);
      addMouseMotionListener(this);      /*
      Font myFont= new Font("TimesRoman", Font.BOLD, 24);
      theDie.setFont(myFont);*/ 
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
      
      g.setColor(Color.white);
      g.fillRect(15, 15, 750, 895);
      
      g.setColor(Color.gray);
      g.fillRect(1690,25,100,50);
      g.fillRect(1540,25,100,50);
      g.fillRect(1390,25,100,50);
      g.fillRect(1240,25,100,50);
      g.fillRect(1090,25,100,50);
      g.fillRect(940,25,100,50);
      g.fillRect(1250,700,200,100);
      
      if(mouseDown && mouseX>=1250 && mouseX<=1450 && mouseY>=700 && mouseY<=800)
         ifRollButtonPressed = true;
      else
         ifRollButtonPressed = false;
      if(mouseDown && mouseX>=1690 && mouseX<=1790 && mouseY>=25 && mouseY<=75)
        ifD20  = true;
      else
        ifD20  = false;
      if(mouseDown && mouseX>=1540 && mouseX<=1640 && mouseY>=25 && mouseY<=75)
        ifD12  = true;
      else
        ifD12  = false;
      if(mouseDown && mouseX>=1390 && mouseX<= 1490 && mouseY>=25 && mouseY<=75)
        ifD10  = true;
      else
         ifD10 = false;
      if(mouseDown && mouseX>=1240 && mouseX<=1340 && mouseY>=25 && mouseY<=75)
         ifD8 = true;
      else
         ifD8 = false;
      if(mouseDown && mouseX>=1090 && mouseX<=1190 && mouseY>=25 && mouseY<=75)
         ifD6 = true;
      else
         ifD6 = false;
      if(mouseDown && mouseX>=940 && mouseX<=1040 && mouseY>=25 && mouseY<=75)
         ifD4 = true;
      else  
         ifD4 = false;               
      if(ifRollButtonPressed){
         g.setColor(Color.darkGray);
         g.fillRect(1250,700,200,100);
         if(ifD4)
            DiceRollerD4();
         if(ifD6)
            DiceRollerD6();
         if(ifD8)
            DiceRollerD8();
         if(ifD10)
            DiceRollerD10();
         if(ifD12)
            DiceRollerD12();
         if(ifD20)
            DiceRollerD20();
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
      
      //   drawing die
      g.setColor(Color.white);
      if(n == 1){
         ifD4 = true;
         g.fillPolygon(xPoints, yPoints, 3);
      }
      else if(n == 2){
         ifD6 = true;
         g.fillRect(1200,250,300,300);
      }   
      else if(n == 3){
         ifD8 = true;
         g.fillPolygon(xPoints, yPoints, 3);
      }   
      else if(n == 4){
         ifD10 = true;
         g.fillPolygon(xPoints, yPoints, 3);
      }   
      else if(n == 5){
         ifD12 = true;  
         int[] xPoints = {1300,1250,1350,1450,1400};
         int[] yPoints = {500,400,300,400,500};
         g.fillPolygon(xPoints, yPoints, 5);
      }
      else if(n == 6){
         ifD20 = true;
         g.fillPolygon(xPoints, yPoints, 3);
      }  
       
      //rolls the die  
      
      
      g.setColor(Color.blue);
      g.drawString("Select type of die",790,55);
      g.drawString("20",1730,55);
      g.drawString("12",1580,55);
      g.drawString("10",1430,55);
      g.drawString("8",1280,55);
      g.drawString("6",1130,55);
      g.drawString("4",980,55);
      g.drawString("Roll",1330,755);
   }
}