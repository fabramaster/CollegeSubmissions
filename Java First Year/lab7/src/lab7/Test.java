package lab7;


public class Test{ 

   public static String concatUsingString()    {  
      String t = "Jane";  
      for (int i = 0; i < 10000; i++){  
          t = t + "Doe";     }  
      return t;     }  
  public static String concatUsingStringBuilder(){  
      StringBuilder sb = new StringBuilder("Jane");  
      for (int i=0; i<10000; i++){  
          sb.append("Doe");      }  
      return sb.toString();      }  
  public static void main(String[] args){  
      long startTime = System.currentTimeMillis();  
      concatUsingString();  
      System.out.println("Time for concatenating with String: "
+(System.currentTimeMillis()-startTime)+"ms");  
      startTime = System.currentTimeMillis();  
      concatUsingStringBuilder();  
      System.out.println("Time for concatenating with StringBuilder: "
+(System.currentTimeMillis()-startTime)+"ms");  
  }   }  