Bacteria[] a;

void setup()   
{  
	size(500,500);

	a=new Bacteria[20];

	for(int i=0; i<a.length; i++)
	{
		a[i]=new Bacteria(0, 0);
	}   
	

		   
}

		

void draw()   
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
	void move()
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
	void show()
	{
		noStroke();
		fill(0,255,shade,100);
		ellipse(myX,myY,radius,radius);
	}    
}