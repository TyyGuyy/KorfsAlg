/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package korfsalg;
import java.io.*

/**
 *
 * @author Tyler
 */
public class CubeStateHelper {
    
    public static String loadFile throws IOException{
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the File Path Containing a Cube State: ");
        String filePath = bf.readLine();
        File file = new File(filePath);
        
        if(!filePath.endsWith(".txt")){
            System.out.println("This is not a text file!");
            System.exit(0);
        }
        else if(!file.exists()){
            System.out.println("File not found!");
            System.exit(0);
        }
        
        FileInputStream fstream = new FileInputStream(filePath);
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        
        String line;
        String state = "";
        
        while ((line = br.readLine()) != null){
            System.out.println(line);
            state += line.replaceAll("\\s", "");
        }
        
        in.close();
        
        if(state.charAt(4)  != 'R' ||
           state.charAt(19) != 'G' ||
           state.charAt(22) != 'Y' ||
           state.charAt(25) != 'B' ||
           state.charAt(40) != 'O' ||
           state.charAt(49) != 'W'){
            System.out.println("Not a valid state.");
            System.exit(0);
        }
        else{
            return state;
        }
    }
}
