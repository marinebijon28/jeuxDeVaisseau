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
<<<<<<< HEAD
    static float delta = 0;
=======
    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE
    static int delta = 0;
>>>>>>> Lexo
    static int delta_angle = -1;
<<<<<<< Updated upstream
    static int turnNextCheck = 4;

    static float tonnageBattery;
<<<<<<< HEAD
=======
    static float turnNextCheck = 4f;
>>>>>>> Stashed changes
    //-------------------------------------------------------
    // DECLARE YOUR OWN VARIABLES AND FUNCTIONS HERE
=======

    static float shipX;
    static float shipY;

    static float CheckPointX;
    static float CheckPointY;

    static float speedShip;

>>>>>>> Lexo
    public  void speed()
    {
        if (getNextCheckPointDistance() > 3)
            incSpeed(1f);
        else if (getNextCheckPointDistance() > 1)
            incSpeed(0.6f);
        if (getNextCheckPointDistance() < turnNextCheck && delta < getNextCheckPointDistance())
        {
            System.out.println("test");
            float x_check = getCheckPointPositionX(getNextCheckPointIndex() + 1);
            float y_check = getCheckPointPositionY(getNextCheckPointIndex() + 1);
           // getNextCheckPointDistance();
            turnTowardPosition(x_check, y_check);
            delta = getNextCheckPointDistance();

        }
        else
            turnTowardNextCheckPoint();

     //       incSpeed( 0);

        if (getShipBoostLevel() == 100)
            if (getNextCheckPointDistance() > 13f)
                useBoost();

    }

    public static float radiantToDegres(float radiant)
    {
        float degres = ((radiant * 180)) / 3.14f;
        return (degres);
    }

    public static float degresToRadiant(int degres)
    {
        float radiant = (degres / 180) * 3.14f;
        return (radiant);
    }
    public int chekpoint()
    {
        int nBCheckPoint = getNbRaceCheckPoints();
        int indexCheckpoint = getNextCheckPointIndex();

        int nextCheckPoint = (indexCheckpoint + 1) % nBCheckPoint;
        return (nextCheckPoint);
    }

//    public void tourner()
//    {
//        int x_ship = (int)getShipPositionX();
//        int y_ship = (int)getShipPositionY();
//        int x_check = (int)getCheckPointPositionX(getNextCheckPointIndex());
//        int y_check = (int)getCheckPointPositionY(getNextCheckPointIndex());
//
//
//
//        int dy = y_check - y_ship;
//        int dx = x_check - x_ship;
//        float delta_check = atan2(dy, dx);
//        delta_check = delta_check * (180 / PI);
//        int res_degres = ((int)delta_check + 360) % 360;
//        System.out.println(res_degres);
//        int ship_angle = ((int)getShipAngle() % 360) + 360;
//        delta_angle = res_degres - ship_angle;
//        System.out.print("delta :");
//        System.out.print(getShipAngle());
//        System.out.print("delta_angle :");
//        System.out.println(delta_angle);
//       if (delta_angle != ship_angle)
//            turn (delta_angle);
       //if ()
//       {
//                System.out.println(delta_angle);
//                if (!(delta_angle > 180 && delta_angle > 0))
//                    turn(2);
//                else if (delta_angle > -180 && delta_angle < 0)
//                    turn(-2);
//                delta = delta_angle;
//        }
 //   }

    public void BoostAndBatterie()
    {
        tonnageBattery = getShipBatteryLevel();
        speedShip = getShipSpeed();
        if (getNextCheckPointDistance() > 5)
        {
            incSpeed(1f);
            System.out.println("boucle 1");
        }
        else if(getNextCheckPointDistance() <6 && getNextCheckPointDistance() >3)
        {
            incSpeed(0.6f);
        }
        else if(speedShip > 2)
        {
            incSpeed(-0.f);
        }



//        if(tonnageBattery > 50 && isNextCheckPointCharging() == true && getNextCheckPointDistance() < 3)
//        {
//            incSpeed(0.6f);
//            System.out.println("boucle 2");
//        }
//        else if(tonnageBattery <= 25 && isNextCheckPointCharging() == true && getNextCheckPointDistance() < 3)
//        {
//            incSpeed(0.3f);
//            System.out.println("boucle 3");
//        }
//        else if(isNextCheckPointCharging() == false && getNextCheckPointDistance() > 13 && getShipBoostLevel() == 100)
//        {
//            useBoost();
//            System.out.println("boucle 4");
//        }
        if (getNextCheckPointDistance() < turnNextCheck)
        {
            System.out.println("test");
            float x_check = getCheckPointPositionX(getNextCheckPointIndex() + 1);
            float y_check = getCheckPointPositionY(getNextCheckPointIndex() + 1);
            // getNextCheckPointDistance();
            turnTowardPosition(x_check, y_check);

        }
        else
            turnTowardNextCheckPoint();

        //       incSpeed( 0);

        if (getShipBoostLevel() == 100 && getNextCheckPointDistance() > 11 && getPreviousCheckPointDistance() > 3)
        {
            useBoost();
        }
    }

//    public float distance()
//    {
//        CheckPointX = getCheckPointPositionX();
//        CheckPointY = getSecondCheckPointY();
//
//        shipX = getShipPositionX();
//        shipY = getShipPositionY();
//
//        return
//
//    }

    // END OF VARIABLES/FUNCTIONS AREA
    //-------------------------------------------------------
    
    @Override
    public void process(int delta)
    {   
        //-------------------------------------------------------
        // WRITE YOUR OWN CODE HERE
        
        setPlayerName("Student 28 " + getShipSpeed());
        selectShip(1);
        setPlayerColor( 255, 255, getPlayerColorBlue(), 255);

       //  tourner();
      //  if (getNextCheckPointDistance() < turnNextCheck)
        //turnTowardNextCheckPoint();
        //speed();
        BoostAndBatterie();

        // END OF CODE AREA
        //-------------------------------------------------------
    }
    
}
