package com.jovision.jvplayer;

public class Jni {
	static {
		System.loadLibrary("jvplayer");
	}

	/* 错误码定义 */
	//public enum jav_player_error_e
	public static final int JAV_PLAYER_ERROR_SUCCESS = 1000;							/*!< 成功 */
	public static final int JAV_PLAYER_ERROR_FAILED = 1001;								/*!< 失败 */
	public static final int JAV_PLAYER_ERROR_TIMEOUT = 1002;							/*!< 连接超时 */
	public static final int JAV_PLAYER_ERROR_VERITY_FAILED = 1004;						/*!< 认证失败 */
	public static final int JAV_PLAYER_ERROR_LIMITED = 1005;							/*!< 超过限制 */
	public static final int JAV_PLAYER_ERROR_OFFLINE = 1006;							/*!< 设备离线 */
	public static final int JAV_PLAYER_ERROR_INVALID_SN = 1007;							/*!< SN错误 */
	public static final int JAV_PLAYER_ERROR_INVALID_PARAM = 1008;						/*!< 无效参数 */
	public static final int JAV_PLAYER_ERROR_START_THREAD_FAILED = 1009;				/*!< 创建线程失败 */
	public static final int JAV_PLAYER_ERROR_ALLOC_MEMORY_FAILED = 1010;				/*!< 申请内存失败 */
	public static final int JAV_PLAYER_ERROR_CONNTION_BROKEN = 1011;					/*!< 连接中断 */
	public static final int JAV_PLAYER_ERROR_SERVICE_OCCUPIED = 1012;					/*!< 服务被占用，如对讲正被其他app占用 */
    public static final int JAV_PLAYER_ERROR_INTERCOM_NOT_SUPPORT = 1013;				/*!< 设备不支持对讲 */
    public static final int JAV_PLAYER_ERROR_DEV_NOT_ACTIVE = 1014;						/*!< 设备未激活 */
	public static final int JAV_PLAYER_ERROR_INIT_RES_FAILED = 1015;					/*!< 设备初始化资源失败，如：回放设备文件失败 */

    //云视通2.0错误码
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_INVALID_HANDLE = 2001;			/*!< -3:无效的句柄 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_USER_ABORT = 2002;				/*!< -4:用户中断请求 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_PARSE_ADDR_FAILED = 2003;		/*!< -5:地址解析失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_CREATE_SOCKET_FAILED = 2004;		/*!< -6:创建套接字失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_SYSTEM_CALL_FAILED = 2005;		/*!< -7:系统调用失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_CONNECT_FAILED = 2006;			/*!< -9:连接失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_REQUEST_TIMEOUT = 2008;			/*!< -13:操作超时 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_ALLOC_CONTEXT_FAILED = 2009;		/*!< -14:分配上下文失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_SERIAL_DATA_FAILED = 2010;		/*!< -18:序列化数据失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_PARSE_DATA_FAILED = 2011;		/*!< -19:解析数据失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_SEND_DATA_FAILED = 2012;			/*!< -20:发送数据失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_RECV_DATA_FAILED = 2013;			/*!< -21:接收数据失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_BIND_ADDR_FAILED = 2014;			/*!< -22:绑定地址失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_BIND_SERVICE_FAILED = 2015;		/*!< -23:绑定网络传输服务失败 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_SERVER_ERROR = 2016;				/*!< -28:服务器错误 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_PEER_NOT_READY = 2017;			/*!< -29:对端未就绪 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_PEER_HAVE_NO_RES = 2018;			/*!< -30:对端没有足够资源 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_RELAY_DURATION_LIMITED = 2019;	/*!< -35:超过单次连接转发时长限制 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_NO_SUCH_STREAM = 2020;			/*!< -36:没有符合条件的流 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_DIFFERENT_ENCRYPT_TYPE = 2021;	/*!< -38:加密类型不匹配 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_CONN_PROTOCOL_UNSUPPORT = 2022;	/*!< -40:设备侧不支持的连接协议 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE2_OPEN_FILE_FAILED = 2023;         /*!< -33:打开文件失败，设备上没有此文件 */

