package virtuozo.showcase.ui.sample.actions;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Button;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.css.ButtonColor;

public class Buttons implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Button().attachTo(target).text("DEFAULT");
    new Button().attachTo(target).text("DANGER").css(ButtonColor.DANGER);
    new Button().attachTo(target).text("INFO").css(ButtonColor.INFO);
    new Button().attachTo(target).text("PRIMARY").css(ButtonColor.PRIMARY);
    new Button().attachTo(target).text("SUCCESS").css(ButtonColor.SUCCESS);
    new Button().attachTo(target).text("WARNING").css(ButtonColor.WARNING);
    new Button().attachTo(target).text("LINK").css(ButtonColor.LINK);
    
    new Button().attachTo(target).text("XSMALL").css(Button.Size.X_SMALL);
    new Button().attachTo(target).text("SMALL").css(Button.Size.SMALL);
    new Button().attachTo(target).text("LARGE").css(Button.Size.LARGE);
    
    new Button().attachTo(target).text("ACTIVE").activate();
    new Button().attachTo(target).text("DISABLED").disable();
    
    new Button().attachTo(target).text("TOGGLE").toggleable();
  }
}
