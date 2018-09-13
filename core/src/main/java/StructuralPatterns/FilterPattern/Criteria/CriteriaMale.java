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
package StructuralPatterns.FilterPattern.Criteria;

import StructuralPatterns.FilterPattern.Person;

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
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getGender().equalsIgnoreCase("MALE"))
                malePersons.add(person);
        }
        return malePersons;
    }
}