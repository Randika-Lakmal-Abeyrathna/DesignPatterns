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
public class StopState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("In Stop State");
        context.setState(this);
    }
    
    public String toString(){
        return "Stop State";
    }
    
}
