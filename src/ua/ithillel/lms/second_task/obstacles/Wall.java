package ua.ithillel.lms.second_task.obstacles;

import ua.ithillel.lms.second_task.members.Member;

public class Wall extends Obstacle {

    public Wall(double height) {
        super(height);
        setName("Стена");
    }

    @Override
    public boolean overcome(Member member) {
        member.jump();
        return super.overcome(member);
    }
}
