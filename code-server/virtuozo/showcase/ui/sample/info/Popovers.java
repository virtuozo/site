package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.InputText;
import virtuozo.ui.Label;
import virtuozo.ui.Popover;
import virtuozo.ui.Tooltip;
import virtuozo.ui.api.Direction;
import virtuozo.ui.api.HasComponents;

import com.google.gwt.event.dom.client.BlurEvent;
import com.google.gwt.event.dom.client.BlurHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;

public class Popovers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Button button = new Button().text("Tooltip on bottom").attachTo(target);
    Popover tip = Popover.create().placement(Direction.BOTTOM).trigger(button, Tooltip.Trigger.CLICK);
    tip.heading().text(button.text());
    tip.body().addText().text(button.text());
    
    Label label = new Label().attachTo(target).text("Tooltip on left");
    tip = Popover.create().placement(Direction.LEFT).trigger(label, Tooltip.Trigger.HOVER);
    tip.heading().text(label.text());
    tip.body().addText().text(label.text());
    
    String placeholder = "Tooltip on top";
    InputText text = new InputText().placeholder(placeholder).attachTo(target);
    tip = Popover.create().placement(Direction.TOP).trigger(text, Tooltip.Trigger.FOCUS);
    tip.heading().text(placeholder);
    tip.body().addText().text(placeholder);

    placeholder = "Tooltip on right";
    text = new InputText().placeholder("Type here to trigger tooltip").attachTo(target);
    final Popover popover = Popover.create().placement(Direction.RIGHT).trigger(text, Tooltip.Trigger.MANUAL);
    popover.heading().text(placeholder);
    popover.body().addText().text(placeholder);
    
    text.onKeyUp(new KeyUpHandler() {
      
      @Override
      public void onKeyUp(KeyUpEvent event) {
        popover.show();
      }
    }).onBlur(new BlurHandler() {
      
      @Override
      public void onBlur(BlurEvent event) {
        popover.hide();
      }
    });
  }
}