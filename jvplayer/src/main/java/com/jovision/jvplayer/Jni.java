package com.jovision.jvplayer;

public class Jni {
    static {
        System.loadLibrary("jvplayer");
    }

	/* 接口调用错误码 */
	//public enum jav_errorcode_e
	public static final int JAV_ERRORCODE_NOERROR=0;			/*!< 无错误 */
	public static final int JAV_ERRORCODE_FAILED=-1;			/*!< 调用失败 */
	public static final int JAV_ERRORCODE_TIMEOUT=-2;			/*!< 调用超时 */

	/* SDK事件类型 */
	//public enum jav_player_event_type_e
	public static final int JPET_PLAY=0;						/*!< 播放事件，含直播和回放，事件状态详见： jav_play_state_e，无json数据*/
	public static final int JPET_PLAY_TIME_POS=1;				/*!< 播放时间点（回放），详见json定义，method：player_play_time_pos */
	public static final int JPET_PLAY_FILE_POS=2;				/*!< 播放文件位置（回放），详见json定义，method：player_play_file_pos */
	public static final int JPET_RECORD=3;						/*!< 录像事件 */
	public static final int JPET_INTERCOM=4;					/*!< 语音对讲事件 */
	public static final int JPET_DOWNLOAD=5;					/*!< 录像下载事件 */
	public static final int JPET_APCONFIG=6;					/*!< AP配网 */

	/* JPET_PLAY 状态定义 */
	//public enum jav_play_state_e
	public static final int JPS_NONE=0;							/*!< 无状态 */
	public static final int JPS_CONNECTED=1;					/*!< 已连接 */
	public static final int JPS_CONNECT_FAILED=2;				/*!< 连接失败 */
	public static final int JPS_CONNECTION_LIMIT=3;				/*!< 连接限制（p2p连接时，设备连接达到上线了） */
	public static final int JPS_CONNECTION_BROKEN=4;			/*!< 连接中断（网络异常或服务中断） */
	public static final int JPS_CONNECTION_PLAYBACK_OVER=5;		/*!< 录像回放结束 */
	public static final int JPS_CONNECTION_DISCONNECTED=6;		/*!< 连接正常断开 */
	public static final int JPS_VIDEO_LOADING=7;				/*!< 正在缓冲 */
	public static final int JPS_VIDEO_DECODE_FAILED=8;			/*!< 解码失败 */
	public static final int JPS_VIDEO_DECODE_SUCCESS=9;			/*!< 解码成功，收到解码成功后即可调用show接口来预览图像 */
	public static final int JPS_VIDEO_INFO_ENCRYPTION=10;		/*!< 视频信息，收到此状态表明视频流是加密流 */

	/* JPET_RECORD 状态定义 */
	//public enum jav_record_state_e
	public static final int JRS_NONE=0;							/*!< 无状态 */
	public static final int JRS_START_RECORD=1;					/*!< 开始录像 */
	public static final int JRS_CREATE_PACKAGE_OK=2;			/*!< 创建录像文件成功，收到json数据，详见：player_record */
	public static final int JRS_CREATE_PACKAGE_FAILED=3;		/*!< 创建录像文件失败 */
	public static final int JRS_CLOSE_PACKAGE_OK=4;				/*!< 关闭录像文件成功，收到json数据，详见：player_record */
	public static final int JRS_CLOSE_PACKAGE_FAILED=5;			/*!< 关闭录像文件失败 */
	public static final int JRS_WRITE_FAILED=6;					/*!< 写入失败 */
	public static final int JRS_STORE_THE_WARNING=7;			/*!< 存储空间不足*/
	public static final int JRS_STOP_RECORD=8;					/*!< 关闭录像 */

	/* JPET_INTERCOM 状态定义 */
	//public enum jav_intercom_state_e
	public static final int JIS_NONE=0;							/*!< 无状态 */
	public static final int JIS_START_OK=1;						/*!< 开始对讲成功 */
	public static final int JIS_START_FAILED=2;					/*!< 开始对讲失败 */
	public static final int JIS_BROKEN=3;						/*!< 对讲中断 */
	public static final int JIS_OVER=4;							/*!< 对讲结束 */

