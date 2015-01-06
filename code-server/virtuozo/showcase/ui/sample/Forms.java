package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.forms.Datepickers;

public class Forms implements Sample {
  
  @Override
  public String title() {
    return "Forms";
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Datepickers());
  }
}
