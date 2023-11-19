package CalendarApp;
import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AddEvent {
    public TextBox titleTxtBox = new TextBox(By.id("com.samsung.android.calendar:id/title"));
    public Button ALlDay = new Button(By.id("com.samsung.android.calendar:id/all_day_switch"));
    public Button saveButton = new Button(By.xpath("   //android.widget.TextView[@resource-id=\"com.samsung.android.calendar:id/navigation_bar_item_small_label_view\" and @text=\"Guardar\"]"));



}
