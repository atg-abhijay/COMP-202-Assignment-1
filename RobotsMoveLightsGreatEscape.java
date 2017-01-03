import java.awt.Color;
import becker.robots.*;
public class RobotsMoveLightsGreatEscape {
  
  public static void main(String[] args) {
    Robot robot = makeCity();
    // Add your robot code for the great escape directly below here.
    // making the robot go towards the rightward wall
    robot.move();
    robot.move();
    // making the robot face downwards by turning left three times
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    // making the robot go all the way down till the wall
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    // making the robot turn towards the leftwards light by turning left three times
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    // making the robot go towards the light
    robot.move();
    robot.move();
    // making the robot pick up the light
    robot.pickThing();
    // awesome! obtained light! making the robot do a victory dance (spin in a circle)
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    // making the robot face the rightmost wall
    robot.turnLeft();
    robot.turnLeft();
    // making the robot go towards the rightmost wall
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    // making the robot face upwards
    robot.turnLeft();
    // making the robot move towards the second light
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    // making the robot turn left
    robot.turnLeft();
    // making the robot go towards the light
    robot.move();
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    robot.move();
    // making the robot pick up the light
    robot.pickThing();
    // got the second light! almost there! making the robot do a victory dance (spinning in a circle)
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    // making the robot proceed towards the third and final light
    robot.turnLeft();
    robot.turnLeft();
    robot.move();
    robot.turnLeft();
    robot.move();
    robot.turnLeft();
    robot.move();
    robot.move();
    // making the final turn towards the third light
    robot.turnLeft();
    robot.move();
    // making the robot pick up the final light (yippeeee!)
    robot.pickThing();
    // got all three lights!! woohoo! now to do a victory dance
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    // now to make the robot proceed out of the maze
    robot.turnLeft();
    robot.turnLeft();
    robot.move();
    // making the robot go right by turning left three times
    robot.turnLeft();
    robot.turnLeft();
    robot.turnLeft();
    // proceeding towards the exit from the maze
    robot.move();
    robot.move();
    robot.move();
    robot.move();
    // at the exit! now to make a left turn!
    robot.turnLeft();
    // finally! finally! going out of the maze!
    robot.move();
    // OUT OF THE MAZE!! GOOD JOB! *Pat on the back*
    
  }

//Ignore everything in this method.
 public static Robot makeCity(){
  final int LIGHT_STREET = 1;
  final int LIGHT_AVENUE = 0;
  final int HEIGHT = 6;
  final int WIDTH = 4;
  
  City montreal = new City(12,12);

  Robot asimo = new Robot(montreal, LIGHT_STREET,
   LIGHT_AVENUE, Direction.EAST);

  //box
  for (int i = 0; i < WIDTH+1; i++) {
   new Wall(montreal, LIGHT_STREET, LIGHT_AVENUE + i,
    Direction.NORTH);
  }  
  for (int i = 0; i < WIDTH+1; i++) {
   new Wall(montreal, LIGHT_STREET+HEIGHT+1, LIGHT_AVENUE + i,
    Direction.SOUTH);
  }  
  for (int i = -1; i < HEIGHT+1; i++) {
   new Wall(montreal, LIGHT_STREET+i+1, LIGHT_AVENUE,
    Direction.WEST);
  }
  for (int i = -1; i < HEIGHT+1; i++) {
    if(LIGHT_STREET+i != 4)
      new Wall(montreal, LIGHT_STREET+i+1, LIGHT_AVENUE+4, Direction.EAST);
  } 
  
  //obstacles
  for (int i = -1; i < HEIGHT; i++) {
   new Wall(montreal, LIGHT_STREET+i+1, LIGHT_AVENUE+2,
    Direction.EAST);
  } 

  //obstacles
  new Wall(montreal, 3,3, Direction.SOUTH);
  new Wall(montreal, 2,3, Direction.EAST);
  new Wall(montreal, 1,3, Direction.SOUTH);
  new Wall(montreal, 1, 4, Direction.EAST);
  
  //tall middle wall
  for (int i = 2; i < HEIGHT; i++) {
   new Wall(montreal, LIGHT_STREET+i+1, LIGHT_AVENUE+1,
    Direction.EAST);
  }
  for (int i = 0; i < 2; i++) {
   new Wall(montreal, LIGHT_STREET+3, LIGHT_AVENUE + i,
    Direction.NORTH);
  }  

  int x2 = 1; int y2 = 3;

  new Flasher(montreal, x2, y2, true);
  new Flasher(montreal, 2, 3, true);
  new Flasher(montreal, 8, 0, true);
  return asimo;
 }
}
