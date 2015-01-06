package virtuozo.showcase.ui.sample.forms;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Datepicker;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.api.HasComponents;

public class Datepickers implements Fragment {

  public void render(HasComponents<?, ?> target) {
    new Datepicker().attachTo(target).icon(FontAwesome.CALENDAR);
  }
}
