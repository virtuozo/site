package virtuozo.showcase.ui;

import virtuozo.infra.Presenter;
import virtuozo.infra.View;
import virtuozo.showcase.ui.HomePagePresenter.HomeView;
import virtuozo.showcase.ui.pages.HomePage;

public class HomePagePresenter extends Presenter<HomeView>{
  private static final HomePagePresenter instance = new HomePagePresenter(new HomePage());
  
  public static HomePagePresenter get() {
    return instance;
  }
  
  private HomePagePresenter(HomeView view) {
    super(view);
  }
  
  @Override
  protected void unbind() {
    this.view().detach();
  }
  
  public interface HomeView extends View {
    void detach();
  }
}