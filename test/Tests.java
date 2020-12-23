import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests{
    @Test
    public void testInitEmptyList(){
        FileList flist = new FileList();
        assertEquals(0, flist.numfiles());
    }
}