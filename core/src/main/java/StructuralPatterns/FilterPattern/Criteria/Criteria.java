package StructuralPatterns.FilterPattern.Criteria;

import StructuralPatterns.FilterPattern.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
