import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import entity.Product;
import repo.ProductRepository;

@RunWith(SpringJUnit4ClassRunner.class)                     //runs inside Spring container
@ContextConfiguration(locations="classpath:appctx.xml")     //earlier we used to run inside Junit
public class HibernateTest { 
	@Autowired
	private ProductRepository productRepository;
	@Test  
	public void testHibernate() {
		Product p = new Product();
		p.setName("Notebook");
		p.setPrice(20000.0);
		productRepository.add(p);
	}

}
