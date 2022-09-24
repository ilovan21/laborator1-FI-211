public class Main {
    static void metoda(int n,int p) {
        System.out.println(n+p);
    }
    static void operatori(int a1,int b1) {

        System.out.println(a1++);
        System.out.println(a1--);
        System.out.println(++a1);
        System.out.println(--a1);
        System.out.println(a1 + b1);
        System.out.println(a1 - b1);
        System.out.println(a1 * b1);
        System.out.println(a1 / b1);
        System.out.println(a1 % b1);
    }
    public static void main(String[] args) {
        System.out.println("Hello World");

        for (String arg : args) {
            System.out.println(arg);
        }
        boolean x = true;
        byte y=124;
        short q=-120;

// operatori
        System.out.println("Introduceti 1 numar");
        int a = 10;
        int b = 5;
        operatori(a,b);
        // if-else
        if (a%2==0) {
            System.out.println("Numarul este par");
        }
        else {
            System.out.println("Numarul este impar");
        }
        //while
        do {
            System.out.println(a);
            a = a + 10;
        }while(a<=30);
        //switch
        int elev=2;
        int varstaElev=0;
        switch (elev){
            case 1:
                varstaElev=15;
                break;
            case 2:
                varstaElev=17;
                break;
            case 3:
                varstaElev=13;
        }
        System.out.println("Varsta elev:"+ varstaElev);
        metoda(40,70);
        }
    }

