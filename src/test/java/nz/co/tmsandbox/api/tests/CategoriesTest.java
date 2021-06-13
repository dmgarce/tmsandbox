package nz.co.tmsandbox.api.tests;

import org.junit.Test;
import io.restassured.response.Response;
import nz.co.tmsandbox.api.models.Category;
import nz.co.tmsandbox.api.models.Promotion;
import nz.co.tmsandbox.api.utils.AssertUtil;

import static io.restassured.RestAssured.*;

public class CategoriesTest {
	
	private static String url = "https://api.tmsandbox.co.nz/v1/Categories/{categoryId}/Details.json";
	
	@Test
	public void verifyDetails() {
		Response response = given()
			.pathParam("categoryId", 6327)
			.queryParam("catalogue", "false")
			.when()
			.get(url);
		Category categoryData = response.as(Category.class);
		AssertUtil.assertTrue(("Carbon credits"), categoryData.getName());
		AssertUtil.assertTrue(categoryData.isCanRelist());
		AssertUtil.assertTrue(("2x larger image"), getDescriptionOfPromotionWithName(categoryData, "Gallery"));
	}

	private String getDescriptionOfPromotionWithName(Category categoryData, String name) {
		for (Promotion promotions: categoryData.getPromotions()) {
			if (promotions.getName().equals(name))
				return promotions.getDescription();
		}
		return "not found";
	}
}
