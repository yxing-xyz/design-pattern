/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: Employee
 * Author:   yuxing1994
 * Date:     2018/9/12 20:18
 * Description: 组合模型类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈组合模型类〉
 *
 * @author yuxing1994
 * @create 2018/9/12
 * @since 1.0.0
 */
public class Employee {
    String name;
    String dept;
    int salary;
    private List<Employee> subordinates;

    public Employee(String name, String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    public String toString() {
        return ("Employee :[ Name : " + name
                + ", dept : " + dept + ", salary :"
                + salary + " ]");
    }
}