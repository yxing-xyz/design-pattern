/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: OrCriteria
 * Author:   yuxing1994
 * Date:     2018/9/2 10:31
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.FilterPattern.Criteria;

import StructuralPatterns.FilterPattern.Person;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/9/2
 * @since 1.0.0
 */
public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCiteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCiteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);

        for (Person person : otherCriteriaItems) {
            if(!firstCriteriaItems.contains(person)){
                firstCriteriaItems.add(person);
            }
        }
        return firstCriteriaItems;
    }
}