	//云视通1.0错误码
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_NO_CHANNEL_SERVICE = 3001;		/*!< No Channel service	客户自己解决不了，联系客服	请联系客服人员 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_DEVICE_TOO_OLD = 3002;			/*!< Local Version too old	请升级主控版本	主控版本太老，已不支持连接（请升级主控版本：2010年之前的设备会提示） */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_INVALID_CONNECT_TYPE = 3003;		/*!< connect type invalid	客户自己解决不了，联系客服	请联系客服人员 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_FORBIDDEN = 3004;				/*!< connect forbidden	客户自己解决不了，联系客服	请联系客服人员 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_RECHECK_ERROR = 3005;			/*!< Recheck error	更新设备版本，如果更新不了，联系客服	请更新设备版本，如果在更新过程中出现问题，请联系客服人员 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_REQUEST_FAILED = 3006;			/*!< Request video failed	网络状况差，检查网络是否正常	网络环境较差，请及时检查网络连接是否正常 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_JVN_RSP_DOWNLOADE = 3007;		/*!< 0x23//下载数据失败  */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_JVN_RSP_PLAYE = 3008;			/*!< 0x39//回放失败		 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_JVN_RSP_DLTIMEOUT = 3009;		/*!< 0x76//下载超时		 */
	public static final int JAV_PLAYER_ERROR_CLOUDSEE1_JVN_RSP_PLTIMEOUT = 3010;		/*!< 0x77//回放超时		 */

	//JVMP错误码
	public static final int JAV_PLAYER_ERROR_JVMP_UNKNOWN_ERROR = 4001;					/*!< 0x04:服务器未知错误		   */
	public static final int JAV_PLAYER_ERROR_JVMP_NOT_READY = 4002;						/*!< 0x05:服务器未准备好 		   */
	public static final int JAV_PLAYER_ERROR_JVMP_USER_ABORT = 4003;					/*!< 0x06:服务器端用户主动断开	*/
	public static final int JAV_PLAYER_ERROR_JVMP_STOPPED = 4004;						/*!< 0x07:服务器服务已停止		  */
	public static final int JAV_PLAYER_ERROR_JVMP_ABORT = 4005;							/*!< 0x08:服务器服务已中断		  */
	public static final int JAV_PLAYER_ERROR_JVMP_STREAM_STOP = 4006;					/*!< 0x09:服务器流停止			*/
	public static final int JAV_PLAYER_ERROR_JVMP_CONNECT_DEV_FAILED = 4007;			/*!< 0x0A:连接设备失败			*/
	public static final int JAV_PLAYER_ERROR_JVMP_SUBDEV_STREAM_ERR = 4008;				/*!< 0x0B:订阅设备流失败		   */
	public static final int JAV_PLAYER_ERROR_JVMP_INVALID_CONTEXT = 4009;				/*!< 0x0C:不合法的上下文		   */
	public static final int JAV_PLAYER_ERROR_JVMP_DEVICE_TIMEOUT = 4010;				/*!< 0x0D:设备超时				  */
	public static final int JAV_PLAYER_ERROR_JVMP_CLIENT_TIMEOUT = 4011;				/*!< 0x0E:客户端超时				 */
	public static final int JAV_PLAYER_ERROR_JVMP_OVER_DEV_LIMIT = 4012;				/*!< 0x0F:超过设备最大连接数		 */
	public static final int JAV_PLAYER_ERROR_JVMP_PERM_DENIED = 4013;					/*!< 0x10:无权限				   */
	public static final int JAV_PLAYER_ERROR_JVMP_DATA_TIMEOUT = 4014;					/*!< 0X11:数据超时				  */
	public static final int JAV_PLAYER_ERROR_JVMP_DEVICE_ABORT = 4015;					/*!< 0X12:服务器端设备主动断开	*/
	public static final int JAV_PLAYER_ERROR_JVMP_CONN_TIMEOUT = 4016;					/*!< 0X13:服务器端检测到app连接超时*/

    //2.0设备命令透传时，设备返回的错误码
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_METHOD_NOT_IMPLEMENTED = -32001;	/*!<Method not implemented 设备不支持			  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_UNKNOWN = -32002;					/*!<Unknown error 未知错误					  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_DEVICE_BUSY = -32003;				/*!<Device busy	设备忙					  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_FUNC_NOT_SUPPORT = -32004;		/*!<Function not support 设备不支持			  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_NO_FREE_RESOURCE = -32005;		/*!<No free resource 资源不足				  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_NO_FREE_MEMORY = -32006;			/*!<No free memory	内存不足			  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_OPERATION_REFUSED = -32007;		/*!<Operation refused 操作被拒绝			  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_ALREADY_OPENED = -32008;			/*!<Resource already opened	资源已打开		  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_ALREADY_CLOSED = -32009;			/*!<Resource already closed	资源已关闭		  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_TIMEOUT = -32010;					/*!<Timeout		操作超时		  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_RESOURCE_EXIST = -32011;			/*!<Resource already exist	资源已存在		  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_RESOURCE_NOT_EXIST = -32012;		/*!<Resource not exist		资源不存在		  */
	public static final int JAV_PLAYER_ERROR_GRPC_ERR_RESOURCE_IS_LATEST_VER = -32013;	/*!<Resource is already latest version. 资源已是最新版本*/
	
