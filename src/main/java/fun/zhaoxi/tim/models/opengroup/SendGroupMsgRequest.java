package fun.zhaoxi.tim.models.opengroup;

import fun.zhaoxi.tim.models.base.RequestBase;
import fun.zhaoxi.tim.models.msgelem.MsgElementBase;
import java.util.List;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class SendGroupMsgRequest extends RequestBase<SendGroupMsgResponse> {

    /**
     * 群组编号
     */
    private String GroupId;

    /**
     * 随机数字，五分钟数字相同认为是重复消息
     */
    private int Random;

    /**
     * 消息优先级
     */
    private String MsgPriority;

    /**
     * 消息体，由一个element数组组成，详见字段说明
     */
    private MsgElementBase[] MsgBody;

    /**
     * 指定消息发送者（选填）
     */
    private String From_Account;

    /**
     * 禁止回调控制选项
     */
    private List<String> ForbidCallbackControl;

    /**
     * 1表示消息仅发送在线成员，默认0表示发送所有成员，AVChatRoom(直播群)不支持该参数
     */
    private Integer OnlineOnlyFlag;

    /**
     * 如果消息中指定 SendMsgControl，设置 NoLastMsg 的情况下，表示不更新最近联系人会话；
     * NoUnread 不计未读，只对单条消息有效。(AVChatRoom 不允许使用)。
     */
    private List<String> SendMsgControl;

    /**
     * 如果消息体中增加了 To_Account，里面指定消息接收者的信息，那么消息只会发送给消息接收者，且该消息不计未读。
     * （支持群类型 Private、Public、ChatRoom）
     * 说明：仅旗舰版支持此功能。
     */
    private List<String> To_Account;

    @Override
    public Class getResponseClass() {
        return SendGroupMsgResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/group_open_http_svc/send_group_msg";
    }
}
