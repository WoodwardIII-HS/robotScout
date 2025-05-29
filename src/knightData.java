import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class knightData {
    static void knightGet(String path) throws MalformedURLException {

    URL website = new URL("https://scouting.team195.com/public/195scoutingData.csv");
    String outFile = path;
    FileUtils x = new FileUtils();

    try

    {
        x.copyURLToFile(website, new File(outFile));
    }
    catch(
    IOException e)

    {
        System.out.println("Error in file utils");
    }

    ;
}

}
