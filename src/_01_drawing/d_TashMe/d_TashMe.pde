// 1. Drag and drop an image with a face onto this sketch
//    a. First find the image (use google to search)
//    b. Right click on the image and select 'Save image As'
//    c. Rename the image something short (e.g. face.jpg)
//    d. Save the image to your computer's desktop
//    e. Drag and drop the image anywhere on this sketch


// These 2 lines of code create variables to hold your face picture and a mustache.
// You will use these later.
PImage face;
PImage mustache;


void setup() {
  
// 2. The code below loads your face picture into the program. 
//     Make sure the file name is correct for the face image you saved earlier
face = loadImage("face.png");
  
// 3. Set the size of the sketch. Make it big enough to show the face you chose.
size(500,500);
// 4. Resize the face so it is the same size as the sketch
face.resize(500,500);
// 5. Drag and drop an image with a mustache onto this sketch. 
//    Try to find one with a transparent background. Use the same idea as in step 1.
//    Make sure the file name is correct for the mustache image you saved.  
mustache = loadImage("mustache.png");
mustache.resize(300,100);
  }

void draw() {
  background(255,154,46);
// 6. DRAW FACE.    Use the background() command to make the face the background of the sketch
//    Run the program to see if the face is drawn. Get this working before you go on.
  
image (face,0,0);
// 7. DRAW MUSTACHE. Use the image() command to draw the mustache.  
//                  The image command looks like this:
if (mousePressed) {
image (mustache,mouseX-150,mouseY-50);
}
//    The numbers specify where to draw the mustache. They represent the top left corner of the image
//    Run the program to see if the mustache is drawn on the face. Get this working before you go on.
//    If you need to resize the mustache, do it in the setup() method after you loaded the mustache image.

// 8.  MOVE.  Change the DRAW MUSTACHE code to use      mouseX, mousY      in place of the numbers.
//     Run the program to see the mustache move around when you move the mouse.
 
// OPTIONAL:
//     Add an if statement so the mustache is only drawn when the mouse is clicked.
//     Add or subtract from mouseX and mouseY when you draw the mustache,
//               so the mustache center appears where the mouse pointer is
//     Draw a hat on the sketch when the right mouse button is pressed. Use this code.
//               if (mouseButton == RIGHT)  {     }

}
