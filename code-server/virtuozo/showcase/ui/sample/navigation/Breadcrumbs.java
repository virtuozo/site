package virtuozo.showcase.ui.sample.navigation;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Breadcrumb;
import virtuozo.ui.interfaces.HasComponents;

public class Breadcrumbs implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Breadcrumb nav = Breadcrumb.create().attachTo(target);
    nav.addItem().text("Home");
    
    nav = Breadcrumb.create().attachTo(target);
    nav.addLink().text("Home");
    nav.addItem().text("Documentation");
    
    nav = Breadcrumb.create().attachTo(target);
    nav.addLink().text("Home");
    nav.addLink().text("Documentation");
    nav.addItem().text("Navigation");
  }
  
  @Override
  public String title() {
    return "Breadcrumb";
  }
}
