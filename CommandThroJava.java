//import java.io.File;
 
//import javax.swing.filechooser.FileSystemView;
import java.io.*;
 
/**
 *
 * @author www.codejava.net
 *
 */
public class CommandThroJava {
 
 /*   public static void main(String[] args) {
         
        FileSystemView fsv = FileSystemView.getFileSystemView();
         
        File[] drives = File.listRoots();
        if (drives != null && drives.length > 0) {
            for (File aDrive : drives) {
                System.out.println("Drive Letter: " + aDrive);
                System.out.println("\tType: " + fsv.getSystemTypeDescription(aDrive));
                System.out.println("\tTotal space: " + aDrive.getTotalSpace());
                System.out.println("\tFree space: " + aDrive.getFreeSpace());
                System.out.println();
            }
        }
    }*/

        public static void main(String args[]) 
        { 
            try 
            { 
                Process p=Runtime.getRuntime().exec("cmd /c fsutil volume diskfree C:"); 
                p.waitFor(); 
                BufferedReader reader=new BufferedReader(
                    new InputStreamReader(p.getInputStream())
                ); 
                String line; 
                while((line = reader.readLine()) != null) 
                { 
                    System.out.println(line);
                } 

            }
            catch(IOException e1) {e1.printStackTrace();} 
            catch(InterruptedException e2) {e2.printStackTrace();} 

        } 
    }
