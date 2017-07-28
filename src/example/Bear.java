package example;

class XXX{
    public void m() throws Exception {
        throw new RuntimeException();
    }
}
class YYY extends XXX{
    public void m() throws Exception{
      throw new Exception();
    }
}
public class Bear {
    public static void main(String[] args) throws Exception {
     XXX obj = new XXX();
        obj.m();
    }
}


