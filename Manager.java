package za.ac.mzilikazi.violated;

import javafx.concurrent.Worker;

/**
 * Created by mandisi on 2016-03-27.
 */
public class Manager {

    Employee employee;

    public void setWorker(Employee employee)
       {
           this.employee = employee;
       }
    public void manage()
    {
        employee.work();
    }
}
