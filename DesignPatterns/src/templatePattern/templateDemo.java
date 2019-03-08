/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templatePattern;

/**
 *
 * @author randika-lakmal
 */
public class templateDemo {

    public static void main(String[] args) {
       
        Game CriketGame = new Cricket();
        
        CriketGame.play();
        
        
        Game FootballGame = new Football();
        
        FootballGame.play();
        
    }
    
}
