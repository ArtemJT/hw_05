package ua.ithillel.lms.second_task.members;

import ua.ithillel.lms.second_task.abstracts.Member;

public class Cat extends Member {

    public Cat(String name) {
        super(name);
        setLimitRun(0.5);
        setLimitJump(0.3);
    }
}
