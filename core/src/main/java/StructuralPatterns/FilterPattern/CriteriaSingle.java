/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CriteriaMale
 * Author:   yuxing1994
 * Date:     2018/9/2 10:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.FilterPattern;

import StructuralPatterns.FilterPattern.Criteria.Criteria;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/9/2
 * @since 1.0.0
 */
public class CriteriaSingle implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                singlePersons.add(person);
        }
        return singlePersons;
    }
}