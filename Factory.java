/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

import java.util.Map;

/**
 *
 * @author JoiceAndrea
 */
public class Factory {
    public Map <String,String> getTree(int opcion){
        if (opcion==1){
            return new RedBlackTree<String, String>();
        }
        else
            return null;
       
    }
    
}
