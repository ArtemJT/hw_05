package ua.ithillel.lms.second_task.member;

public interface Movable {

    default void run() {
        System.out.println("RUN");
    }

    default void jump() {
        System.out.println("JUMP");
    }
}
