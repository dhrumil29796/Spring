package repo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import entity.Product;

@Repository
public class HibernateProductRepository implements ProductRepository {
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public void add(Product product) {
		Session session = sessionfactory.openSession();
		Transaction txn = session.beginTransaction();
		session.save(product);
		txn.commit();
	}

	@Override
	public Product get(int productId) {
		Session session = sessionfactory.openSession();
		Product product = (Product) session.get(Product.class, productId);
		return product;
	}

	@Override
	public List<Product> getAll() {
		Session session = sessionfactory.openSession();
		List<Product> products = session.createQuery("from products").list();
		return products;
	}

}
