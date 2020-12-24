import java.io.File;
import java.util.ArrayList;

public class FileList {
    private ArrayList<File> files;

    public FileList() {
        this.files = new ArrayList<File>();
    }

    public void addFile(File file) {
//        if(!this.files.contains(file))
        this.files.add(file);
    }

    public void removeFile(File file) {
        if(this.files.contains(file))
            this.files.remove(file);
    }

    public int numfiles(){
        return this.files.size();
    }
}