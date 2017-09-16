package TestPkg;

import org.databene.benerator.anno.Source;
import org.databene.feed4junit.Feeder;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import triangulo.OBJ.Triangulo;

@RunWith(Feeder.class)
public class TestesTriangulo {

    private Triangulo t;

    public TestesTriangulo() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    }

    @Test
    @Source(uri = "EntradaInvalida.csv", rowBased = true)
    public void TesteValidaEntrada(double L1, double L2, double L3, String ES) {
        t = new Triangulo(L1, L2, L3);
        String S = t.verificaValor();
        System.out.println("TesteValidaEntrada\tL1:" + L1 + "\tL2:" + L2 + "\tL3:" + L3 + "\tES:" + ES + "\n");
        assertEquals(ES, S);
    }

    @Test
    @Source(uri = "NaoTriangulo.csv", rowBased = true)
    public void TesteVerificaTriangulo(double L1, double L2, double L3, String ES) {
        t = new Triangulo(L1, L2, L3);
        String S = t.verificaTriangulo();
        System.out.println("TesteVerificaTriangulo\tL1:" + L1 + "\tL2:" + L2 + "\tL3:" + L3 + "\tS:" + S + "\tES:" + ES + "\n");
        assertEquals(ES, S);
    }

    @Test
    @Source(uri = "Tipo.csv", rowBased = true)
    public void TesteTipoTriangulo(double L1, double L2, double L3, String ES) {
        t = new Triangulo(L1, L2, L3);
        String S = t.TipoTriangulo();
        System.out.println("TesteTipoTriangulo\tL1:" + L1 + "\tL2:" + L2 + "\tL3:" + L3 + "\tS:" + S + "\tES:" + ES + "\n");
        assertEquals(ES, S);
    }

    @Test
    @Source(uri = "TodosTestes.csv", rowBased = true)
    public void TodosTestes(double L1, double L2, double L3, String ES) {
        t = new Triangulo(L1, L2, L3);
        String S = t.todos();
        System.out.println("Todos os Testes\tL1:" + L1 + "\tL2:" + L2 + "\tL3:" + L3 + "\tS:" + S + "\tES:" + ES + "\n");
        assertEquals(ES, S);
    }

    @Test
    @Source(uri = "TodosTestes.csv", rowBased = true)
    public void TodosTestes2(double L1, double L2, double L3, String ES) {
        t = new Triangulo(L1, L2, L3);

        String S = "";
        if (t.verificaValor().isEmpty()) {
            if (t.verificaTriangulo().isEmpty()) {
                S = t.TipoTriangulo();
            } else {
                S = "Nao Triangulo";
            }
        } else {
            S = "Entrada Invalida";
        }

        System.out.println("Todos os Testes2\tL1:" + L1 + "\tL2:" + L2 + "\tL3:" + L3 + "\tS:" + S + "\tES:" + ES + "\n");
        assertEquals(ES, S);
    }

}
