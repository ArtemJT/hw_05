package ua.ithillel.lms.second_task.members;

public class Human extends Member {

    public Human(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        setLimit(0.3);
    }

    @Override
    public void jump() {
        super.jump();
        setLimit(0.2);
    }
}
