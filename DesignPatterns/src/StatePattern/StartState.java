/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StatePattern;

/**
 *
 * @author randika-lakmal
 */
public class StartState implements State{

    
    @Override
    public void doAction(Context context) {
        System.out.println("In Start Status");
        
        context.setState(this);
        
    }
    
    public String toString(){
        return "Start State";
        }
    
}
