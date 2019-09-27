package p01mod3ventas;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColeccionVentasTest {
    
    public ColeccionVentasTest() {
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
    public void testListar() {
        System.out.println("Listar");
        ColeccionVentas instance = new ColeccionVentas();
        ArrayList<Venta> esperado = new ArrayList<Venta>();
        ArrayList<Venta> obtenido = instance.Listar();
        assertEquals(esperado, obtenido);
    }
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Venta venta = new Venta("A", 2, 3);
        ColeccionVentas instance = new ColeccionVentas();
        boolean expResult = true;
        boolean result = instance.Agregar(venta);
        assertEquals(expResult, result);
    }
    @Test
    public void testModificar() {
        System.out.println("modificar");
        Venta venta = new Venta("A", 2, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        venta = new Venta("A", 3, 3);
        boolean result = instance.modificar(venta);
        assertEquals(expResult, result);
    }
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        String codigo = "A";
        Venta venta=new Venta("A", 2, 3);
        ColeccionVentas instance = new ColeccionVentas();
        instance.Agregar(venta);
        boolean expResult = true;
        boolean result = instance.Eliminar(codigo);
        assertEquals(expResult, result);
    }
    @Test
    public void testSubTotal() {
        System.out.println("subTotal");
        Venta v = new Venta("A", 2, 3);
        ColeccionVentas instance = new ColeccionVentas();
        int expResult = 6;
        int result = instance.subTotal(v);
        assertEquals(expResult, result);
    }
}