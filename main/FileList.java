import java.io.File;
import java.util.ArrayList;

public class FileList {
    private ArrayList<File> files;
    private int maxFiles;

    public FileList(int maxFiles) {
        this.files = new ArrayList<File>();
        this.maxFiles = maxFiles;
    }

    public int numfiles(){
        return this.files.size();
    }

    public void addFile(File file) {
        if(this.numfiles() >= this.maxFiles)
            this.files.remove(0);
        this.files.add(file);
    }

    public void removeFile(File file) {
        if(this.files.contains(file))
            this.files.remove(file);
    }
}