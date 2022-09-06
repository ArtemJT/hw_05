package ua.ithillel.lms.second_task.obstacles;

import ua.ithillel.lms.second_task.members.Member;

public class Treadmill extends Obstacle {

    public Treadmill(double length) {
        super(length);
        setName("Беговая Дорожка");
    }

    @Override
    public boolean overcome(Member member) {
        member.run();
        return super.overcome(member);
    }
}
