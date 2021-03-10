public class Main {
    public static void main(String[] args) {
        int account = 100;
        int refill = 9999;
        int total;
        int bonus;
        if (refill >= 1000){
            bonus = refill / 100;
        }else {
            bonus = 0;
        }
        total = account + refill + bonus;
        System.out.println(total);
    }
}
