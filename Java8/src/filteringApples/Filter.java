package filteringApples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Filter {

    //Attempt 1
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if("green".equals(apple.getCollor())){
                result.add(apple);
            }
        }
        return result;
    }

    //Attempt 2 parametrizing color
    public static List<Apple> filterApplesByColor(List<Apple> inventory, String color){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(color.equals(apple.getCollor())){
                result.add(apple);
            }
        }
        return result;
    }

    //Attempt 3 filtering by abstract creteria
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate){
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory){
            if(predicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }

    //Attempt 6 abstracting over list type
    public static <T> List<T> filter(List<T> list, Predicate<T> predicate){
        List<T> result = new ArrayList<T>();
        for(T e: list){
            result.add(e);
        }
        return result;
    }
}
