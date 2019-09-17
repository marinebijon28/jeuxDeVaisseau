/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.rphstudio.codingdojo.students;

import fr.rphstudio.codingdojo.game.Pod;
import fr.rphstudio.codingdojo.game.PodPlugIn;

/**
 *
 * @author Romuald GRIGNON
 */
public class Student28 extends PodPlugIn {
    public Student28(Pod p){
        super(p);
    }
    
    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE

    
    
    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------
    
    @Override
    public void process(int delta)
    {   
        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE
        
        setPlayerName("Student 28");
        selectShip(1);
        //setPlayerColor(0,0,255,0);
        setPlayerColor( 255, 255, getPlayerColorBlue(), 255);

        moveToNextCheckPoint(0.5f);
        if (getShipBoostLevel() == 100)
            useBoost();
     //   turnTowardNextCheckPoint();
        // END OF CODE AREA
        //-------------------------------------------------------
    }
    
}
