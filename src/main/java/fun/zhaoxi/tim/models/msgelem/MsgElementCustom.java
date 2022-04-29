package fun.zhaoxi.tim.models.msgelem;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class MsgElementCustom extends MsgElementBase {

  private String MsgType;

  private MsgElementCustomContent MsgContent;

  public MsgElementCustom(String data) {
    MsgType = "TIMCustomElem";
    MsgElementCustomContent content = new MsgElementCustomContent();
    content.setData(data);
    MsgContent = content;
  }
}
