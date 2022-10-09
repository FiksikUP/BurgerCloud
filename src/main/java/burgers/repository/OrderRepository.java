package burgers.repository;

import burgers.model.BurgerOrder;

public interface OrderRepository {

    BurgerOrder save(BurgerOrder order);

}
