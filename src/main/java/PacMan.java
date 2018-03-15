/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import MovePac.Movepacman;

/**
 *
 * @author William
 */
public class PacMan extends JFrame implements KeyListener{

    private Movepacman pacman;

    public PacMan(){
        setTitle("Pac Man");
        setSize(500,500);
        setLocation(50, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBackground(Color.black);

        pacman = new Movepacman();

        Thread thread = new Thread(pacman);
        thread.start();
        addKeyListener(this);
        add(pacman);

    }
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        PacMan pc = new PacMan();
        pc.setVisible(true);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            System.out.println("Up button Pressed");
            pacman.direction(1);
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            System.out.println("Down button Pressed");
            pacman.direction(2);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            System.out.println("Left button Pressed");
            pacman.direction(3);
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            System.out.println("Right button Pressed");
            pacman.direction(4);
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
