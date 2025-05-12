import java.util.*;
class Volume
{
  int side;
  double radius,height;
  double rad,hig;
  //volume of cube
  int findVolume(int side)
  {
   return side*side*side;
  }
  //volume of cylinder
  double findVolume(float radius,double height){
   return Math.PI*radius*radius*height;
  }
  //volume of cone
  double findVolume(double rad,float hig,boolean isCone)
  {
   this.rad=rad;
   this.hig=hig;
   if(isCone)
    System.out.print("");
   return(1.0/3.0)* Math.PI*rad*rad*hig;
   }
  double findVolume(double rad)
  {
   return(4.0/3.0)*Math.PI*rad*rad*rad;
  }
}


