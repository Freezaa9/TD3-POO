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
public interface Polygone extends Iterable<Point>{
    
    public double perimetre();

    public double surface();

    public String texteSommets();

    public boolean equals(Object obj);

    public String toString();
}
