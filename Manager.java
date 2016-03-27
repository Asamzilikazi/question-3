package za.ac.mzilikazi.fixed;

/**
 * Created by Asavela on 2016-03-27.
 */
public class Manager {

    EmployeeInterface worker;

    public void setWorker(EmployeeInterface worker)
    {
        this.worker = worker;
    }
    public void manage()
     {
         worker.work();
     }
}
