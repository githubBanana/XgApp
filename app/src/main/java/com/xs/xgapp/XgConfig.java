package com.xs.xgapp;

import android.content.Context;
import android.util.Log;

import com.tencent.android.tpush.XGIOperateCallback;
import com.tencent.android.tpush.XGPushManager;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-04-28 15:58
 * @email Xs.lin@foxmail.com
 */
public class XgConfig {
    private static final String TAG = "XgConfig";
    public static void init(Context context) {
        // 开启logcat输出，方便debug，发布时请关闭
// XGPushConfig.enableDebug(this, true);
// 如果需要知道注册是否成功，请使用registerPush(getApplicationContext(), XGIOperateCallback)带callback版本
// 如果需要绑定账号，请使用registerPush(getApplicationContext(),account)版本
// 具体可参考详细的开发指南
// 传递的参数为ApplicationContext
//        XGPushManager.registerPush(context);
        XGPushManager.registerPush(context, new XGIOperateCallback() {
            @Override
            public void onSuccess(Object o, int i) {
                Log.e("test", "registerPush  onSuccess:: " + o);
            }

            @Override
            public void onFail(Object o, int i, String s) {
                Log.e("test", "registerPush  onFail:: " + o);

            }
        });
// 2.36（不包括）之前的版本需要调用以下2行代码
        /*Intent service = new Intent(context, XGPushService.class);
        context.startService(service);*/


// 其它常用的API：
// 绑定账号（别名）注册：registerPush(context,account)或registerPush(context,account, XGIOperateCallback)，其中account为APP账号，可以为任意字符串（qq、openid或任意第三方），业务方一定要注意终端与后台保持一致。
// 取消绑定账号（别名）：registerPush(context,"*")，即account="*"为取消绑定，解绑后，该针对该账号的推送将失效
// 反注册（不再接收消息）：unregisterPush(context)
// 设置标签：setTag(context, tagName)
// 删除标签：deleteTag(context, tagName)


    }
}
