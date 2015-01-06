package virtuozo.showcase.ui.sample.icons;

import virtuozo.ui.Component;
import virtuozo.ui.ListItem;
import virtuozo.ui.OrderList;
import virtuozo.ui.Text;
import virtuozo.ui.api.Icon;

public class IconsList extends Component<IconsList> {
  private OrderList list = new OrderList(OrderList.Type.UNORDERED).css("bs-icons", "bs-icons-list");
  
  public IconsList() {
    this.incorporate(this.list);
  }
  
  public void add(Icon icon){
    ListItem item = this.list.addItem();
    icon.attachTo(item);
    item.add(new Text().css("icon-class").text(icon.name().toLowerCase()));
  }
}
