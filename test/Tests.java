import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{
    @Test
    public void testInitEmptyList(){
        FileList flist = new FileList(10);
        assertEquals(0, flist.numfiles());
    }
    @Test
    public void testReachListLimit(){
        FileList flist = new FileList(10);
        for (int i = 0; i < 11; i++){
            File file = new File("/file.txt");
            flist.addFile(file);
        }
        assertEquals(10,flist.numfiles());
    }
    @Test
    public void testDisableUpdateList(){
        FileList flist = new FileList(10);
        for (int i = 0; i < 3; i++){
            File file = new File("/file.txt");
            flist.addFile(file);
        }
        flist.disableUpdate();
        File file = new File("/file.txt");
        flist.addFile(file);
        assertEquals(3,flist.numfiles());
    }
}