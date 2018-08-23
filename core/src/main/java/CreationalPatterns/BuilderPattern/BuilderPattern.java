package CreationalPatterns.BuilderPattern; /**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: CreationalPatterns.BuilderPattern.BuilderPattern
 * Author:   yuxing1994
 * Date:     2018/8/9 21:42
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yuxing1994
 * @create 2018/8/9
 * @since 1.0.0
 */
public class BuilderPattern {

    public static class Student {
        String name = null;
        int number = -1;
        String sex = null;
        int age = -1;
        String school = null;

        //构建器，利用构建器作为参数来构建Student对象
        public static class StudentBuilder {
            String name = null;
            int number = -1;
            String sex = null;
            int age = -1;
            String school = null;

            public StudentBuilder setName(String name) {
                this.name = name;
                return this;
            }

            public StudentBuilder setNumber(int number) {
                this.number = number;
                return this;
            }

            public StudentBuilder setSex(String sex) {
                this.sex = sex;
                return this;
            }

            public StudentBuilder setAge(int age) {
                this.age = age;
                return this;
            }

            public StudentBuilder setSchool(String school) {
                this.school = school;
                return this;
            }

            public Student build() {
                return new Student(this);
            }
        }

        public Student(StudentBuilder builder) {
            this.age = builder.age;
            this.name = builder.name;
            this.number = builder.number;
            this.school = builder.school;
            this.sex = builder.sex;
        }
    }
}