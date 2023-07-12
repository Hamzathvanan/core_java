public class TypeCasting {

    public static void main (String[] args){
        byte b = 127;
        int a = b;
        System.out.println("byte to int: " + a);


        int c = 12;
        byte d = (byte)c;
        System.out.println("int to byte: " + d);


        float e = 14.45f;
        int f = (int)e;
        System.out.println("float to int: " + f);
    }

}
