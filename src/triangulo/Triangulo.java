package triangulo;

import java.util.Scanner;

public class Triangulo {

    public static boolean verificaValor(double L1, double L2, double L3) {
        if (L1 <= 0 || L2 <= 0 || L3 <= 0) {
            System.out.println("Entrada Inválida");
            return false;
        }
        return true;
    }

    public static boolean verificaTriangulo(double L1, double L2, double L3) {
        if (L1 <= (L2 + L3) && L2 <= (L1 + L3) && L3 <= (L1 + L2))             
            return true;        
        System.out.println("Não Triangulo");
        return false;
    }

    public static void TipoTriangulo(double L1, double L2, double L3) {
        if (L1 == L2 && L2 == L3) {
            System.out.println("Equilatero");
        } else {
            if (L1 == L2 || L1 == L3 || L2 == L3) {
                System.out.println("Isósceles ");
            } else {
                System.out.println("Escaleno");
            }
        }
    }
    
    public static void todos(double L1, double L2, double L3)  {
        if(verificaValor(L1,L2,L3)) {
            if(verificaTriangulo(L1, L2, L3)) {
                TipoTriangulo(L1, L2, L3);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double L1, L2, L3;
        System.out.println("L1:");
        L1 = sc.nextDouble();
        System.out.println("L2:");
        L2 = sc.nextDouble();
        System.out.println("L3:");
        L3 = sc.nextDouble();
        todos(L1, L2, L3);
    }
}
