import java.io.File;
import java.util.ArrayList;

public class FileList {
    private ArrayList<File> files;

    public FileList() {
        this.files = new ArrayList<File>();
    }

    public int numfiles(){
        return this.files.size();
    }

    public void addFile(File file) {
        if(this.numfiles() >= 10)
            this.files.remove(0);
        this.files.add(file);
    }

    public void removeFile(File file) {
        if(this.files.contains(file))
            this.files.remove(file);
    }
}