package Day5;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

abstract class TaskReminder {
    abstract void remindTasks();
}

class DailyTaskReminder extends TaskReminder {
    public void remindTasks() {
        ArrayList<String> tasks = new ArrayList<String>() {{
            add("Wake up");
            add("Breakfast");
            add("Join the meet");
            add("Involve in the meet");
            add("Practice Codes");
        }};

        LocalTime[] times = {
            LocalTime.of(8, 0),
            LocalTime.of(8, 30),
            LocalTime.of(8, 50),
            LocalTime.of(9, 0),
            LocalTime.of(12, 0)
        };

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(" Daily Task Reminder \n");

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println("Time: " + times[i].format(formatter));
            System.out.println("Task: " + tasks.get(i));
        }
    }
}

public class TimeProgram {
    public static void main(String[] args) {
        new DailyTaskReminder().remindTasks();
    }
}
