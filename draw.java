import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class draw extends JPanel {
    int x = 0;
    int y = 0;
    private int place = 0;
    public ArrayList<vector> plist = new ArrayList<vector>();
    public ArrayList<line> list2 = new ArrayList<line>();
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        vector prev = plist.get(0);
        for (int x=0; x<1000; x+=50) {
            g.drawLine(x, 0, x, 1000);
        }
        for (int y=0; y<1000; y+=50) {
            g.drawLine(0, y, 1000, y);
        }
        g.setColor(Color.BLACK);
        g.drawLine(500,0,500,1000);
        g.drawLine(0,500,1000,500);
        g.setColor(Color.BLUE);
        g.fillOval(480, 480, 40, 40);
        
        for (vector v : plist) {
            g.setColor(Color.RED);
            g.fillRect((int)(1000*v.getCX())-6,(int)(1000*v.getCY())-6,12,12);
            for (vector v2 : plist) {
                g.setColor(Color.RED);
                g.drawLine((int)(1000*v.getCX()),(int)(1000*v.getCY()),(int)(1000*v2.getCX()),(int)(1000*v2.getCY()));
            }
        }
        
        
        //g.fillRect(x-6, y-6, 12, 12);
    }
    public void drawing() {
        repaint();
    }
    public void change(int x1, int y1) {
        x = x1;
        y = y1;
    }
    public void addvector(vector v) {
        plist.add(v);
    }
    public void clearvector() {
        for (int i=plist.size()-1; i>-1; i--) {
            plist.remove(i);
        }
    }
}