package ua.ithillel.lms.second_task;

import ua.ithillel.lms.second_task.obstacles.Obstacle;
import ua.ithillel.lms.second_task.obstacles.Treadmill;
import ua.ithillel.lms.second_task.obstacles.Wall;
import ua.ithillel.lms.second_task.members.Cat;
import ua.ithillel.lms.second_task.members.Human;
import ua.ithillel.lms.second_task.members.Member;
import ua.ithillel.lms.second_task.members.Robot;

public class Main {

    static Obstacle[] obstacles;
    static Member[] members;

    public static void main(String[] args) {
        obstacles = new Obstacle[]{new Treadmill(Math.random()),
                new Wall(Math.random()), new Wall(Math.random()),
                new Treadmill(Math.random()),
                new Treadmill(Math.random())};
        members = new Member[]{new Human("NICK"), new Cat("CAT"), new Robot("BOT")};
        passingObstacles();
    }

    static void passingObstacles() {
        for (Member member : members) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Treadmill) {
                    member.run(obstacle);
                } else {
                    member.jump(obstacle);
                }
                if (!obstacle.overcome(member)) break;
            }
        }
    }
}
