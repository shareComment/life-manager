package com.sfteam.wxzysh.utils;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * @ClassName: BizUtils.java
 * @Description: 业务工具类
 * @author knight
 * @date 2016年6月23日 下午3:09:32
 * @company sfteam
 */
public class BizUtil {

	/**
	 * 
	 * @Title: getSalt
	 * @Description: 随机盐值
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 上午10:56:59
	 */
	public final static String getSalt() {
		String base = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_+=<>?[]{}";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 9; i++) {
			int number = random.nextInt(base.length());
			sb.append(base.charAt(number));
		}
		return sb.toString();
	}

	/**
	 * 
	 * @Title: getUUID
	 * @Description: UUID
	 * @return: String
	 * @author: knight
	 * @date: 2016年7月9日 上午11:09:18
	 */
	public final static String getUUID() {
		String s = UUID.randomUUID().toString();
		return s.substring(0, 8) + s.substring(9, 13) + s.substring(14, 18)
				+ s.substring(19, 23) + s.substring(24);
	}

	/**
	 * 
	 * @Title: getTags
	 * @Description: 提取标签信息
	 * @author: knight
	 * @date: 2016年7月10日 下午2:49:12
	 */
	public final static String getTags(List<String> tagList) {
		StringBuffer sb = new StringBuffer();
		for (String tag : tagList) {
			sb.append(tag);
			sb.append(",");
		}
		return sb.toString();
	}

	/**
	 * 
	 * @Title: getTags
	 * @Description: 提取标签信息
	 * @author: knight
	 * @date: 2016年7月10日 下午3:57:29
	 */
	public final static List<String> getTags(String tags) {
		String[] str = tags.split(",");
		return Arrays.asList(str);
	}

	public final static List<String> duplicate(List<String> source,
			List<String> target) {
		List<String> result = new ArrayList<String>();
		for (String str : source) {
			if (!target.contains(str)) {
				result.add(str);
			}
		}
		return result;
	}

	public static String upload(String req_url, List<String> fileList)
			throws Exception {
		String BOUNDARY = "---------7d4a6d158c9"; // 定义数据分隔线
		URL url = new URL(req_url);
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		// 发送POST请求必须设置如下两行
		conn.setDoOutput(true);
		conn.setDoInput(true);
		conn.setUseCaches(false);
		conn.setRequestMethod("POST");
		conn.setRequestProperty("connection", "Keep-Alive");
		conn.setRequestProperty("user-agent",
				"Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; SV1)");
		conn.setRequestProperty("Charsert", "UTF-8");
		conn.setRequestProperty("Content-Type",
				"multipart/form-data; boundary=" + BOUNDARY);

		OutputStream out = new DataOutputStream(conn.getOutputStream());
		byte[] end_data = ("\r\n--" + BOUNDARY + "--\r\n").getBytes();// 定义最后数据分隔线
		int leng = fileList.size();
		for (int i = 0; i < leng; i++) {
			String fname = fileList.get(i);
			File file = new File(fname);
			StringBuilder sb = new StringBuilder();
			sb.append("--");
			sb.append(BOUNDARY);
			sb.append("\r\n");
			sb.append("Content-Disposition: form-data;name=\"file" + i
					+ "\";filename=\"" + file.getName() + "\"\r\n");
			sb.append("Content-Type:application/octet-stream\r\n\r\n");

			byte[] data = sb.toString().getBytes();
			out.write(data);
			DataInputStream in = new DataInputStream(new FileInputStream(file));
			int bytes = 0;
			byte[] bufferOut = new byte[1024];
			while ((bytes = in.read(bufferOut)) != -1) {
				out.write(bufferOut, 0, bytes);
			}
			out.write("\r\n".getBytes()); // 多个文件时，二个文件之间加入这个
			in.close();
		}
		out.write(end_data);
		out.flush();
		out.close();

		// 定义BufferedReader输入流来读取URL的响应
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				conn.getInputStream()));
		String line = null;
		StringBuffer sbf = new StringBuffer();
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			sbf.append(line);
		}
		return sbf.toString();
	}

	public static void main(String[] args) {
		List<String> source = new ArrayList<String>();
		source.add("最新热卖");
		source.add("驰名品牌");
		List<String> target = new ArrayList<String>();
		target.add("最新热卖");
		List<String> result = BizUtil.duplicate(source, target);
		for (String s : result)
			System.out.println(s);
	}
}
