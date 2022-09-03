package ua.ithillel.lms.second_task.obstacles;

import ua.ithillel.lms.second_task.members.Member;

public class Obstacle implements Overcomable {

    protected String name;
    private final double distance;

    protected Obstacle(double distance) {
        this.distance = distance;
    }

    public boolean overcome(Member member) {
        if (member.getLimitJump() >= distance) {
            System.out.printf("Участник %s прошел препятствие \"%s\" на дистанции %1.2f\n",
                    member.getName(), name, distance);
            return true;
        } else {
            System.out.printf("Участник %s не прошел препятствие \"%s\" на дистанции %1.2f. Пройдено %1.2f\n",
                    member.getName(), name, distance, member.getLimitJump());
            return false;
        }
    }
}
