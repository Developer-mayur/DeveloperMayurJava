import java.io.File;

public class file6{


    public static void main(String[] args) {
         
         int iSBs = 256;

        try {
            File f = new File("H.jpg");
            long byteCount = 0;
                byteCount = f.length();
            
             
            
        
            long fileSizeBits = byteCount * 8;
            float uploadtime = fileSizeBits / iSBs;
            System.out.println("File size: " + byteCount + " bytes");
            System.out.println("Estimated upload time: " + uploadtime + " seconds");
        } catch (Exception e) {
            System.err.println("Error  file: ");
            
         }
    }



   
}
