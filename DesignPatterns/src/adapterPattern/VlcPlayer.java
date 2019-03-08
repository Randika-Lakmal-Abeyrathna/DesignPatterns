/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterPattern;

/**
 *
 * @author randika-lakmal
 */
public class VlcPlayer implements AdvanceMediaPlayer{

    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing File : "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // Do Nothing
    }
    
}
