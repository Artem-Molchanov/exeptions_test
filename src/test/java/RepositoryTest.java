import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    Product product = new Product(3,"Lorem Ipsum", 200);

    @Test
    public void shouldTestDeleteId () {

    ShopRepository repo = new ShopRepository();

        repo.add(product);
        repo.removeById(product.getId());

        Product[] expected = {};
        Product[] actual = repo.findAll();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void test() {
        ShopRepository repo = new ShopRepository();
        repo.add(product);

        Assertions.assertThrows(NotFoundException.class, () -> {
            repo.removeById(4);
        });

    }
}
