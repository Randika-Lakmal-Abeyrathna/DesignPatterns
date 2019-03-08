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
public class AudioPlayer implements MediaPlayer{

    private MediaAdapter mediaAdupter;
    
    
    @Override
    public void Play(String audioType, String fileName) {
    
        if (audioType.equalsIgnoreCase("vlc")|| audioType.equalsIgnoreCase("mp4")) {
            mediaAdupter   = new MediaAdapter(audioType);
            mediaAdupter.Play(audioType, fileName);
        }else{
            System.out.println("Invalid Audio Type");
        }
        
    }
    
}
