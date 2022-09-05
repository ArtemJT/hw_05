package ua.ithillel.lms.second_task.abstracts;

import ua.ithillel.lms.second_task.interfaces.Movable;

public abstract class Member implements Movable {

    private final String name;
    private double limitRun;
    private double limitJump;
    private boolean isRun;

    protected Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        System.out.print(name + " ");
        Movable.super.run();
    }

    @Override
    public void jump() {
        System.out.print(name + " ");
        Movable.super.jump();
    }

    public boolean isRun() {
        return isRun;
    }

    public void setRun(boolean run) {
        isRun = run;
    }

    public double getLimitRun() {
        return limitRun;
    }

    public void setLimitRun(double limitRun) {
        this.limitRun = limitRun;
    }

    public double getLimitJump() {
        return limitJump;
    }

    public void setLimitJump(double limitJump) {
        this.limitJump = limitJump;
    }
}
