package CalendarApp;


import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addButton = new Button(By.id("com.samsung.android.calendar:id/floating_action_button"));
    public Button CancelButton=new Button(By.id("android:id/button2"));
    public Button Menu= new Button(By.id("com.samsung.android.calendar:id/open_drawer"));
    public Button MenuDay=new Button(By.xpath("(//android.widget.RelativeLayout[@resource-id=\"com.samsung.android.calendar:id/switcher_layout\"])[4]"));
    public Label getTaskName(String name){
        //nombre de la tarea, se crea el objeto label
        Label nameTask = new Label((By.xpath("//android.widget.TextView[@text='"+name+"']")));
        return nameTask;
    }
}
