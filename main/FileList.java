import java.io.File;
import java.util.ArrayList;

public class FileList {
    private ArrayList<File> files;
    private int maxFiles;
    private boolean isUpdateDisabled;

    public FileList(int maxFiles) {
        this.files = new ArrayList<File>();
        this.maxFiles = maxFiles;
        this.isUpdateDisabled = false;
    }

    public int numfiles(){
        return this.files.size();
    }

    public void disableUpdate(){
        this.isUpdateDisabled = true;
    }

    public void addFile(File file) {
        if(this.numfiles() >= this.maxFiles)
            this.files.remove(0);
        if(!this.isUpdateDisabled)
            this.files.add(file);
    }

    public void removeFile(File file) {
        if(this.files.contains(file))
            this.files.remove(file);
    }
}