package ua.ithillel.lms.second_task;

import ua.ithillel.lms.second_task.abstracts.Member;
import ua.ithillel.lms.second_task.abstracts.Obstacle;
import ua.ithillel.lms.second_task.members.Cat;
import ua.ithillel.lms.second_task.members.Human;
import ua.ithillel.lms.second_task.members.Robot;
import ua.ithillel.lms.second_task.obstacles.Treadmill;
import ua.ithillel.lms.second_task.obstacles.Wall;

public class Main {

    static Obstacle[] obstacles;
    static Member[] members;

    public static void main(String[] args) {
        obstacles = new Obstacle[]{
                new Treadmill(Math.random()),
                new Wall(Math.random()), new Wall(Math.random()),
                new Treadmill(Math.random()), new Treadmill(Math.random())};

        members = new Member[]{new Human("NICK"), new Cat("CAT"), new Robot("BOT")};

        passingObstacles();
    }

    static void passingObstacles() {
        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle.overcome(member)) break;
            }
        }
    }
}
