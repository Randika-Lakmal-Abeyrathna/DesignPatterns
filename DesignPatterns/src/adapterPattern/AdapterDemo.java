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
public class AdapterDemo {
    
    public static void main(String[] args) {
        
        AudioPlayer audioPlayer = new AudioPlayer();
        
        audioPlayer.Play("mp3", "Randika.mp3");
        audioPlayer.Play("mp4", "Randika.mp4");
        audioPlayer.Play("vlc", "Randika.vlc");
        audioPlayer.Play("mp3", "Randika.mp3");
        
        
    }
    
}
