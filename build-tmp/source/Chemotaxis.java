import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria[] a;

public void setup()   
{  
	size(500,500);

	a=new Bacteria[20];

	for(int i=0; i<a.length; i++)
	{
		a[i]=new Bacteria(0, 0);
	}   
	

		   
}

		

public void draw()   
{   
	translate(250,250); 
	background(255);
	


	
	for(int i=0; i<a.length; i++)
	{
		a[i].move();
		a[i].show();
	}
}  

class Bacteria    
{     
	int myX, myY, shade, radius;
	Bacteria(int x, int y)
	{
		myX=x;
		myY=y;
		shade=(int)(Math.random()*255);
		radius=10;
	}
	public void move()
	{
		
		if(myX>240)
		{
			myX=myX+(int)(Math.random()*6-5);
		}
		if(myX<-240)
		{
			myX=myX+(int)(Math.random()*6-1);
		}
		if(myY>240)
		{
			myY=myY+(int)(Math.random()*6-5);
		}
		if(myY<-240)
		{
			myY=myY+(int)(Math.random()*6-1);
		}
		else
		{
			myX=myX+(int)(Math.random()*6-3);
			myY=myY+(int)(Math.random()*6-3);
		}	
	}
	public void show()
	{
		noStroke();
		fill(0,255,shade,100);
		ellipse(myX,myY,radius,radius);
	}    
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
