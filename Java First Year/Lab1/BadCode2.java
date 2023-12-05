public class BadCode2
         {
              /*sets void to private instead of public, also forgets (static) Also forgets to capitalize "String" */
              public static void main(String[] args)
              {
                  /* incorrectly use's System.out,println, incorrectly capitalizes "out" and "println" */
                    System.out.println("If debugging is the process of removing bugs,"); 
                    /* forgets semi colon at the end of every command, also No need for commas at the end, keep the inside quotation marks*/
                    System.out.println("then programming must be the process of putting them in.");
                    System.out.println("Edsger W. Dijkstra");
               }
         }
         
         
         
         /* also as java is a more "heavy" system, to optimize performance, one printf should be used in combination with %n 
            
            public class BadCode2
         {
              public static void main(String[] args)
              {
                    System.out.printf("If debugging is the process of removing bugs,%nthen programming must be the process of putting them in. %nEdsger W. Dijkstra");
               }
         }
            */
            
            
            