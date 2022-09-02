package ua.ithillel.lms.second_task.members;

import ua.ithillel.lms.second_task.obstacles.Obstacle;

public interface Movable {

    default void run(Obstacle obstacle) {
        System.out.println(getClass().getSimpleName() + " RUN " + obstacle.getClass().getSimpleName());
    }

    default void jump(Obstacle obstacle) {
        System.out.println(getClass().getSimpleName() + " JUMP " + obstacle.getClass().getSimpleName());
    }
}
