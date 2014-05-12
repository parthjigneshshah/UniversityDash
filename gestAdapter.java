public class gestAdapter extends GestManager implements gestTarget
{
    public void gestTranslator(String highHand, String joint, int gestState){

        //pause game = hands on shoulder
        if (highHand.equals("EscapeSequence")) {gestState = 9; System.out.println("Escape Sequence --> " + gestState);pause();}
        else if (highHand.equals("QuitSequence")) {gestState = 10; System.out.println("Quit Sequence --> " + gestState);quit();}
        //else {            
            //move student or tutor
            if(highHand.equals("Right Hand")){
                
                if(joint.equals("Left Hand")){gestState = 1; movePerson(1);}//Student Quadrant 1
                else if(joint.equals( "Right Foot")){gestState = 2; movePerson(2);}//Student Quadrant 2 
                else if(joint.equals("Left Foot")){gestState = 3; movePerson(3);}//Student Quadrant 3
                else if(joint.equals("Left Elbow")){gestState = 4; movePerson(4);}//Student Quadrant 3
            } else {
                if(joint.equals("Right Hand")){ gestState = 5; movePerson(5);}//Tutor Quadrant 1
                else if(joint.equals("Right Foot")){gestState = 6; movePerson(6);}//Tutor Quadrant 2
                else if(joint.equals("Left Foot")){gestState = 7; movePerson(7);}//Tutor Quadrant 3
                else if(joint.equals("Right Elbow")){gestState = 8; movePerson(8);}//Tutor Quadrant 3         
            }  
                    //System.out.println("We just translated and moved someone to " + gestState);
        }
        

    //}
}