    //录像/下载功能，写文件时的错误码
    public static final int JAV_PLAYER_ERROR_STORAGE_CREATE_PACKAGE_FAILED = 5001;		/*!<创建录像文件失败*/
	public static final int JAV_PLAYER_ERROR_STORAGE_WRITE_PACKAGE_FAILED = 5002;		/*!<写入录像文件失败*/
	public static final int JAV_PLAYER_ERROR_STORAGE_NO_SPACE = 5003;					/*!<无可用空间*/


	/* SDK事件类型 */
	//public enum jav_player_event_type_e
	public static final int JPET_PLAY=0;						/*!< 播放事件，含直播和回放，事件状态详见： jav_play_state_e，无json数据*/
	public static final int JPET_PLAY_TIME_POS=1;				/*!< 播放时间点（回放），详见json定义，method：player_play_time_pos */
	public static final int JPET_PLAY_FILE_POS=2;				/*!< 播放文件位置（回放），详见json定义，method：player_play_file_pos */
	public static final int JPET_RECORD=3;						/*!< 录像事件 */
	public static final int JPET_INTERCOM=4;					/*!< 语音对讲事件 */
	public static final int JPET_DOWNLOAD=5;					/*!< 录像下载事件 */
	public static final int JPET_APCONFIG=6;					/*!< AP配网 */
	public static final int JPET_CLOUDSEE_TEXTDATA=7;			/*!< 云视通1.0，设备返回的配置信息，使用json格式回调给app，内容由app解析 */
	public static final int JPET_RECORD_DATES_QUERY=8;			/*!< 录像日期列表查询，详见json定义，method：player_record_dates_query */
	public static final int JPET_RECORDS_QUERY=9;				/*!< 录像查询，详见json定义，method：player_records_query */
	public static final int JPET_DOWNLOAD_FILE=10;				/*!< 文件下载事件，图片下载功能的回调 */

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
	public static final int JPS_CONNECT_USER_VERIFY_FAILED=11;	/*!< 连接失败，用户认证失败 */
	public static final int JPS_CONNECT_CLOUDSEE1_P2P_READY=12;	/*!< 云视通1.0的预穿透准备好了，app可以选择断开重连 */
	public static final int JPS_VIDEO_INFO_CLOUDSEE1_CHANGE=13;	/*!< 视频信息，收到此状态表明视频流改变，app需请求当前码流信息 */
	public static final int JPS_CONNECTION_INFO=14;				/*!< 连接信息，收到此状态可解析附带的json信息，格式参考jav_player_def.json中的connection_info */

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
	public static final int JRS_STOP_RECORD=8;					/*!< 停止录像，调用停止录像接口后回调 */
	public static final int JRS_STOP_RECORD2=9;					/*!< 播放库停止录像，配置了record_stop_when_stream_changed，且检测到码流参数发生了变化（App的枪球录像时需要） */

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
	public static final int JDS_START_DOWNLOAD_OK=10;			/*!< 开始下载成功 */
	public static final int JDS_BROKEN=11;						/*!< 下载中断 */

	/* JPET_APCONFIG 状态定义 */
	// enum jav_ap_state_e
	public static final int JAS_NONE = 0;						/*!< 无状态 */
	public static final int JAS_CONNECT_FAIL = 1;				/*!< 连接设备失败 */
	public static final int JAS_CONNECT_OVERTIME = 2;			/*!< 无操作超时断开 */
	public static final int JAS_GET_WIFI_LIST_OK = 3;			/*!< 获取WIFI列表成功 */
	public static final int JAS_GET_WIFI_LIST_FAIL = 4;			/*!< 获取WIFI列表失败 */
	public static final int JAS_SET_WIFI_OK = 5;				/*!< 设置设备WIFI成功 */
	public static final int JAS_SET_WIFI_FAIL = 6;				/*!< 设置设备WIFI失败 */

