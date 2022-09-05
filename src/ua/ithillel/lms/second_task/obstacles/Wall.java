package ua.ithillel.lms.second_task.obstacles;

import ua.ithillel.lms.second_task.abstracts.Member;
import ua.ithillel.lms.second_task.abstracts.Obstacle;

public class Wall extends Obstacle {

    public Wall(double height) {
        super(height);
        setName("Стена");
    }

    @Override
    public boolean overcome(Member member) {
        member.jump();
        member.setRun(false);
        return super.overcome(member);
    }
}
