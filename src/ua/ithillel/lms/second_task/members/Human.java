package ua.ithillel.lms.second_task.members;

public class Human extends Member {

    public Human(String name) {
        super(name);
        setLimitRun(0.3);
        setLimitJump(0.2);
    }
}
