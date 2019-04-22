package myUtils;

import org.apache.commons.lang.StringUtils;

public class StringUtil {
	public static boolean hasText(String src){
	    
	    if (StringUtils.isBlank(src)) { //：判断源字符串是否有值，空引号(空白字符串)和空格          
			return true;
		} else {
            return false;
		}
	}
	public static boolean hasLength(String src){ //判断源字符串是否有值，空引号(空白字符串)
	    if (StringUtils.isEmpty(src)) {
	    	return true;
		} else {
			return false;
		}
		
	}
	public static boolean isMobile(String src){//是否为手机号码
	    String reg="[1][3587][0-9]{9}";//正则
	    if (src.matches(reg)) {
			return true;
		} else {
           return false;
		}
	}

	public static boolean isEmail(String src){//判断是否为邮箱 
	    String reg="\\w+@\\w+(.com|.con)";//正则
	    if (src.matches(reg)) {
			return true;
		} else {
           return false;
		}
	}

}
