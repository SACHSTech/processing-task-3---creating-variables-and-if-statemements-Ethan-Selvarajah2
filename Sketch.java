import processing.core.PApplet;

import java.util.Random;

public class Sketch extends PApplet {
	
  public void settings() {
    size(displayWidth, displayHeight);
  }

  public void setup() {
    background(0, 0, 0);
  }

  public void draw() {
    Random myRandom = new Random();
    int xLocation = myRandom.nextInt(displayWidth);
    int yLocation = myRandom.nextInt(displayHeight);

    // Background colour changes based on the location of the circle
    if (xLocation < (0.5 * displayWidth) && yLocation < (0.5 * displayHeight)) {
      background(255, 61, 152); // Upper-left quadrant
    } else if (xLocation >= (0.5 * displayWidth) && yLocation < (0.5 * displayHeight)) {
      background(255, 239, 61); // Upper-right quadrant
    } else if (xLocation < (0.5 * displayWidth) && yLocation >= (0.5 * displayHeight)) {
      background(61, 255, 87); // Lower-left quadrant
    } else {
      background(34, 90, 212); // Lower-right quadrant
    }

    // Circle colour changes based on the location of the circle
    if (xLocation < (0.5 * displayWidth) || yLocation < (0.5 * displayHeight)) {
      fill(255);
    } else {
      fill(0);
    }

    noStroke();
    ellipse(xLocation, yLocation, 50, 50);

    rect(xLocation - 100, yLocation - 200, 15, 15);

    // Displays the current time
    String time = hour() + ":" + minute() + ":" + second();
    fill(0);
    textSize(16);
    text(time, displayWidth / 2, 100);
  }
}