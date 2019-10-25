package com.example.homeworktask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static FoodItem getFoodItemById(int foodId) {

        return fooditem.get(foodId);
    }

    public static ArrayList<FoodItem> getAllFoodItem() {
        return new ArrayList<FoodItem>((List) Arrays.asList(fooditem.values().toArray()));
    }

    private static final HashMap<Integer, FoodItem> fooditem = new HashMap<>();

    static {
        fooditem.put(1, new FoodItem(
                1,
                "Bopper",
                "6.00",
                "100% hormone-free Aussie beef, flame-grilled that gives you the irresistible smoky, BBQ flavour. " + "\n"
                        + "\n" + "Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.", R.drawable.article1_image
        ));
        fooditem.put(2, new FoodItem(
                2,
                "Bopper Jr",
                "4.00",
                "Just like the legendary Whopper®, only smaller. " + "\n"
                        + "\n" +"Same great flame-grilled Australian beef with no added hormones, ripe hand-cut tomato, fresh lettuce, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.", R.drawable.article2_image
        ));
        fooditem.put(3, new FoodItem(
                3,
                "Aussie Bopper",
                "6.00",
                "Aussie range - Flame grilled 100% Aussie beef, premium eye bacon, egg, beetroot, melted cheese, onion, hand-cut tomato, fresh lettuce and tomato sauce, on a toasted sesame seed bun.", R.drawable.article3_image
        ));
        fooditem.put(4, new FoodItem(
                4,
                "Angery Bopper",
                "6.00",
                "Just like the original Bopper except with onion, jalapeno and ketchup.", R.drawable.article4_image
        ));
        fooditem.put(5, new FoodItem(
                5,
                "King Kong Borger",
                "6.00",
                "Features a patty made from plants, flame-grilled to give the irresistible smoky, BBQ flavour just like our classic Whopper. " + "\n"
                        + "\n" + " Loaded with crisp fresh lettuce, ripe hand-cut tomatoes, onion, pickles, mayo and tomato sauce on a toasted sesame seed bun.", R.drawable.article5_image
        ));
        fooditem.put(6, new FoodItem(
                6,
                "Chicken Borger",
                "5.00",
                "Tender, juicy, 100% chicken breast fillets in a golden crispy coating." + "\n"
                        + "\n" + "It comes with hand-cut tomato, lettuce and creamy mayo on a sesame seed bun", R.drawable.article6_image
        ));
        fooditem.put(7, new FoodItem(
                7,
                "Grill Master Borger",
                "7.00",
                "Flame-grilled, thicker, juicier 100% Aussie Angus beef placed on an Artisan Brioche bun." + "\n"
                        + "\n" + "Then stacked high with Cheddar cheese, crispy bacon topped with a smokey BBQ sauce and pickles.", R.drawable.article7_image
        ));
        fooditem.put(8, new FoodItem(
                8,
                "Cheeseborger",
                "3.00",
                "Classic combo of a flame-grilled Aussie beef patty topped with cheese, crunchy pickle, mustard and tomato sauce, served on a freshly toasted sesame seed bun.", R.drawable.article8_image
        ));

        fooditem.put(9, new FoodItem(
                9,
                "BBQ Cheeseborger",
                "2.00",
                "Made with 100% flame-grilled Australian beef with no added hormones, cheese, lashings of BBQ sauce and mayonnaise, all on a toasted bun.", R.drawable.article9_image
        ));
        fooditem.put(10, new FoodItem(
                10,
                "Fries",
                "2.00",
                "Thick cut chips are deliciously seasoned, delivering a crispier crunch on the outside, fluffy and hot on the inside.", R.drawable.article10_image
        ));
        fooditem.put(11, new FoodItem(
                11,
                "Onion Rings",
                "3.00",
                " Freshly battered, crispy onion rings.", R.drawable.article11_image
        ));
        fooditem.put(12, new FoodItem(
                12,
                "Nuggets",
                "3.00",
                "Crispy, golden nuggets made with 100% chicken breast, cooked in sunflower and canola oil for a better tasting golden finish.", R.drawable.article12_image
        ));
        fooditem.put(13, new FoodItem(
                13,
                "Storm Oreo",
                "2.00",
                "Rich creamy vanilla soft serve ice cream covered with a storm of crushed OREO Cookie pieces.", R.drawable.article13_image
        ));
        fooditem.put(14, new FoodItem(
                14,
                "Chocolate Sundae",
                "2.00",
                "Rich and velvety vanilla soft serve chocolate sundae topped with a wicked gooey chocolate fudge sauce.", R.drawable.article14_image
        ));
        fooditem.put(15, new FoodItem(
                15,
                "Drumstick Mini",
                "2.00",
                "Smooth vanilla ice cream topped with lush chocolate sauce all in a crispy wafer cone with a delicious choc tip.", R.drawable.article15_image
        ));

    }

}
