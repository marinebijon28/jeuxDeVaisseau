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
    public  void speed()
    {
        if (getNextCheckPointDistance() > 3)
            incSpeed(1f);
        else if (getNextCheckPointDistance() > 1)
            incSpeed(0.6f);
    }

    public static float radiantToDegres(float radiant)
    {
        int degres = ((int)(radiant / 3.14f)) * 180;
        return (degres);
    }

    public static float degresToRadiant(int degres)
    {
        float radiant = (degres / 180) * 3.14f;
        return (radiant);
    }

    public void tourner()
    {
        int x_ship = (int)getShipPositionX();
        int y_ship = (int)getShipPositionY();
        int x_check = (int)getCheckPointPositionX(x_ship);
        int y_check = (int)getCheckPointPositionY(y_ship);

        int dy = y_check - y_ship;
        int dx = x_check - x_ship;
        float delta_check = atan2(dy, dx);
        int res_degres = ((int)delta_check + 360) % 360;
        int delta_angle = res_degres - (int)getShipAngle();
        delta_angle = (delta_angle % 360) + 360;
        if (delta_angle < 180)
            turn(delta_angle);
        else
            turn(delta_angle);
    }

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

        turnTowardNextCheckPoint();
        //moveToNextCheckPoint(0.5f);
       speed();
        if (getShipBoostLevel() == 100)
            if (getNextCheckPointDistance() > 10f)
                useBoost();
        if (getNextCheckPointDistance() < 0.6)
            incSpeed( -1);
        //if (getNextCheckPointDistance())
        System.out.println(getNextCheckPointDistance());

        // END OF CODE AREA
        //-------------------------------------------------------
    }
    
}