	/* JPET_DOWNLOAD_FILE 状态定义 */
	// enum jav_download_file_state_e
	public static final int JDFS_NONE = 0;						/*!< 无状态 */
	public static final int JDFS_START_OK = 1; 					/*!< 开始下载成功 */
	public static final int JDFS_START_FAILED = 2;				/*!< 开始下载失败 */
	public static final int JDFS_BROKEN = 3;					/*!< 下载中断 */
	public static final int JDFS_PROGRESS = 4;					/*!< 下载进度 */
	public static final int JDFS_OVER = 5;						/*!< 下载结束 */

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
	 * @brief 获取版本号信息，utf8编码
	 * @return 版本信息字符串
	 */
	public static native String javPlayerGetVersionDetail();

	/**
	 * @brief 日志配置，默认开启，默认路径为程序运行目录，需要先于javPlayerInit调用
	 * @param log_path 日志存放路径，utf8编码
	 * @param log_level 日志级别，0：无日志，1：所有日志，2：调试级别，3：信息级别。（app发布时，应将日志级别改为0或3，建议3）
	 * @return 无
	 */
	public static native void javPlayerLogConfig(String log_path, int log_level);

    /**
    * @brief 媒体SDK参数配置，如：是否启用回声消除
    * @param config json格式详见jav_player_def.json定义，utf8编码
    * @return 错误码
    */
	public static native int javPlayerConfig(String config);

	/**
	 * @brief 设置aksk，连接外网cloudsee1.0设备时需要，初始化sdk后调用一次
	 * @param host 鉴权服务器地址，示例：cloudsee.com; 错误示例：https://cloudsee.com, www.cloudsee.com
	 * @param port 鉴权服务器端口
	 * @param ak Access Key
	 * @param sk Secret Key
     * @return 0：成功，-1：失败
	 */
	public static native int javPlayerSetAkSk(String host, int port, String ak, String sk);

	/**
	 * @brief 连接媒体
	 * @param info 连接媒体所需的信息，支持：rtmp url、本地媒体文件路径:d:\1.mp4、平台返回的json串，utf8编码
	 * @param channel_index 通道标号，从0开始，p2p连接时有效
	 * @param stream_index 码流标号，p2p连接时有效，实时预览从0开始；传-1时，仅用作云视通1.0不预览实时流，获取设备信息等类似业务
	 * @return 成功返回player_id，失败返回0
	 */
	public static native int javPlayerConnect(String info, int channel_index, int stream_index);

	/**
	 * @brief 录像回放
	 * @param p2p_info p2p连接所需的信息（平台返回的json串），utf8编码
	 * @param channel_index 通道标号，从0开始
	 * @param stream_index 码流标号，从0开始
	 * @param begin_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @param end_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @return 播放器id
	 */
	public static native int javPlayerPlayRecord(String p2p_info, int channel_index, int stream_index, String begin_time, String end_time);

	/**
	 * @brief 录像回放，按文件
	 * @param p2p_info p2p连接所需的信息（平台返回的json串），utf8编码
	 * @param channel_index 通道标号，从0开始
	 * @param file_name 文件名，全路径
	 * @param begin_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @param end_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @return 播放器id
	 */
	public static native int javPlayerPlayRecordFile(String p2p_info, int channel_index, String file_name, String begin_time, String end_time);

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
	 * @brief 获取当前码流信息
	 * @param player_id 播放器id
	 * @return 码流信息，详细定义参考：jav_player_def.json
	 */
    public static native String javPlayerGetStreamInfo(int playerid);

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
	* @brief 设置只播I帧（解码器只解码关键帧，录像等功能仍然是全帧）
	* @param player_id 播放器id
	* @param enable I帧模式，1：全帧，2：只关键帧
	* @return 无
	*/
	public static native void javPlayerSetDecoderIFrameMode(int player_id, int mode);

	/**
	 * @brief 设置码流只发I帧（通知到发送码流的设备，此码流只发关键帧）
	 * @param player_id 播放器id
	 * @param mode I帧模式，1：全帧，2：只关键帧
	 * @return 无
	 */
	public static native void javPlayerSetStreamIFrameMode(int player_id, int mode);

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
	 * @param time_pos rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @return 无
	 */
	public static native void javPlayerSkip(int player_id, String  time_pos);

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
	 * @param begin_time rfc3339 格式的时间，如：2020-06-27T17:18:00+08:00
	 * @param end_time rfc3339 格式的时间，如：2020-06-27T17:18:00+08:00
	 * @param format 0：mp4，其他暂不支持
	 * @param save_path 存储路径
	 * @param name_prefix 录像文件名前缀，录像名为：prefix_开始时间_结束时间.mp4
	 * @return 成功返回player_id，失败返回0
	 */
	public static native int javPlayerDownloadTimeStart(String info, int channel_index, int stream_index, String begin_time, String end_time, int format, String save_path, String name_prefix);

