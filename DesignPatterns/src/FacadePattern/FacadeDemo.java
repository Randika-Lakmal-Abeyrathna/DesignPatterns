/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadePattern;

/**
 *
 * @author randika-lakmal
 */
public class FacadeDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drowCircle();
        shapeMaker.drowRectangle();
        shapeMaker.drowSquare();
    }
    
}
