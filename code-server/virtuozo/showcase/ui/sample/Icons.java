package virtuozo.showcase.ui.sample;

import virtuozo.showcase.ui.Example;
import virtuozo.showcase.ui.sample.icons.FontsAwesome;
import virtuozo.showcase.ui.sample.icons.Glyphicons;

public class Icons implements Sample {
  
  @Override
  public String title() {
    return "Icons";
  }
  
  @Override
  public void attach(Sampler target) {
    Example.create(target).load(new Glyphicons());
    Example.create(target).load(new FontsAwesome());
  }
}
