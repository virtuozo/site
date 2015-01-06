package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.InputText;
import virtuozo.ui.Label;
import virtuozo.ui.Tooltip;
import virtuozo.ui.api.Direction;
import virtuozo.ui.api.HasComponents;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;

public class Tooltips implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Button button = new Button().text("Tooltip on bottom").attachTo(target);
    Tooltip.create().placement(Direction.BOTTOM).trigger(button, Tooltip.Trigger.CLICK).text(button.text());
    
    Label label = new Label().attachTo(target).text("Tooltip on left");
    Tooltip.create().placement(Direction.LEFT).trigger(label, Tooltip.Trigger.HOVER).text(label.text());
    
    InputText text = new InputText().placeholder("Tooltip on top").attachTo(target);
    Tooltip.create().placement(Direction.TOP).trigger(text, Tooltip.Trigger.FOCUS).text("Tooltip on top");
    
    text = new InputText().placeholder("Type here to trigger tooltip").attachTo(target);
    final Tooltip tip = Tooltip.create().placement(Direction.RIGHT).trigger(text, Tooltip.Trigger.MANUAL).text("Tooltip on right");
    text.onKeyUp(new KeyUpHandler() {
      
      @Override
      public void onKeyUp(KeyUpEvent event) {
        tip.show();
      }
    }).onBlur(new BlurHandler() {
      
      @Override
      public void onBlur(BlurEvent event) {
        tip.hide();
      }
    });
  }
}