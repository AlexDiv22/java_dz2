package HomeWork_2;

public class dz2_1 {
    public static void move(int n, int startPole, int endPole) {
        if (n== 0){
            return;
        }
        int intermediatePole = 6 - startPole - endPole;
        move(n-1, startPole, intermediatePole);
        System.out.println("Перемещаем диск " + n + " от " + startPole + " стержня" + " к " +endPole + " стержню");
        move(n-1, intermediatePole, endPole);
    }

    public static void main(String[] args) {
        move(5, 1, 3);
    }


}