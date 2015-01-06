package virtuozo.showcase.ui.sample.icons;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.FontAwesome;
import virtuozo.ui.api.HasComponents;
import virtuozo.ui.api.Icon;

public class FontsAwesome implements Fragment {

  public void render(HasComponents<?, ?> target) {
    IconsList list = new IconsList().attachTo(target);
    
    for(Icon icon : FontAwesome.values()){
      list.add(icon);
    }
  }
}
