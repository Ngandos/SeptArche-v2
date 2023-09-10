package fr.abbo.septArche.modelsTests;

    import fr.abbo.septArche.exceptions.StockExceptions;
    import fr.abbo.septArche.models.Stock;
    import org.junit.Test;
    import org.junit.jupiter.api.Assertions;
    import org.springframework.boot.test.context.SpringBootTest;

    @SpringBootTest
    public class StockTest {

        @Test
        public void testDecrementStock() throws StockExceptions {
            Stock stock = new Stock();
            stock.setNombre(10);
            stock.decremente(3);
            Assertions.assertEquals(7, stock.getNombre());
        }

        @Test
        public void testIncrementStock() {
            Stock stock = new Stock();
            stock.setNombre(5);
            stock.incremente(2);
            Assertions.assertEquals(7, stock.getNombre());
        }

        @Test
        public void testDecrementStock_InsufficientStock() {
            Stock stock = new Stock();
            stock.setNombre(5);
            Assertions.assertThrows(StockExceptions.class, () -> stock.decremente(7));
            Assertions.assertEquals(5, stock.getNombre());
        }
    }
