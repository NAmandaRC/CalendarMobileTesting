package CalendarApp;
import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddEvent {
    public TextBox titleTxtBox = new TextBox(By.id("calendar.agenda.calendarplanner.agendaplanner:id/event_edit_input"));
    public Button ALlDay = new Button(By.id("calendar.agenda.calendarplanner.agendaplanner:id/event_edit_time_allday"));
    public Button saveButton = new Button(By.id("calendar.agenda.calendarplanner.agendaplanner:id/event_edit_done_quick"));
    public TextBox address=new TextBox(By.id("com.samsung.android.calendar:id/location"));


}
