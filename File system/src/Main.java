import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Main {

static  void writeData(String data){
    try{
        FileWriter writer = new FileWriter("New.txt", true);
        writer.write(data);
        writer.close();
    } catch (Exception e) {
        System.out.println("Error");
    }
}


    public static void main(String[] args) {
    writeData("New Data Added again");


//        File file = new File("data2.txt");
//        try {
//            if (file.createNewFile()) {
//                System.out.println("File created" + file.getName());
//                System.out.println("File created in :"+"\n"+file.getAbsolutePath() );
//            } else {
//                System.out.println("File already exists");
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }











    }
}