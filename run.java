import java.util.*;
import javax.swing.*;
public class run {
    public static void main(String[] args) {
        double[][] primary = new double[][]{{-2,-2,6,1},{2,-2,6,1},{-2,2,6,1},{2,2,6,1},{-2,-2,10,1},{2,-2,10,1},{-2,2,10,1},{2,2,10,1}};
        double[][] secondary = new double[8][2];
        double tempx = 0;
        double tempy = 0;
        double tempz = 0;
        double[] templist2 = new double[4];
        for (int i=0; i<primary.length;i++) {
            //templist2 = new double[4];
            //templist2[0] = primary[i][0];
            //templist2[1] =  primary[i][1];
            //templist2[2] =  primary[i][2];
            templist2 = manipulate.translate(primary[i], 1.5, -3, 5);
            templist2 = manipulate.scale(primary[i], 0.5, .75, 1);
            //templist2 = manipulate.translate(templist2, 1, 1, 1);
            //templist2 = manipulate.rotate(primary[i], 'x', 300);
            //templist2 = new double[]{templist2[0], templist2[1], templist2[2], 1};
            secondary[i] = project.project2D(templist2,80,1,0,100);
        }
        shape mainshape = new shape();
        for (double[] d : secondary) {
            mainshape.addVector(new vector(d[0], d[1]));
        }
        draw d1 = new draw();
        
        JFrame frame = new JFrame("drawing");
        frame.setVisible(true);
        frame.setSize(1000,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(d1);
        d1.drawing();
        ArrayList<vector> templist = mainshape.getVList();
        
        for (vector v : templist) {
            System.out.println("x:" + v.getCX() + " y:" + v.getCY());
            d1.addvector(v);
        }
        double[] dlist;
        vector[] vlist;
        
        d1.drawing();
        for (int i=0; i<100; i++) {
            
            d1.clearvector();
            templist2 = manipulate.translate(templist2, -0, -0, 1);
            for (vector v : templist) {
                //System.out.println("x:" + v.getCX() + " y:" + v.getCY());
                d1.addvector(v);
            }
        }
        
        
    }
}