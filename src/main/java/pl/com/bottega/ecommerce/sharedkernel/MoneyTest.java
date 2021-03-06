package pl.com.bottega.ecommerce.sharedkernel;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigDecimal;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;

public class MoneyTest {

		@Test
		public void test_multiply_value_by_other_equel_expected_value() {
			Money t1 = new Money(9,"PLN");
			Money expected = new Money(90,"PLN");
			
			assertThat(t1.multiplyBy(10),is(equalTo(expected)));
		}

		@Test
		public void test_add_value_to_other_equel_expected_value() {
			Money t1 = new Money(20,"PLN");
			Money t2 = new Money(70,"PLN");
			Money expected = new Money(90,"PLN");
			
			assertThat(t1.add(t2),is(equalTo(expected)));
		}
		
		@Test
			public void test_subtract_value_from_other_equel_expected_value() {
				Money t1 = new Money(20,"PLN");
				Money t2 = new Money(70,"PLN");
				Money expected = new Money(50,"PLN");
				
				assertThat(t2.subtract(t1),is(equalTo(expected)));
			}

		@Test
			public void test_greaterThan_to_t1value_and_t2value() {
				Money t1 = new Money(55,"PLN");
				Money t2 = new Money(56,"PLN");
				
				assertThat(t2.greaterThan(t1),is(true));
			}
		
		@Test
			public void test_lessThan_to_t1value_and_t2value() {
				Money t1 = new Money(56,"PLN");
				Money t2 = new Money(55,"PLN");
			
				assertThat(t1.lessThan(t2),is(false));
			}
		
		@Test
			public void test_lessOrEquals_to_t1value_and_t2value_if_one_value_is_less_from_other() {
				Money t1 = new Money(55,"PLN");
				Money t2 = new Money(56,"PLN");
			
				
				assertThat(t1.lessOrEquals(t2),is(true));
			}
		
		@Test
		public void test_lessOrEquals_to_t1value_and_t2value_if_one_value_equal() {
			Money t1 = new Money(55,"PLN");
			Money t2 = new Money(55,"PLN");
		
			
			assertThat(t1.lessOrEquals(t2),is(true));
		}
		
		@Test
		public void test_equals_to_t1value_and_t2value_if_both_value_is_equal() {
			Money t1 = new Money(55,"PLN");
			Money t2 = new Money(55,"PLN");
		
			
			assertThat(t1.equals(t2),is(true));
		}
		
}
