package CalendarApp;


import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addButton = new Button(By.id("calendar.agenda.calendarplanner.agendaplanner:id/calendar_add"));
    public Button CancelButton=new Button(By.id("android:id/button2"));
    public Button Closewindow=new Button(By.id("calendar.agenda.calendarplanner.agendaplanner:id/dialog_close"));
    public Button Events=new Button(By.id("calendar.agenda.calendarplanner.agendaplanner:id/main_events_icon"));

    public Label getTaskName(String name){
        //nombre de la tarea, se crea el objeto label
        Label nameTask = new Label((By.xpath("//android.widget.TextView[@text='"+name+"']")));
        return nameTask;
    }
}
