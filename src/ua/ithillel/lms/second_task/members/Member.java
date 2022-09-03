package ua.ithillel.lms.second_task.members;

public class Member implements Movable {

    protected final String name;
    protected double limitRun;
    protected double limitJump;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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
