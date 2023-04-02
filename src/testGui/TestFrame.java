package testGui;

import java.awt.Dimension;
import javax.swing.JFrame;

public class TestFrame
extends JFrame{
    private final int plusSize = 50;

    public TestFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Test Frame");
        this.setSize(new Dimension(500+plusSize,500+plusSize));
        this.setVisible(true);
        TestPanel panel = new TestPanel(0,0,500,500);
        this.add(panel);
    }
}
