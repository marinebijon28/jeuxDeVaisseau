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
public class Student1 extends PodPlugIn {    
    public Student1(Pod p){
        super(p);
    }
    
    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE
    static int nBCheckPoint;
    public void move()
    {
        if(getNextCheckPointDistance() < 2f)
        {
            incSpeed(-1f);
        }
        else
        {
            incSpeed(1f);
            if(getShipBoostLevel() == 100 && getNextCheckPointDistance() > 10f)
            {
                useBoost();
            }
        }
    }
   /* public void chekpoint()
    {
        nBCheckPoint = getNbValidCheckPoints();
        getNextCheckPointIndex()

                //index checkpoint +1 modulo nombre de checkpoint
    }*/


    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------
    
    @Override
    public void process(int delta)
    {   
        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE
        
        setPlayerName("Student 1");
        selectShip(28);
        setPlayerColor(255,255,255,255);

        //moveToNextCheckPoint(0.5f);
        move();
        turnTowardNextCheckPoint();
        // END OF CODE AREA
        //-------------------------------------------------------
    }
    
}
