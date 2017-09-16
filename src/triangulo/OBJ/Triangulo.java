package triangulo.OBJ;

public class Triangulo {

    public double L1, L2, L3;

    public Triangulo(double L1, double L2, double L3) {
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
    }

    public String verificaValor() {
        if (L1 <= 0 || L2 <= 0 || L3 <= 0) {
            return "Entrada Inválida";
        }
        return "";
    }

    public String verificaTriangulo() {
        if (L1 <= (L2 + L3) && L2 <= (L1 + L3) && L3 <= (L1 + L2)) {
            return "";
        }
        return "Nao Triangulo";
    }

    public String TipoTriangulo() {
        if (L1 == L2 && L2 == L3) {
            return "Equilatero";
        } else {
            if (L1 == L2 || L1 == L3 || L2 == L3) {
                return "Isósceles";
            } else {
                return "Escaleno";
            }
        }
    }

    public String todos() {
        if (verificaValor().isEmpty()) {
            if (verificaTriangulo().isEmpty()) {
                return TipoTriangulo();
            }
            else
                return "Nao Triangulo";
        }
        else
            return "Entrada Inválida";
    }

}
