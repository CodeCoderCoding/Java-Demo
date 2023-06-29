package DGenericContainer.Bitmap;

public class Bitmap {

    private byte[] bytes;
    private int length;
    public Bitmap(int length){
        this.length=length;
        bytes=new byte[length%8==0?length/8:length/8+1];
    }
    public boolean get(int index){
        int i=index&7;
        return ((bytes[index] >> 3) & (01111111 >>> (7 - i)) >> i) != 0;
    }
    public void set(int index, boolean value){
        if(value){
            bytes[index>>3] |= 1<<(index&7);
        }else{
            bytes[index>>3] &= ~(1<<(index&7));
        }
    }

}
