import java.util.*;
class Box
{
int width,height,depth;
Box(int w,int h,int d)
{
width=w;
height=h;
depth=d;
}
public void display()
{
int volume=width*height*depth;
System.out.println("Volume of Box is"+volume);
}
}

class Boxdemo
{
public static void main(String args[]){
Box b=new Box(10,20,30);
b.display();
}
}
