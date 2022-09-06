package ua.ithillel.lms.second_task.members;

public class Robot extends Member {

    public Robot(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        setLimit(1);
    }

    @Override
    public void jump() {
        super.jump();
        setLimit(1);
    }
}
