package za.ac.mzilikazi.fixed;

import javafx.concurrent.Worker;

/**
 * Created by mandisi on 2016-03-27.
 */
public class RunDependency {

    public static void main(String[] args)
    {
              EmployeeInterface worker = new Employee();
              EmployeeInterface hardWorker = new Supervisor();
              Manager manager = new Manager();
              manager.setWorker(worker);
              manager.manage();
              manager.setWorker(hardWorker);
              manager.manage();
    }
}
