package ua.ithillel.lms.second_task.obstacles;

import ua.ithillel.lms.second_task.interfaces.Overcomable;
import ua.ithillel.lms.second_task.members.Member;

public class Obstacle implements Overcomable {

    private String name;
    private final double distance;
    private String memberName;
    private double memberLimit;

    protected Obstacle(double distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Member member) {
        memberName = member.getName();
        memberLimit = member.getLimit();
        if (memberLimit >= distance) {
            printPassed();
            return false;
        }
        printNotPassed();
        return true;
    }

    private void printPassed() {
        System.out.printf("Участник %s прошел препятствие \"%s\" на дистанции %1.2f\n",
                memberName, name, distance);
    }

    private void printNotPassed() {
        System.out.printf("Участник %s не прошел препятствие \"%s\" на дистанции %1.2f. Пройдено %1.2f\n",
                memberName, name, distance, memberLimit);
    }

    public void setName(String name) {
        this.name = name;
    }
}
