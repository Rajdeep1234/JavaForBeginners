import java.math.BigDecimal;
import java.util.Locale;
import java.util.stream.IntStream;

public class Java8Stream {
    public static void main(String args[]){
       IntStream.range(1,11).forEach(i->System.out.println(i+"*5="+(i*5)));
       
       StringBuilder b1=new StringBuilder("Rajdeep");
        StringBuilder b2=new StringBuilder("Rajdeep");
        System.out.println(b1==b2);
        System.out.println(b1.equals(b2));

        String s1="Rajdeep";
        String s2=new String("Rajdeep");
        System.out.println(s1.equals(s2));
        
        BigDecimal bdl=new BigDecimal("11.5");
        BigDecimal bdl1=new BigDecimal("11.5");
         System.out.println( "Big decimal"+ bdl.add(bdl1));
         
         //1.
        String s=new String("Durga");
        s.concat("sotware");
        System.out.println("string:"+s); //Durga

        StringBuffer sb=new StringBuffer("Durga");
        sb.append("Software");
        System.out.println("StringBuffer:"+sb); //DurgaSoftware

        String s11=new String("Durga");
        String s21=new String("Durga");
        System.out.println(s11==s21); //false
        System.out.println(s11.equals(s21)); //true

        StringBuffer sb11=new StringBuffer("Durga");
        StringBuffer sb21=new StringBuffer("Durga");
        System.out.println(sb11==sb21); //false
        System.out.println(sb11.equals(sb21)); //false

        String ssb=new String("Durga");
        String ssb1=new String("Durga");
        String ssb11="Durga";
        String ssb12="Durga";
        System.out.println(ssb==ssb1);
        System.out.println(ssb11==ssb1);
        System.out.println(ssb11==ssb12);


        String sss=new String("Durga");
        sss.concat("software");
        sss=sss.concat("Solutions");

        System.out.println(sss); //DurgaSolutions

        String bb=new String("Durga");
        bb.concat("Fall");
        String bb2=bb.concat("Winter");
        bb2.concat("Summer");

        System.out.println(bb);//Durga
        System.out.println(bb2);//DurgaWinter

     String s15=new String("durga");
     String s22=s15.toUpperCase(Locale.ROOT);
     String s23=s15.toLowerCase(Locale.ROOT);
     System.out.println(s15==s22);//false
     System.out.println(s15==s23);//true

     String sssbb="durga";
     String sssbb2=sssbb.toString();

     String sssbb3=sssbb.toLowerCase(Locale.ROOT);
     String sssbb4=sssbb.toUpperCase(Locale.ROOT);

     System.out.println(sssbb==sssbb2);//true
     System.out.println(sssbb==sssbb3);//true
     System.out.println(sssbb==sssbb4);//true


    final StringBuffer sb45=new StringBuffer("durga");
     sb45.append("software");
     System.out.println(sb45);//durgasoftware

    }
}
