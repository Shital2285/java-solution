class VolumeTest
{
 public static void main(String args[])
 {
   Volume v=new Volume();
   int cube=v.findVolume(2);
   System.out.println("Cube="+cube);
   double cylinder=v.findVolume(0.3,0.4);
   System.out.println("Cylinder="+cylinder);
   double cone=v.findVolume(0.4,0.5,true);
   System.out.println("Cone="+cone);
   double sphere=v.findVolume(0.4);
   System.out.println("Sphere="+sphere);
 }
}

