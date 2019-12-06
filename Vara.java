package Labb6;

import java.util.LinkedList;
import Labb6.Menu;

public class Vara {
    static LinkedList<DataObject> objects = new LinkedList<DataObject>();
    
    public void skapaBok(Bok c) {
        //objects[index++] = c;
        objects.add(c);
    }
    
    public Bok readBok() {
    	
        for(DataObject obj : objects) {
            Bok c = (Bok)obj;
   
             return c;
        }
        return null;
    }
}


