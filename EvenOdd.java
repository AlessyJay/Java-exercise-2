import java.lang.Math;

class EvenOrOdd{
    public static void main(String[] args) {
        // This program will tell you which number is odd or even with a random method.
        int minNum = 1;
        int maxNum = 100;
        int random = (int)(Math.random() * (maxNum - minNum) + 1);

        if(random % 2 == 0){
            System.out.println(String.format(("%s is an even number."), random));
        }else{
            System.out.println(String.format(("%s is an odd number."), random));
        }
    }
}