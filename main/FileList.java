import java.io.File;
import java.util.ArrayList;

public class FileList {
    private ArrayList<File> files;

    public FileList() {
        files = new ArrayList<File>();
    }

    public int numfiles(){
        return files.size();
    }
}