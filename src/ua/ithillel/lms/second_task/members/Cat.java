package ua.ithillel.lms.second_task.members;

public class Cat extends Member {

    public Cat(String name) {
        super(name);
        setLimitRun(0.5);
        setLimitJump(0.3);
    }
}
