package m2_02_16;

public class Test8_Q5_Food {
	private String foodName;
	private String foodNutritionalValue;
	private int foodCost;
	
	public Test8_Q5_Food(String foodName, String foodNutritionalValue, int foodCost) {
		this.foodName = foodName;
		this.foodNutritionalValue = foodNutritionalValue;
		this.foodCost = foodCost;
	}
	
	public String getFoodName() {
		return foodName;
	}
	public String getFoodNutritionalValue() {
		return foodNutritionalValue;
	}	
	public int getFoodCost() {
		return foodCost;
	}
	
	public void changeFoodName(String foodName) {
		this.foodName = foodName;
	}	
	public void changeFoodNutritionalValue(String foodNutritionalValue) {
		this.foodNutritionalValue = foodNutritionalValue;
	}	
	public void changeFoodCost(int foodCost) {
		this.foodCost = foodCost;
	}
	
	public static void main(String[] args) {
		Test8_Q5_Food food = new Test8_Q5_Food("소고기", "높음", 100000);
		
		System.out.println("음식 이름 : " + food.getFoodName());
		System.out.println("영양가 : " + food.getFoodNutritionalValue());
		System.out.println("음식 가격 : " + food.getFoodCost());
	}

}
