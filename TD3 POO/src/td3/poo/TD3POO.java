/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package td3.poo;

/**
 *
 * @author geoff
 */
public class TD3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Point p1 = new Point(451, 458);
        Point p2 = new Point(45, 47856);
        Point p3 = new Point(54, 7);
        Point p4 = new Point(45, 785);
        Point p5 = new Point(45, 4632);
        Point[] sommets = new Point[]{p1, p2, p3, p4, p5};
        try {
            PolygoneLstCirc PLC = new PolygoneLstCirc(sommets);
            System.out.println("");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
