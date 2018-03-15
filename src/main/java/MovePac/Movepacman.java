package MovePac;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author William
 */
public class Movepacman extends JPanel implements Runnable{

    private int x = 225, y = 340;
    private int mdirection = 315;
    private int mouth = 90;
    private int direction;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        setBackground(Color.BLACK);

        g.setColor(Color.YELLOW);
        g.fillOval(x, y, 50, 50);

        g.setColor(Color.BLACK);
        g.fillArc(x, y, 50, 50, mdirection, mouth);


        //Wall
        g.setColor(Color.blue);
        g.drawString("(" + x + "," + y +")", x, y);
        g.fillRect(0,450 , 500, 10);
        g.fillRect(0, 0, 500, 10);
        g.fillRect(0, 0, 10, 500);
        g.fillRect(475, 0, 10, 500);

//       //low vertical wall
//        g.fillRect(77, 390, 140, 10);
//        g.fillRect(280, 390, 135, 10);
//
//        //low hoziantal wall
//        g.fillRect(340, 340, 10, 60);
//        g.fillRect(150, 340, 10, 60);
//
//        //2nd lvl hozi wall
//        g.fillRect(0, 330, 90, 10);
//        g.fillRect(410, 330, 90, 10);
//        g.fillRect(220, 330, 60, 10);

    }

    public void direction(int direction){
        this.direction = direction;
    }

    @Override
    public void run() {
        while(true){
            if(direction == 1){ //Up direction
                // if((x >= 285 && x <= 295)){
                if(y != 15){
                    y-=5;
                    mdirection = 45;
                    if(mouth == 90){
                        mouth = 0;
                    }
                    else if(mouth == 0){
                        mouth = 90;
                    }
                }
            }//}
            else if(direction == 2){ //Down direction
                if( y != 400){
                    y+=5;
                    mdirection = 225;

                    if(mouth == 90){
                        mouth = 0;
                    }
                    else if(mouth == 0){
                        mouth = 90;
                    }
                }
            }
            else if(direction == 3){ //Left direction
                if(x != 20){
                    x-=5;
                    mdirection = 135;

                    if(mouth == 90){
                        mouth = 0;
                    }
                    else if(mouth == 0){
                        mouth = 90;
                    }
                }
            }
            else if(direction == 4){ //Right direction
                if(x != 420){
                    x+=5;
                    mdirection = 315;

                    if(mouth == 90){
                        mouth = 0;
                    }
                    else if(mouth == 0){
                        mouth = 90;
                    }
                }
            }


            repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Movepacman.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
