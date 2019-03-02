

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        
           ArrayList<String> List = new ArrayList<String>();
        
        
           
           int N = Integer.parseInt(reader.readLine());
           int M = Integer.parseInt(reader.readLine());
          
          for (int i = 0; i < N; i++){
              String s = reader.readLine();
              List.add(s);
              
             
          }
          
          for(int i = 0; i < M ; i++){
                List.add(List.remove(0));
            }
        
          
         
           for (int j = 0; j < List.size(); j++)
            {
                
            System.out.println( List.get(j));
            }  
            

    }
}
