// program for file copy
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class CopyExample {
   public static void main(String[] args) {
      FileInputStream ins = null;
      FileOutputStream outs = null;
      /*This program takes two file paths, to copy one file
        to another existing file */
      try {
         File infile =new File("C:\\Users\\Kanini\\Desktop\\a.txt");
         File outfile =new File("C:\\Users\\Kanini\\Desktop\\b.txt");
         ins = new FileInputStream(infile);
         outs = new FileOutputStream(outfile);
         byte[] buffer = new byte[1024];
         int length;
         
         while ((length = ins.read(buffer)) > 0) {
            outs.write(buffer, 0, length);
         } 
         ins.close();
         outs.close();
         System.out.println("File copied successfully!!");
      } catch(IOException ioe) {
         ioe.printStackTrace();
      } 
   }
}