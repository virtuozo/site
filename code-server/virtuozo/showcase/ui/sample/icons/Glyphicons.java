package virtuozo.showcase.ui.sample.icons;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Glyphicon;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.api.Icon;

public class Glyphicons implements Fragment {
  public void render(HasComponents<?, ?> target) {
    IconsList list = new IconsList().attachTo(target);
    
    for(Icon icon : Glyphicon.values()){
      list.add(icon);
    }
  }
}
