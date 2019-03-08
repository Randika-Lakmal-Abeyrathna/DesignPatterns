/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorPattern;

/**
 *
 * @author randika-lakmal
 */
public class NameRepository implements Container{

    String []names = {"Randika","Lakmal","Chathura"};
    
    
    @Override
    public Iterator getInstance() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator{

        int index;
        @Override
        public boolean hasNext() {
            
            if (index<names.length) {
                return true;
            }
            return false;
        
        }

        @Override
        public Object next() {
            if (this.hasNext()) {
                return names[index++];
            }
            return null;
        }
    
    }
}
