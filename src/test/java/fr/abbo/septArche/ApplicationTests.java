package fr.abbo.septArche;

import fr.abbo.septArche.exceptions.StockExceptions;
import fr.abbo.septArche.models.Stock;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

		@Test
		void contextLoads() {
		}

		public static class StockTest {

			@Test
			public void testDecrementStock() throws StockExceptions {
				Stock stock = new Stock();
				stock.setNombre(10);
				stock.decremente(5);
				Assertions.assertEquals(5, stock.getNombre());
			}

			@Test
			public void testIncrementStock() {

				Stock stock = new Stock();
				stock.setNombre(15);
				stock.incremente(3);
				Assertions.assertEquals(18, stock.getNombre());

			}

			@Test
			public void testDecrementStock_InsufficientStock() {

				Stock stock = new Stock();
				stock.setNombre(5);
				Assertions.assertThrows(StockExceptions.class, () -> stock.decremente(7));
				Assertions.assertEquals(5, stock.getNombre());
			}
		}

}
