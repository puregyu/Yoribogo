package com.yoribogo.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.yoribogo.entity.FoodOrder;
import com.yoribogo.entity.Ingredient;
import com.yoribogo.entity.Member;
import com.yoribogo.entity.Recipe;
import com.yoribogo.service.RecipeService;



@Controller("RecipeController")
@RequestMapping("/recipe/")
public class RecipeController {
	
	@Autowired
	private RecipeService service;

	@RequestMapping("list")
	public String list(@RequestParam(value="p", defaultValue="1") Integer page, Model model) {
		
		List<Recipe> recipe = service.getRecipe();
		model.addAttribute("recipe",recipe);
		
		
		
		return "recipe.list";
	}
	
	@GetMapping("{id}")//경로 설정
	public String detail(@PathVariable("id") Integer id, Model model,
								@PathVariable("id") Integer recipeId
								,Member member) { //파라미터 말고 주소 url때문에
		
		Recipe recipe = service.getRecipe(id);
		model.addAttribute("recipe",recipe);
		
		//글쓴이 프로필 사진 가져오기
		Member memberf= service.getMember(recipe.getMemberId());
		model.addAttribute("memberf", memberf);
		
		List<Ingredient> ingredient = service.getIngridient(recipeId);
		model.addAttribute("ingredient",ingredient);
		
		List<FoodOrder> foodOrder = service.getFoodOrder(recipeId);
		model.addAttribute("foodOrder",foodOrder);
		
		return "recipe.detail";
		
	}
}
