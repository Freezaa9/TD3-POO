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
        Point pp1 = new Point(451, 458);
        Point pp2 = new Point(45, 47856);
        Point pp3 = new Point(54, 7);
        Point pp4 = new Point(45, 785);
        Point pp5 = new Point(45, 4632);
        Point[] sommets = new Point[]{pp1, pp2, pp3, pp4, pp5};
        try {
            PolygoneTab PTab = new PolygoneTab(sommets);
            PolygoneLstCirc PLC = new PolygoneLstCirc(sommets);
            System.out.println(PLC);
            System.out.println(PTab);
            System.out.println(PLC.perimetre());
            System.out.println(PTab.perimetre());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

      System.out.println("------Test de la classe Point : ------");
        Point p1 = new Point(-12, 0);
        Point p2 = new Point(5, 10);
        System.out.println("Affichage de la distance entre le point 1 et le point 2 :");
        System.out.println(p1.distance(p2));
        System.out.println("Affichage de la distance entre le point 2 et le point 1 :");
        System.out.println(p2.distance(p1));
        System.out.println("Test des get :");
        System.out.println("p1.getX()");
        System.out.println(p1.getX());
        System.out.println("p1.getY()");
        System.out.println(p1.getY());
        System.out.println("p2.getX()");
        System.out.println(p2.getX());
        System.out.println("p2.getY()");
        System.out.println(p2.getY());
        System.out.println(" Test de memeReel()");
        System.out.println("Valeur de x 3.999999999999 identique pour y");
        System.out.println(p1.memeReel(3.999999999999, 3.999999999999));
        System.out.println("Valeur de x 3.999999999998, valeur de y 3.999999999999");
        System.out.println(p1.memeReel(3.999999999998, 3.999999999999));
        System.out.println("Valeur de x 3.999999979998, valeur de y 3.999999999999");
        System.out.println(p1.memeReel(3.999999979998, 3.999999999999));
        System.out.println(" Test de toString()");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("");
        System.out.println("------Test de la classe Polygone : ------");
        Point p3 = new Point(1, 2);
        Point p4 = new Point(3, 1);
        Point p5 = new Point(2, 4);
        Point p6 = new Point(3, 5);
        Point p7 = new Point(1, 1);
        try {
            PolygoneTab poly1 = new PolygoneTab((new Point[]{p1, p2, p3, p4, p5, p6}));
            PolygoneLstCirc polyLstCirc1 = new PolygoneLstCirc((new Point[]{p1, p2, p3, p4, p5, p6}));
            //Polygone poly1 = new Polygone((new Point[]{p1, p2, p3, p4, p5, p6}));
            PolygoneTab poly2 = new PolygoneTab((new Point[]{p5, p6, p1, p2, p3, p4}));
            PolygoneLstCirc polyLstCirc2 = new PolygoneLstCirc((new Point[]{p5, p6, p1, p2, p3, p4}));
            PolygoneTab poly3 = new PolygoneTab((new Point[]{p7, p6, p5, p2, p4, p1}));
            PolygoneLstCirc polyLstCirc3 = new PolygoneLstCirc((new Point[]{p7, p6, p5, p2, p4, p1}));
            System.out.println(" Test de perimetre() :");
            System.out.println("Perimetre de poly1 et polyLstCirc1:");
            System.out.println(poly1.perimetre());
            System.out.println(polyLstCirc1.perimetre());
            System.out.println("Perimetre de poly2 et polyLstCirc2");
            System.out.println(poly2.perimetre());
            System.out.println(polyLstCirc2.perimetre());
            System.out.println("Perimetre de poly3 et polyLstCirc3");
            System.out.println(poly3.perimetre());
            System.out.println(polyLstCirc3.perimetre());
            System.out.println("Test de toString() :");
            System.out.println("Sommets de poly1  et polyLstCirc1:");
            System.out.println(poly1);
            System.out.println(polyLstCirc1);
            System.out.println("Sommets de poly2  et polyLstCirc2: ");
            System.out.println(poly2);
            System.out.println(polyLstCirc2);
            System.out.println("Sommets de poly3  et polyLstCirc3: ");
            System.out.println(poly3);
            System.out.println(polyLstCirc3);
            System.out.println("Test de equals() :");
            System.out.println("poly1 equals() poly2 :");
            System.out.println(poly1.equals(poly2));
            System.out.println("poly1 equals() poly3 : ");
            System.out.println(poly1.equals(poly3));
            System.out.println("polyLstCirc1 equals() polypolyLstCirc2 : ");
            System.out.println(polyLstCirc1.equals(polyLstCirc2));
            System.out.println("polyLstCirc1 equals() polypolyLstCirc3 : ");
            System.out.println(polyLstCirc1.equals(polyLstCirc3));
            System.out.println("Test de toString() : ");
            System.out.println(poly1);

            System.out.println("");
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Test de condition contructeur polygone :");
        try {
            PolygoneTab polygone1 = new PolygoneTab(new Point[]{p1, p1, p2});
            System.out.println(polygone1);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            PolygoneLstCirc polygone2 = new PolygoneLstCirc(new Point[]{p1, p2});
            System.out.println(polygone2);
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        try {
            PolygoneLstCirc polyLstCirc5 = new PolygoneLstCirc((new Point[]{p1, p2, p3, p4, p5, p6}));
            System.out.println("----------------------------------");
            for (Point p : polyLstCirc5) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }

    }

}
