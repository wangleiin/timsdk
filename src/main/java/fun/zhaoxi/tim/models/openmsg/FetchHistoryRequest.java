package fun.zhaoxi.tim.models.openmsg;

import fun.zhaoxi.tim.models.base.RequestBase;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
public class FetchHistoryRequest extends RequestBase<FetchHistoryResponse> {

    /**
     * 消息类型
     * C2C 单发消息, Group 群组消息
     */
    private String ChatType;

    /**
     * 需要下载的时间段，2015120121 表示获取 2015 年 12 月 1 日 21:00~21:59 的消息的下载地址
     */
    private String MsgTime;

    @Override
    public Class getResponseClass() {
        return FetchHistoryResponse.class;
    }

    @Override
    public String getResource() {
        return "v4/open_msg_svc/get_history";
    }
}
