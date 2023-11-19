package CalendarApp;


import control.Button;
import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Button addButton = new Button(By.id("com.samsung.android.calendar:id/floating_action_button"));
    public Button CancelButton=new Button(By.id("android:id/button2"));

    public Label getTaskName(String name){
        //nombre de la tarea, se crea el objeto label
        Label nameTask = new Label((By.xpath("//android.widget.TextView[@text='"+name+"']")));
        return nameTask;
    }
}