	/* JPET_DOWNLOAD 状态定义 */
	//enum jav_download_state_e
	public static final int JDS_NONE = 0;						/*!< 无状态 */
	public static final int JDS_START_DOWNLOAD_FAILED=1;		/*!< 开始下载失败 */
	public static final int JDS_CREATE_PACKAGE_OK=2;			/*!< 创建录像文件成功，收到json数据，详见：player_download */
	public static final int JDS_CREATE_PACKAGE_FAILED=3;		/*!< 创建下载文件失败 */
	public static final int JDS_CLOSE_PACKAGE_OK=4;				/*!< 关闭下载文件成功，收到json数据，详见：player_download */
	public static final int JDS_WRITE_FAILED=5;					/*!< 写入失败 */
	public static final int JDS_STORE_THE_WARNING=6;			/*!< 存储空间不足*/
	public static final int JDS_DOWNLOAD_OVER=7;				/*!< 下载完成 */
	public static final int JDS_PLAY_DOWNLOAD_POS=8;			/*!< 下载录像进度，详见json定义，method：player_download_pos */
	public static final int JDS_DOWNLOAD_LIMIT=9;				/*!< 设备支持的下载任务达到上限 */

	/* JPET_APCONFIG 状态定义 */
	// enum jav_ap_state_e
	public static final int JAS_NONE = 0;						/*!< 无状态 */
	public static final int JAS_CONNECT_FAIL = 1;				/*!< 连接设备失败 */
	public static final int JAS_CONNECT_OVERTIME = 2;			/*!< 无操作超时断开 */
	public static final int JAS_GET_WIFI_LIST_OK = 3;			/*!< 获取WIFI列表成功 */
	public static final int JAS_GET_WIFI_LIST_FAIL = 4;			/*!< 获取WIFI列表失败 */
	public static final int JAS_SET_WIFI_OK = 5;				/*!< 设置设备WIFI成功 */
	public static final int JAS_SET_WIFI_FAIL = 6;				/*!< 设置设备WIFI失败 */

    /**
     * @brief 初始化
     * @param object 事件回调对象，需实现void OnJavEvent(int player_id, int event_type, int event_state, String json_data);
     * @return 错误码
     */
    public static native int javPlayerInit( Object object );
    /**
     * @brief 释放资源
     * @return 无
     */
    public static native void javPlayerRelease();

	/**
	* @brief 日志配置，默认开启，默认路径为程序运行目录，需要先于jav_player_init调用
	* @param log_path 日志存放路径，utf8编码
	* @param log_level 日志级别，0：无日志，1：有日志，2...其他暂未定义
	* @return 无
	*/
    public static native void javPlayerLogConfig(String log_path, int log_level);

	/**
	* @brief 连接媒体
	* @param info 连接媒体所需的信息，支持：rtmp url、本地媒体文件路径:d:\1.mp4、平台返回的json串，utf8编码
	* @param channel_index 通道标号，从0开始，p2p连接时有效
	* @param stream_index 码流标号，从0开始，p2p连接时有效
	* @return 成功返回player_id，失败返回0
	*/
    public static native int javPlayerConnect(String info, int channel_index, int stream_index);

    /**
     * @brief 录像回放
     * @param p2p_info p2p连接所需的信息（平台返回的json串），utf8编码
     * @param channel_index 通道标号，从0开始
     * @param stream_index 码流标号，从0开始
     * @param begin_time rfc3999 格式的时间，如：2020-06-27T17:18:00.000+08:00
     * @param end_time rfc3999 格式的时间，如：2020-06-27T17:18:00.000+08:00
     * @return 播放器id
     */
    public static native int javPlayerPlayRecord(String p2p_info, int channel_index, int stream_index, String begin_time, String end_time);

    /**
     * @brief 断开连接，异步操作，无回调。所有返回的播放id都应调用此接口进行销毁
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerDisconnect(int player_id);

	/**
	* @brief 显示画面，可重复调用（设置显示区域），目前第二次以及后续的调用windows_id无效
	* @param player_id 播放器id
	* @param surface 窗口句柄（安卓平台传入surface，IOS平台传入view）
	* @param left 屏幕坐标，显示位置最左侧（手机平台传入0）
	* @param top 屏幕坐标，显示位置最顶侧（手机平台传入0）
	* @param right 屏幕坐标，显示位置最右侧（手机平台传入view的宽）
	* @param bottom 屏幕坐标，显示位置最底侧（手机平台传入view的高）
	* @return 无
	*/
    public static native void javPlayerShow(int player_id, Object surface, int left, int top, int right, int bottom);

