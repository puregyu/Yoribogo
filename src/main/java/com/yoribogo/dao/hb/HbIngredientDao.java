package com.yoribogo.dao.hb;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yoribogo.dao.IngredientDao;
import com.yoribogo.entity.Ingredient;
import com.yoribogo.entity.Recipe;
@Repository
public class HbIngredientDao implements IngredientDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int insert(Ingredient ingredient) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.save(ingredient);
		
		
		System.out.println("하이버네이트 단 : "+ingredient);
		
		return 1;
	}

	@Transactional
	@Override
	public List<Ingredient> get(Integer recipeId) {
		Session session = sessionFactory.getCurrentSession();
		Query<Ingredient> query = session.createQuery("from Ingredient where recipeId=:recipeId",Ingredient.class)
				.setParameter("recipeId", recipeId);
		List<Ingredient> ingredients = query.getResultList();
		return ingredients;
	}

	//지니  
	@Override
	public List<Ingredient> getIngridient(String[] list) {
		System.out.println("여까진 오지?");
		Session session = sessionFactory.getCurrentSession();
		Query<Ingredient> query = session.createQuery("from Ingredient where fname in (:list)",Ingredient.class)
				.setParameterList("list", list);
		
		List<Ingredient> ingredients = query.getResultList();
		System.out.println("실험 : "+ingredients);
		
		return ingredients;
	}

}
