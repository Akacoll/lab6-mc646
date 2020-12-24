import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{
    @Test
    public void testInitEmptyList(){
        FileList flist = new FileList();
        assertEquals(0, flist.numfiles());
    }
    @Test
    public void testReachListLimit(){
        FileList flist = new FileList();
        for (int i = 0; i < 11; i++){
            File file = new File("/file.txt");
            flist.addFile(file);
        }
        assertEquals(10,flist.numfiles());
    }
}