	/**
	 * @brief 开始下载，传入开始结束时间是内部为了计算文件总时长
	 * @param info p2p连接所需的信息（平台返回的json串），utf8编码
	 * @param file_name 按文件下载时需传入文件名
	 * @param begin_time rfc3339 格式的时间，如：2020-06-27T17:18:00+08:00
	 * @param end_time rfc3339 格式的时间，如：2020-06-27T17:18:00+08:00
	 * @param format 0：mp4，其他暂不支持
	 * @param save_path 存储路径
	 * @param name_prefix 录像文件名前缀，录像名为：prefix_开始时间_结束时间.mp4
	 * @return 成功返回player_id，失败返回0
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
	 * @brief 语音对讲静音（全局静音，开启多个对讲时所有对讲都静音）
	 * @param player_id 播放器id
	 * @param enable 0 静音， 1 播放
	 * @return 无
	 */
	public static native void javPlayerIntercomMute(int player_id, int enable);

	/**
	 * @brief 语音对讲重启声音采集（修改对讲声音采集参数后带哦用，影响所有正在进行的对讲/喊话）
	 * @param player_id 播放器id
	 * @param enable 0 静音， 1 播放
	 * @return 无
	 */
	public static native void javPlayerIntercomAudioRestart(int player_id);

	/**
	 * @brief 开始下载图片
	 * @param info 连接所需的信息（平台返回的json串），utf8编码
	 * @param file_name 远程文件名（根据远程要求，需传入全路径）
	 * @param download_file_path 下载到本地后保存的文件名
	 * @return 成功返回player_id，失败返回0
	 */
	public static native int javPlayerDownloadPictureStart(String info, String file_name, String download_file_path);

	/**
	 * @brief 停止下载
	 * @param player_id 播放器id
	 * @return 无
	 */
	public static native void javPlayerDownloadPictureStop(int player_id);

	/**
	 * @brief 录像日期查询，查询存在录像的日期列表，结果在回调函数中返回
	 * @param info 连接所需的信息（参考jav_player_connect参数），utf8编码
	 * @param channel_index 通道标号，从0开始
	 * @param stream_index 码流标号，从0开始
	 * @param begin_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @param end_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @return 成功返回player_id，失败返回0
	 */
	public static native int javPlayerQueryRecordDates(String info, int channel_index, int stream_index, String begin_time, String end_time);

	/**
	 * @brief 录像查询，结果在回调函数中返回
	 * @param info 连接所需的信息（参考jav_player_connect参数），utf8编码
	 * @param channel_index 通道标号，从0开始
	 * @param stream_index 码流标号，从0开始
	 * @param begin_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @param end_time rfc3339 格式的时间，如：2020-06-27T17:18:00.000+08:00
	 * @return 成功返回player_id，失败返回0
	 */
	public static native int javPlayerQueryRecords(String info, int channel_index, int stream_index, String begin_time, String end_time);

	/**
	 * @brief 向设备发送控制命令（仅适用于cloudsee1.0协议的设备）
	 * @param player_id 播放器id
	 * @param data_type JVN_REQ_TEXT等命令，具体参考cloudsee1.0的命令定义
	 * @param data PACKET结构体的数据，具体参考RConfig.h中的定义
	 * @param data_size 数据大小
	 * @return 无
	 */
	public static native void javPlayerCloudseeSendData(int player_id, int data_type, byte[] data, int data_size);

	/**
	 * @brief 向设备发送控制命令（仅适用于cloudsee1.0协议的设备）
	 * @param player_id 播放器id
	 * @param data_type JVN_REQ_TEXT等命令，具体参考cloudsee1.0的命令定义
	 * @param isExtended 参考xwplay项目，或PACKET结构体的定义
	 * @param count 参考xwplay项目，或PACKET结构体的定义
	 * @param type 参考xwplay项目，或PACKET结构体的定义
	 * @param p1 参考xwplay项目，或PACKET结构体的定义
	 * @param p2 参考xwplay项目，或PACKET结构体的定义
	 * @param p3 参考xwplay项目，或PACKET结构体的定义
	 * @param data 参考xwplay项目，或PACKET结构体的定义
	 * @param data_size 数据大小
	 * @return 无
	 */
	public static native void javPlayerCloudseeSendSuperBytes(int player_id, int data_type, boolean isExtended, int count, int type, int p1, int p2, int p3, byte[] data, int data_size);
	public static native void javPlayerCloudseeSendBytes(int player_id, int data_type, byte[] data, int data_size);
	public static native void javPlayerCloudseeSendString(int player_id, int data_type, boolean isExtended, int count, int type, String data);
	public static native void javPlayerCloudseeSendPrimaryBytes(int player_id, int data_type, int packet_type, int packet_count, int extend_type, int extend_p1, int extend_p2, int extend_p3, byte[] data, int data_size);
	public static native void javPlayerCloudseeSendInteger(int player_id, int data_type, int data);

