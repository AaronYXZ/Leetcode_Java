package FileAndPath;

import java.io.File;

public class FileDemo {

    public static void main(String[] args) {
        File folder = new File("/Users/aaronyu/Desktop/Project13_RVL/Data/FromPavel/XML");
        File[] allFiles = folder.listFiles();
        for (File file:allFiles){
            if (file.isFile() && file.getName().endsWith(".xml")) {
                System.out.println(file.getName());
            }
            else{
                continue;
            }
        }

        File folderOutput = new File("/Users/aaronyu/Desktop/Project13_RVL/Data/FromPavel/XMLInjected");
        File[] allInjectedFiles = folderOutput.listFiles();
        for(File file:allInjectedFiles){
            if (file.isFile() && file.getName().endsWith(".xml")){

            }
        }
    }
}
