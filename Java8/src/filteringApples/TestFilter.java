package filteringApples;

import java.util.ArrayList;
import java.util.List;

public class TestFilter {

    List<Apple> inventory = new ArrayList<>();

    public void test(){
        inventory.add(new Apple("red",200));
        inventory.add(new Apple("green", 100));

        //Attempt 1
        Filter.filterGreenApples(inventory);

        //Attempt 2
        Filter.filterApplesByColor(inventory,"green");

        //Attempt 3
        Filter.filterApples(inventory,new AppleGreenColorPredicate());

        //Attempt 4 anonymous class
        Filter.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return "red".equals(apple.getCollor());
            }
        });
        //Attempt 5  using lambda
        Filter.filterApples(inventory,(Apple apple) -> "red".equals(apple.getCollor()));

        //Attempt 6 abstracting over list type
        Filter.filter(inventory, (Apple apple) -> apple.getWeight() > 150);
    }
}
