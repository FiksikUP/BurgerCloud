package burgers.repository;

import burgers.model.BurgerOrder;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface OrderRepository extends CrudRepository<BurgerOrder, Long> {

// возвращает список всех заказов, доставленных в заданный район
//    List<BurgerOrder> findByDeliveryZip(String deliveryZip);
// возвращает все заказы, доставленные в определенный район в определенном диапазоне дат
//    List<BurgerOrder> readOrdersByDeliveryZipAndPlacedAtBetween(
//            String deliveryZip, Date startDate, Date endDate);
// возврвщает заказы по адресу при этом игнорируя регистр
//    List<BurgerOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(
//            String deliveryTo, String deliveryCity);
// возвращает заказы отсортированные по свойству DeliveryTo
//    List<BurgerOrder> findByDeliveryCityOrderByDeliveryTo(String city);

}