	/**
	 * @brief 向设备发送控制命令（仅适用于cloudsee1.0协议的设备）
	 * @param player_id 播放器id
	 * @param data_type 只发关键帧命令JVN_CMD_ONLYI和恢复满帧命令JVN_CMD_FULL
	 * @param data 数据内容
	 * @param data_size 数据大小
	 * @return 0:失败，1:成功，2:不支持
	 */
	public static native void javPlayerCloudseeSendCmd(int player_id, int data_type, byte[] data, int data_size);

	/**
	 * @brief 向设备发送控制命令（仅适用于cloudsee1.0协议的设备）
	 * @param player_id 播放器id
	 * @param data_type JVN_REQ_TEXT等命令，具体参考cloudsee1.0的命令定义
	 * @param text_type TEXT命令类型：TEXT_REMOTE_CONFIG=0x01, TEXT_AP=0x02, TEXT_GET_STREAM=0x03, TEXT_GET_PTZ=0x04
	 * @return 无
	 */
	public static native void javPlayerCloudseeSendTextData(int player_id, int data_type, int text_type);

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
    * @brief 获取录像文件信息
    * @param fullname 录像文件路径
    * @return 录像文件信息，json格式，utf8编码，详见jav_player_def.json
    */
    public static native String utlJavPlayerGetRecordFileInfo(String fullname);

	/**
	 * @brief 开始播放声波，新声波
	 * @param data 要生成声波的字符串
	 * @param times 重复次数
	 * @return 无
	 */
	public static native void utlStartSoundWave(String data, int times);

	/**
	 * @brief 开始播放声波，老声波
	 * @param data 要生成声波的字符串
	 * @param times 重复次数
	 * @return 无
	 */
	public static native void utlStartSoundWave2(String data, int times);

	/**
	 * @brief 停止播放声波
	 * @return 无
	 */
	public static native void utlStopSoundWave() ;

	/**
	 * @brief 开始采集声音到文件（AAC编码格式ADTS文件格式），仅支持手机端，不能与语音对讲功能同时使用
	 * @param channels 通道数，目前仅支持1通道
	 * @param sample_rate 采样率，支持8000、16000
	 * @param sample_bits 采样位宽，当前仅支持16
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
	 * @param sample_bits 采样位宽，当前仅支持16
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

    /**
    * @brief 预连接，添加设备，utf8编码（云视通1.0为预穿透/穿透成功后会在实况/回放的回调中收到P2P_READY状态，app可决定是否重连）
    * @param info 连接所需的信息（参考jav_player_connect参数），utf8编码
    * @return 0:成功，<0失败
    */
    public static native int utlJavPlayerPreConnectionAdd(String info);

    /**
    * @brief 预连接，移除设备，utf8编码
    * @param info 设备信息
    * @return 0:成功，<0失败
    */
    public static native int utlJavPlayerPreConnectionRemove(String info);

    /**
    * @brief 预连接，清空设备
    * @return 无
    */
    public static native void utlJavPlayerPreConnectionClear();

    /**
    * @brief 预连接，获取预连接设备数量
    * @return 设备数量
    */
    public static native int utlJavPlayerPreConnectionGetCount();

	/**
	 * @brief 获取2.0设备透传命令的服务地址
	 * @param 无
	 * @return 服务地址，形如：http://127.0.0.1:12345/, 使用时需追加上"/v1/udms/send_cmd"等服务名使用
	 */
	public static native String utlGetWebServiceUrl();

	/**
	 * @brief 给设备发送配置命令，仅支持云视通2.0设备
	 * @param info 连接所需的信息（参考jav_player_connect参数），utf8编码
	 * @param cmd 配置信息，参考设备grpc协议
	 * @return grpc协议返回字符串
	 */
	public static native String utlJavPlayerSendCmd(String info, String cmd);
}
