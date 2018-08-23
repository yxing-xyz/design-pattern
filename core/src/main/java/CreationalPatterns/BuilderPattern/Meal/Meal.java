/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Meal
 * Author:   yuxing1994
 * Date:     2018/8/23 22:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package CreationalPatterns.BuilderPattern.Meal;

import CreationalPatterns.BuilderPattern.Iterm.Iterm;
import Other.BusinessDelegatePattern.BusinessDelegate;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈订单><br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/23
 * @since 1.0.0
 */
public class Meal {
    List<Iterm> iterms = null;

    public Meal(MealBulder mealBulder) {
        iterms = mealBulder.iterms;
    }

    public float getCost() {
        float cost = 0.0f;
        for (Iterm iterm : iterms) {
            cost += iterm.price();
        }
        return cost;
    }

    public void showIterm() {
        for (Iterm iterm : iterms) {
            System.out.println("name: " + iterm.name() + " price: " + iterm.price());
        }
    }


    public static class MealBulder {
        List<Iterm> iterms = new ArrayList<>();

        public List<Iterm> getIterms() {
            return iterms;
        }

        public MealBulder setIterms(List<Iterm> iterms) {
            this.iterms = iterms;
            return this;
        }

        public MealBulder addProduct(Iterm iterm) {
            iterms.add(iterm);
            return this;
        }

        public Meal build() {
            return new Meal(this);
        }

    }
}