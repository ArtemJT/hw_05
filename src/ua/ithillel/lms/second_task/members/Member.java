package ua.ithillel.lms.second_task.members;

import ua.ithillel.lms.second_task.interfaces.Movable;

public class Member implements Movable {

    private final String name;
    private double limit;

    protected Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.print(getName() + " ");
        Movable.super.run();
    }

    @Override
    public void jump() {
        System.out.print(getName() + " ");
        Movable.super.jump();
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
