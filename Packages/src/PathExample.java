import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample {

    public static void main(String[] args) {

        Path path = Paths.get("~/Desktop");
//        System.out.println(path);
        String path2 = "/Users/aaronyu/../aaronyu/Deskto";
        Path pathOri = Paths.get(path2);
        System.out.println(pathOri);
        Path pathNorm = pathOri.normalize();
        System.out.println(pathNorm);
        boolean pathExists = Files.exists(pathNorm);
        System.out.println(pathExists);
    }

}
