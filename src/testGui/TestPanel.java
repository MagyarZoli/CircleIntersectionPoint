package testGui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

import mz.CircleIntersectionPoint;

public class TestPanel
extends JPanel
implements ActionListener{
    private Timer timer;
    private int width;
    private int height;
    private double alfa = 0;
    private int xpoint;
    private int ypoint;
    private double theta = 60;

    TestPanel(
        int xpoint,
        int ypoint,
        int width,
        int height
    ){
        this.xpoint = xpoint;
        this.ypoint = ypoint;
        this.width = width;
        this.height = height;
        circlePanle();
    }

    private void circlePanle(){
        this.setSize(new Dimension(width+1,height+1));
        this.setBackground(Color.BLACK);
        timer = new Timer(0, this);
        timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(alfa<360){
            alfa+=1;
        }
        else{
            alfa=0;
        }
        if(theta<360){
            theta+=0.4;
        }
        else{
            theta=0;
        }
        repaint();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        CircleIntersectionPoint circleIntPoint = new CircleIntersectionPoint(width/2, alfa);
        g2d.setColor(Color.red);
        g2d.drawLine((int) circleIntPoint.getxPoint(), (int) circleIntPoint.getyPoint(), (int) (width/2), (int) (height/2));
        g2d.drawOval(xpoint, ypoint, width, height);

        CircleIntersectionPoint circleIntPoint2 = new CircleIntersectionPoint(width, height/2, alfa, width/2, height/2);
        g2d.setColor(Color.green);
        g2d.drawLine((int) circleIntPoint2.getxPoint(), (int) circleIntPoint2.getyPoint(), (int) (width/2), (int) (height/2));
        g2d.drawOval(xpoint, ypoint+(height/4), width, height/2);

        CircleIntersectionPoint circleIntPoint3 = new CircleIntersectionPoint(width, height/3, alfa, (width/2), (height/2));
        circleIntPoint3.setTheta(theta);
        g2d.setColor(Color.blue);
        g2d.drawLine((int) circleIntPoint3.getxPoint(), (int) circleIntPoint3.getyPoint(), (int) (width/2), (int) (height/2));
        g2d.rotate(Math.toRadians(theta+90), width/2, height/2);
        g2d.drawOval(xpoint+(height/3), ypoint, width/3, height);
    }
}
