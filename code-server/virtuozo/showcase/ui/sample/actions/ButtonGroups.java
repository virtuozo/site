package virtuozo.showcase.ui.sample.actions;

import virtuozo.showcase.ui.sample.Fragment;
import virtuozo.ui.ButtonGroup;
import virtuozo.ui.ButtonGroup.Type;
import virtuozo.ui.api.HasComponents;

public class ButtonGroups implements Fragment {

  public void render(HasComponents<?, ?> target) {
    ButtonGroup group = new ButtonGroup().attachTo(target);
    group.addButton().text("Button");
    group.addDropButton().text("Dropdown").menu().addItem().text("Menu Item");
    group.addSplitButton().text("SplitButton").menu().addItem().text("MenuItem");
    
    group = new ButtonGroup(Type.BLOCK).attachTo(target).checkbox();
    group.addButton().text("Option 1 (pre checked)").activate();
    group.addButton().text("Option 2");
    group.addButton().text("Option 3");
    
    group = new ButtonGroup().attachTo(target).radio();
    group.addButton().text("Option 1 (pre selected)").activate();
    group.addButton().text("Option 2");
    group.addButton().text("Option 3");
    
    this.createSample(target).css(ButtonGroup.Size.X_SMALL);
    this.createSample(target).css(ButtonGroup.Size.SMALL);
    this.createSample(target).css(ButtonGroup.Size.MEDIUM);
    this.createSample(target).css(ButtonGroup.Size.LARGE);
  }
  
  private ButtonGroup createSample(HasComponents<?, ?> target){
    ButtonGroup group = new ButtonGroup().attachTo(target);
    group.addButton().text("Left");
    group.addButton().text("Middle");
    group.addButton().text("Right");
    
    return group;
  }
}
