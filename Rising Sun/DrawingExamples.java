/**
 * Example: RisingSun
 *          From "Java: An eventful Approach", Section 2.1
 *          
 * demonstrates using an instance variable to store a reference to an object.
 */

import objectdraw.*;
import java.awt.*;

/**
 * A program that allows the user to draw by dragging the mouse.
 */
public class DrawingExamples extends WindowController
{
    
    private Location initialPoint;
    
    public void onMousePress(Location pressPoint)
    {
        //new Text("Pressed", pressPoint, canvas);
        initialPoint = pressPoint;
    }
    
    public void onMouseDrag(Location releasePoint)
    {
        //new Text("Pressed", releasePoint, canvas);
        new Line(initialPoint, releasePoint, canvas);
        
        initialPoint = releasePoint;
    }

}