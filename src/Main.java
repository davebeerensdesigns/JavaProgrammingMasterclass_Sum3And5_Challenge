public class Main {
    public static void main(String[] args) {
        int sumTotal = 0;
        int counter = 0;
        for(int i = 1; counter < 5 && i <=1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                sumTotal += i;
                System.out.println("Number " + i + " has met the conditions");
                counter++;
            }
        }
        System.out.println("Total sum of 5 numbers that met the conditions equals " + sumTotal);
    }
}