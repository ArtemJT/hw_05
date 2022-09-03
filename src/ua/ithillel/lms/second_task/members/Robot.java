package ua.ithillel.lms.second_task.members;

import ua.ithillel.lms.second_task.abstracts.Member;

public class Robot extends Member {

    public Robot(String name) {
        super(name);
        setLimitRun(1);
        setLimitJump(1);
    }
}
