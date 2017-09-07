import javax.swing.*;
import java.awt.*;
import java.awt.AWTEvent;
import java.awt.Color;
import java.awt.MouseInfo;
import java.util.concurrent.TimeUnit;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;

public class ShapeTest extends JFrame{
   public ShapeTest(){
      setSize(2400,2400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLocationRelativeTo(null);
      setVisible(true);
   }

   public static void main(String a[]){
      new ShapeTest();
   }

   public void paint(Graphics g){
      while(true == true)
      {
      
         try{
            TimeUnit.SECONDS.sleep(1/8);
           
         
            double mouseX = MouseInfo.getPointerInfo().getLocation().getX();
            double mouseY = MouseInfo.getPointerInfo().getLocation().getY();
            int X = (int)mouseX;
            int Y = (int)mouseY;
            Color redish = new Color(200,10,10);
            g.setColor(redish);
            g.fillOval(X, Y, 60, 60); 
         }
         catch(InterruptedException ex){
            Thread.currentThread().interrupt();
            
         }
      }
              
   }
}

