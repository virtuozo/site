package virtuozo.showcase.application;

import virtuozo.infra.PlaceRepository;
import virtuozo.ui.HTML;

import com.google.gwt.core.client.EntryPoint;

public class Showcase implements EntryPoint {
  
  @Override
  public void onModuleLoad() {
    PlaceRepository.get().put(Places.values()).forwardTo(HTML.body()).go(Places.HOME);
  }
}