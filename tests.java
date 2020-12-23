@Test
public void testInitEmptyList(){
    FileList flist = new FileList();
    assertEquals(0, flist.numfiles());
}