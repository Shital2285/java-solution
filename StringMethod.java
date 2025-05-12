import java.util.*;
class StringMethod
{
public static void main(String arg[])
  {
	  String s1="SKN SCOE";
	  String s2="skn scoe";
	  String s3="SKN SCOE KORTI PANDHARPUR";
	  String s4="KORTI PANDHARPUR";
	  String s5="SKN SCOE";
	  String s6="SSSSSBBBBBSSBB";
	  
	  System.out.println("S1"+s1);  
	  System.out.println("S2"+s2);  
	  System.out.println("S3"+s3);  
	  System.out.println("S4"+s4);  
	  System.out.println("S5"+s5); 
      String con=s1+""+s4;
      System.out.println("Concat String"+con);
	  System.out.println("Compaer s1 and s5".equals(s1));
	  System.out.println("Compaer s1 and s2".equalsIgnoreCase(s2));
	  System.out.println("SubString 1="+s3.substring(14));
	  System.out.println("SubString 2="+s3.substring(9,14));
	  System.out.println("Replace"+s6.replace("S","s"));
	  System.out.println("Lower case="+s2.toLowerCase());
	  System.out.println("Upper case="+s5.toUpperCase());
  }
}  