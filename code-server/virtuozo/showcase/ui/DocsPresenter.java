package virtuozo.showcase.ui;

import virtuozo.infra.Presenter;
import virtuozo.infra.View;
import virtuozo.showcase.ui.DocsPresenter.DocsView;
import virtuozo.showcase.ui.pages.DocsPage;

public class DocsPresenter extends Presenter<DocsView>{
  private static final DocsPresenter instance = new DocsPresenter(new DocsPage());
  
  public static DocsPresenter get() {
    return instance;
  }
  
  private DocsPresenter(DocsView view) {
    super(view);
  }
  
  public interface DocsView extends View {
    
  }
}