    /**
    * @brief 是否按比例显示画面
    * @param player_id 播放器id
    * @param isratio 是否按比例显示（1：按比例显示，0：充满全屏）
    * @return 无
    */
    public static native void javPlayerRatio(int player_id, int isratio);

    /**
     * @brief 隐藏画面
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerHide(int player_id);

    /**
     * @brief 是否静音
     * @param player_id 播放器id
     * @param enable 0 静音， 1 播放
     * @return 无
     */
    public static native void javPlayerMute(int player_id, int enable);
    /**
     * @brief 请求I帧，直播模式下使用
     * @param player_id 播放器id
     * @return 0-成功, 失败-1
     */
    public static native int javPlayerRequestIFrame(int player_id);
    /**
     * @brief 直播暂停（暂停解码）
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerLivePause(int player_id);
    /**
     * @brief 恢复直播（继续解码）
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerLiveResume(int player_id);
    /**
     * @brief 回放暂停
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerPause(int player_id);
    /**
     * @brief 恢复回放
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerResume(int player_id);
    /**
     * @brief 单帧
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerStep(int player_id);
    /**
     * @brief 倍速
     * @param player_id 播放器id
     * @param speed 取值（-4~0~4）播放速度为：2^speed
     * @return 无
     */
    public static native void javPlayerSetSpeed(int player_id, int speed);
    /**
     * @brief 跳转
     * @param player_id 播放器id
     * @param time_pos rfc3999 格式的时间，如：2020-06-27T17:18:00.000+08:00
     * @return 无
     */
    public static native void javPlayerSkip(int player_id, String time_pos);

    /**
	* @brief 文件播放控制，跳转
	* @param player_id 播放器id
	* @param file_time_pos 时间偏移，单位毫秒，如：5000表示跳转到第5秒开始播放
	* @return 无
	*/
	public static native void javPlayerFileSkip(int player_id, int file_time_pos);

    /**
     * @brief 抓拍画面，适用于直播和回放
     * @param player_id 播放器id
	 * @param format 0：bmp，1：jpg，2：png其他暂不支持
     * @param fullname 抓图文件名（全路径）
     * @return 无
     */
    public static native void javPlayerSnapshot(int player_id, int format, String fullname);

    /**
     * @brief 开始录像
     * @param player_id 播放器id
     * @param format 0：mp4，其他暂不支持
     * @param save_path 存储路径
     * @param name_prefix 录像文件名前缀，录像名为：prefix_开始时间_结束时间.mp4
     * @return 无
     */
    public static native void javPlayerRecordStart(int player_id, int format, String save_path, String name_prefix);

    /**
     * @brief 停止录像
     * @param player_id 播放器id
     * @return 无
     */
    public static native void javPlayerRecordStop(int player_id);

	/**
	* @brief 开始下载
	* @param info p2p连接所需的信息（平台返回的json串），utf8编码
	* @param channel_index 通道标号，从0开始
	* @param stream_index 码流标号，从0开始
	* @param begin_time rfc3999 格式的时间，如：2020-06-27T17:18:00+08:00
	* @param end_time rfc3999 格式的时间，如：2020-06-27T17:18:00+08:00
	* @param format 0：mp4，其他暂不支持
	* @param save_path 存储路径
	* @param name_prefix 录像文件名前缀，录像名为：prefix_开始时间_结束时间.mp4
	* @return 无
	*/
	public static native int javPlayerDownloadTimeStart(String info, int channel_index, int stream_index, String begin_time, String end_time, int format, String save_path, String name_prefix);

	/**
	* @brief 开始下载，传入开始结束时间是内部为了计算文件总时长
	* @param info p2p连接所需的信息（平台返回的json串），utf8编码
	* @param file_name 按文件下载时需传入文件名
	* @param begin_time rfc3999 格式的时间，如：2020-06-27T17:18:00+08:00
	* @param end_time rfc3999 格式的时间，如：2020-06-27T17:18:00+08:00
	* @param format 0：mp4，其他暂不支持
	* @param save_path 存储路径
	* @param name_prefix 录像文件名前缀，录像名为：prefix_开始时间_结束时间.mp4
	* @return 无
	*/
	public static native int javPlayerDownloadFileStart(String info, String file_name, String begin_time, String end_time, int format, String save_path, String name_prefix);
	
