/**
 * <h1>{@code Carre} - Abstraction d'un carré</h1>
 * <p>
 * Cette classe encapsule les propriétés et les comportements propres à la
 * classe {@code Carre}</p>
 *
 * @author Geoffrey Harrazi &amp; Lucas Morel
 * @version 1.0.0
 * @since 1.0.0
 *
 * 
 */
package td3.poo;

public class CarreTab extends RectangleTab {

    /**
     * <p>
     * Constructeur {@code Carre} qui prend en paramètre le point supérieur
     * gauche du carré et la longueur des côtés de celui-ci.</p>
     * 
     *
     * @param sg point supérieur gauche
     * @param l longueur des côtés
     * @throws Exception si un carre à moins de trois sommets et si il est composé 
     * de deux sommets identique.
     * 
     * @since V1.0.0
     */
    public CarreTab(Point sg, double l) throws Exception {
        super(sg, new Point(sg.getX() - l, sg.getY() + l));
    }

    /**
     * <p>
     * Méthode de calcul de la surface d'un carré.
     * </p>
     *
     * @return double : l'air du carré
     *
     * @since V1.0.0
     */
    @Override
    public double surface() {
        return (this.getSommets()[0].distance(this.getSommets()[1])) * 2;
    }

    /**
     * <p>
     * Méthode qui retourne un string qui représente l'objet.
     * </p>
     *
     * @return String : un string qui représente l'objet.
     *
     * @since V1.0.0
     */
    @Override
    public String toString() {
        StringBuffer buff = new StringBuffer();
        buff.append("Carré à plat ");
        buff.append(this.texteSommets());
        return buff.toString();
    }

}
