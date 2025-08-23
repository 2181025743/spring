package yx.model;// GradeManager.java

import java.util.Map;

public class GradeManager {
    private String name;
    private Map<String, Integer> grades;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(Map<String, Integer> grades) {
        this.grades = grades;
    }

    public void printTotal() {
        int sum = grades.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println(name + "的总成绩为：" + sum);
    }

    public void adjustFailGrades() {
        for (Map.Entry<String, Integer> entry : grades.entrySet()) {
            if (entry.getValue() < 60) {
                int old = entry.getValue();
                int newScore = (int) (old * 1.1);
                entry.setValue(newScore);
                System.out.println("科目 " + entry.getKey() + " 提高到: " + entry.getValue());
            }
        }
    }

    public void printAverage() {
        double avg = grades.values().stream().mapToInt(i -> i).average().orElse(0);
        System.out.println(name + "的平均成绩为：" + avg);
    }
}