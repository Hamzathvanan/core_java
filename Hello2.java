public class Hello2 {

    public static void main(String args[]) {
        System.out.println("Hi Hamzath!!");
        System.out.println(5+6);
        System.out.println(5+8);

        int num1 = 7;
        int num2 = 4;
        int total = num1 + num2;
        System.out.println(total);

        byte byte1 = 127;
        short short1 = 222;
        int  int1 = 5432;
        long long1 = 555466743L;

        System.out.println("1: " + byte1 + " 2: " + short1 + " 3: " + int1 + " 4: " + long1);

        char charact = 'a';

        System.out.println("Ch: " + charact);

        float fl = 4.5f;
        double dl = 4.65;

        System.out.println("Fl: " + fl + " Dl: " + dl);

        boolean bl = true;
        if (bl){
            System.out.println("True");
        } else {
            System.out.println("false");
        }
    }
}
