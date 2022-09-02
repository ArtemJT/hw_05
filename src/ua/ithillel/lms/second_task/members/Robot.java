package ua.ithillel.lms.second_task.members;

public class Robot extends Member {

    public Robot(String name) {
        super(name);
        setLimitRun(1);
        setLimitJump(1);
    }
}
