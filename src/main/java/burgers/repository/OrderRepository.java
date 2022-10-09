package burgers.repository;

import burgers.model.BurgerOrder;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository  extends CrudRepository<BurgerOrder, Long> {
}
