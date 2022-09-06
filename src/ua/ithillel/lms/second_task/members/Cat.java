package ua.ithillel.lms.second_task.members;

public class Cat extends Member {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        super.run();
        setLimit(0.5);
    }

    @Override
    public void jump() {
        super.jump();
        setLimit(0.3);
    }
}
