package poc;

import java.time.LocalDate;

import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;

public class PocPojo {
    public MonetaryAmount monetaryAmount = Money.of(1234.56234, "JPY");
    public LocalDate localDate = LocalDate.now();
    public AnotherPojo anotherPojo = new AnotherPojo();
}