	/**
	* @brief 暂停下载
	* @param player_id 播放器id
	* @return 无
	*/
	public static native void javPlayerDownloadPause(int player_id);

	/**
	* @brief 继续下载
	* @param player_id 播放器id
	* @return 无
	*/
	public static native void javPlayerDownloadResume(int player_id);

	/**
	* @brief 停止下载
	* @param player_id 播放器id
	* @return 无
	*/
	public static native void javPlayerDownloadStop(int player_id);
	
	/**
	* @brief 开启语音对讲
	* @param info 开启对讲所需的信息，支持：rtmp url、平台返回的json串（p2p）
	* @param channel_index 通道标号，从0开始，p2p连接时有效
	* @return 对讲id，失败返回0
	*/
    public static native int javPlayerIntercomStart(String info, int channel_index);

	/**
	* @brief 开启语音对讲，融视云平台
	* @param server_addr 服务器地址，形如：127.0.0.1:15050
	* @param dev_sn 设备SN
	* @param audio_codec 音频编码类型，字符串，例如："g711a" "g711u"
	* @param audio_channel 音频通道数
	* @param audio_sampling_rate 音频采样率
	* @param audio_sampling_bits 音频采样位宽
	* @return 对讲id，失败返回0
	*/
    public static native int javPlayerIntercomStartMix(String server_addr, String dev_sn, String audio_codec, int audio_channel, int audio_sampling_rate, int audio_sampling_bits);

	/**
	* @brief 停止语音对讲
	* @param player_id 对讲id
	* @return 无
	*/
	public static native void javPlayerIntercomStop(int player_id);
	
	/**
	* @brief base64编码
	* @param data 要编码的数据
	* @return 编码后的数据
	*/
	public static native String utlBase64Encode(String data);
	
	/**
	* @brief 解密aes加密的文件
	* @param src_file_full_name 源文件
	* @param key 密钥
	* @param iv 向量
	* @param dst_file_full_name 目标文件
	* @return 0：成功，<0：失败
	*/
	public static native int utlAesCbcDecryptFile(String src_file_full_name, String key, String iv, String dst_file_full_name);

	/**
	* @brief 开始播放声波
	* @param data 要生成声波的字符串
	* @param times 重复次数
	* @return 无
	*/
	public static native void utlStartSoundWave(String data, int times);

	/**
	* @brief 停止播放声波
	* @return 无
	*/
	public static native void utlStopSoundWave() ;

	/**
	* @brief 开始采集声音到文件（AAC编码格式ADTS文件格式），仅支持手机端，不能与语音对讲功能同时使用
	* @param channels 通道数，目前仅支持1通道
	* @param sample_rate 采样率，支持8000、16000
	* @param sample_bits 采样位宽，支持8、16
	* @param fullname aac文件路径
	* @return 无
	*/
	public static native void utlStartCollectSoundToAACFile(int channels, int sample_rate, int sample_bits, String fullname);

	/**
	* @brief 停止采集声音，结束文件写入
	* @return 无
	*/
	public static native void utlStopCollectSound();

	/**
	* @brief 播放aac格式的声音文件（AAC编码格式ADTS文件格式），仅支持手机端，不能与语音对讲功能同时使用
	* @param channels 通道数，目前仅支持1通道
	* @param sample_rate 采样率，支持8000、16000
	* @param sample_bits 采样位宽，支持8、16
	* @param fullname aac文件路径
	* @return 无
	*/
	public static native void utlPlayAACFile(int channels, int sample_rate, int sample_bits, String fullname);

	/**
	* @brief 停止播放aac声音文件
	* @return 无
	*/
	public static native void utlStopPlayAACFile();

	/**
	* @brief 获取AP配网wifi信息
	* @param username 设备连接用户名
	* @param password 设备连接密码
	*/
	public static native void utlAPGetWifiList(String username, String password);

	/**
	* @brief 设置设备wifi信息
	* @param username 设备连接用户名
	* @param password 设备连接密码
	* @param username wifi用户名
	* @param password wifi密码
	*/
	public static native void utlAPSetWifi(String username, String password, String wifiusername, String wifipassword);

}
