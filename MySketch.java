/**
 * Name : Michelle Wang
 * PennKey : mw8
 * Recitation : 214
 * 
 * Execution: java MySketch
 *
 * This is my pratice drawing using the PennDraw library
 * This draws a peach tree in the middle of a green field with a blue sky.
 */
   
public class MySketch {
    public static void main(String[] args) {
        PennDraw.setCanvasSize(500, 500);
        
        // draw a blue background
        PennDraw.clear(PennDraw.BLUE); 
        
        // draw the tree trunk
        PennDraw.setPenColor(200, 170, 50);
        PennDraw.filledRectangle(.65, 200 / 500.0, .05, 100 / 500.0);
        
        //draw a green field
        PennDraw.setPenColor(0, 170, 0);
        PennDraw.filledRectangle(0.5, 0.125, 0.5, 0.125);
        
        //draw circles for tree leaves
        PennDraw.filledCircle(310 / 500.0, 280 / 500.0, .07);
        PennDraw.filledCircle(300 / 500.0, 320 / 500.0, .07);
        PennDraw.filledCircle(250 / 500.0, 290 / 500.0, .07);
        PennDraw.filledCircle(350 / 500.0, 330 / 500.0, .07);
        PennDraw.filledCircle(280 / 500.0, 320 / 500.0, .07);
        PennDraw.filledCircle(260 / 500.0, 270 / 500.0, .07);
        PennDraw.filledCircle(270 / 500.0, 320 / 500.0, .07);
        PennDraw.filledCircle(290 / 500.0, 380 / 500.0, .07);
        PennDraw.filledCircle(330 / 500.0, 380 / 500.0, .07);
        PennDraw.filledCircle(220 / 500.0, 290 / 500.0, .07);
        PennDraw.filledCircle(280 / 500.0, 360 / 500.0, .07);
        PennDraw.filledCircle(380 / 500.0, 340 / 500.0, .07);
        PennDraw.filledCircle(210 / 500.0, 340 / 500.0, .07);
        
        //change the pen color to pink
        PennDraw.setPenColor(PennDraw.PINK);
        
        //draw the peach
        PennDraw.filledCircle(250 / 500.0, 0.75, .05);
        PennDraw.filledCircle(270 / 500.0, 0.75, .05);
        PennDraw.filledPolygon(0.46, 0.72, 0.52, 0.67, 0.58, 0.72);
        
        PennDraw.setPenColor(PennDraw.BLACK); // make the pen black
        
        PennDraw.setPenRadius(0.005); // thicken the pen for outline drawing
        
        // draw the peach outline        
        PennDraw.polyline(0.46, 0.72, 0.52, 0.67, 0.58, 0.72); 
        PennDraw.arc(250 / 500.0, 0.75, .05, 70, 225);
        PennDraw.arc(270 / 500.0, 0.75, .05, -45, 180);
        
        
    }
}