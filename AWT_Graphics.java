import java.applet.Applet; 
import java.awt.Color; 
import java.awt.Graphics; 
/* 
<applet code="SetGraphicsColorExample" width=200 height=100> 
</applet> 
*/ 
public class SetGraphicsColorExample extends Applet{ 
public void paint(Graphics g) { 
/* 
* Graphic objects like lines and rectangles usescurrent 
* foregroundcolor. 
* 
* To change the current graphic coloruse 
* void setColor(Color c) method of GraphicsClass. 
*/ 
//this will create light blue color 
Color customColor = new Color(10,10,255); 
g.setColor(customColor); 
g.drawLine(10,10,30,30); 
g.setColor(Color.red); 
g.fillRect(40,40,40,40); 
g.setColor(Color.green); 
g.fillRect(80,80,40,40); 
g.draw3DRect(81,81,40,40,true); 
} 
}
