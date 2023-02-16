package main.java;

public class Ejercicio2 {
    public static int ej1(int valor1, int valor2, int valor3){
        int x=5;
        if ((valor1>1) && (valor2>5) && (valor3<2))
            x=x+1;
        else
            x=x-1;
        return x;
    }

    // Cristina Nechydyuk Alexandrov

    public static int ej2(int uno, int dos, int tres){
        int x=5;
        if ((uno>1) || (dos>5) || (tres<2))
            x=x+1;
        else
            x=x-1;
        return x;
    }

    public static int ej5(int num1, int num2){
        while(num1!=num2){
            if (num1>num2){
                num1=num1-num2;
            }
            else{
                num2=num2-num1;
            }
        }
        return num1;
    }

    public static int ej6(int num, int x, int y){
        if(x<y){
            if(x<=num && num<=y){
                return 1;
            }
            else return 0;
        }
        else
            return -1;
    }

    public static int ej8(int x, int y){
        int contador = 0;
        for(int i = 0; i<= y; i++)
        {
            if(i % x == 0)
            {
                contador++;
            }
        }
        return contador;
    }



}
