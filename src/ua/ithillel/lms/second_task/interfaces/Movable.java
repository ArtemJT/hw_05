package ua.ithillel.lms.second_task.interfaces;

public interface Movable {

    default void run() {
        System.out.println("RUN");
    }

    default void jump() {
        System.out.println("JUMP");
    }
}
