package servlet;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class UserDAO {
	
	private String resultFlag;
	private String reason;
	private String cardNo;
	private String signLevel;
	private String aab301;
	private String aac002;
	private String aac003;
	private String aaz501;
	
	public UserDAO() {
		super();
		this.resultFlag = "1";
		this.reason = "";
		this.cardNo = "341221199207046798";
		this.signLevel = "1";
		this.aab301 = "";
		this.aac002 = "341221199207046798";
		this.aac003 = "chenweijia";
		this.aaz501 = "";
	}
	public String getResultFlag() {
		return resultFlag;
	}
	public void setResultFlag(String resultFlag) {
		this.resultFlag = resultFlag;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getSignLevel() {
		return signLevel;
	}
	public void setSignLevel(String signLevel) {
		this.signLevel = signLevel;
	}
	public String getAab301() {
		return aab301;
	}
	public void setAab301(String aab301) {
		this.aab301 = aab301;
	}
	public String getAac002() {
		return aac002;
	}
	public void setAac002(String aac002) {
		this.aac002 = aac002;
	}
	public String getAac003() {
		return aac003;
	}
	public void setAac003(String aac003) {
		this.aac003 = aac003;
	}
	public String getAaz501() {
		return aaz501;
	}
	public void setAaz501(String aaz501) {
		this.aaz501 = aaz501;
	}
	
	@Override
	public String toString() {
		
		
		JSONObject para = new JSONObject();
		JSONObject extParam = new JSONObject();
		extParam.put("resultFlag", resultFlag);
		extParam.put("reason", reason);
		extParam.put("cardNo",cardNo);
		extParam.put("resultFlag", resultFlag);
		extParam.put("aab301", aab301);
		extParam.put("aac002",aac002);
		extParam.put("aac003", aac003);
		extParam.put("aaz501", aaz501);
		para.put("outData", extParam);
		
		para.put("code", "1");
		para.put("msg", "³É¹¦");
		para.put("sign", "");
		return para.toJSONString();
		
	}


}
