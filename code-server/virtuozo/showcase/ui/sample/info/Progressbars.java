package virtuozo.showcase.ui.sample.info;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.Progress;
import virtuozo.ui.Progress.BarColor;
import virtuozo.ui.Progress.DefaultFormat;
import virtuozo.ui.api.HasComponents;

public class Progressbars implements Fragment {

  public void render(HasComponents<?, ?> target) {
    Progress progress = new Progress().attachTo(target);
    progress.addBar().worked(5);
    
    progress = new Progress().attachTo(target);
    progress.addBar().worked(10).format(new DefaultFormat());
    
    progress = new Progress().attachTo(target);
    progress.addBar().worked(20).css(BarColor.DANGER).format(new DefaultFormat());
    
    progress = new Progress().attachTo(target);
    progress.addBar().worked(40).css(BarColor.INFO).format(new DefaultFormat());
    
    progress = new Progress().attachTo(target);
    progress.addBar().worked(60).css(BarColor.SUCCESS).format(new DefaultFormat());
    
    progress = new Progress().attachTo(target);
    progress.addBar().worked(80).css(BarColor.WARNING).format(new DefaultFormat());
    
    progress = new Progress().attachTo(target).css(Progress.ProgressType.STRIPED);
    progress.addBar().worked(100);
    
    progress = new Progress().attachTo(target).css(Progress.ProgressType.ANIMATED);
    progress.addBar().worked(80).css(BarColor.INFO);
    
    progress = new Progress().attachTo(target).total(200);
    progress.addBar().worked(20).css(BarColor.DANGER).format(new DefaultFormat());
    progress.addBar().worked(30).css(BarColor.INFO).format(new DefaultFormat());
    progress.addBar().worked(40).css(BarColor.SUCCESS).format(new DefaultFormat());
    progress.addBar().worked(20).css(BarColor.WARNING).format(new DefaultFormat());
  }
}